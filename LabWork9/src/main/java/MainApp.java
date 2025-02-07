import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.*;
import java.util.Objects;

public class MainApp {
    private static Connection connection;
    private static Statement statement;

    public static void main (String[] args) throws InvocationTargetException, IllegalAccessException {

        // Коты

        Object[] cats = new Cat[5];
        cats[0] = new Cat(0,"Барсик",10,10,1);
        cats[1] = new Cat(1,"Генадий",20,10,1);
        cats[2] = new Cat(2,"Маруся",40,30,1);
        cats[3] = new Cat(3,"Гриша",60,40,1);
        cats[4] = new Cat(4,"Мурзик",100,70,1);

        Class myClass = Cat.class;
        String text = "";
        String text0 = "";
        String[][] txt = new String[5][3];
        String obj = ((Table)myClass.getAnnotation(Table.class)).title();
        Field[] f = myClass.getDeclaredFields();


        for (Field i:f) {
            if (i.isAnnotationPresent(Column.class)){
                if (text != "") text+=", ";
                text += i.getName();}
        }

        for (Field i:f) {
            if (i.isAnnotationPresent(Column.class)){
                if (text0 != "") text0+=",";
                text0 += i.getName() + " " + checkIntOrString(i.getType()) + " ";}
        }

        Method[] ff = myClass.getDeclaredMethods();
        for (int j = 0;j < cats.length;j++) {
            for (int i = 0; i < f.length; i++) {
                if (f[i].isAnnotationPresent(Column.class)) txt[j][i] = texter(f[i].getType(),ff[i].invoke(cats[j]).toString());
            }

        }


        System.out.println(text);
        System.out.println(text0);
        if (myClass.isAnnotationPresent(Table.class))
            System.out.println(((Table)myClass.getAnnotation(Table.class)).title());
        try{
            connect();
            statement.executeUpdate("CREATE TABLE "+obj+" ("+text0+");");
            for (int i = 0; true; i++) {
                if (i>=5){
                    break;
                }
                StringBuilder sb = new StringBuilder("INSERT INTO ").append(obj).append(" (").append(text).append(") ").append("VALUES(").append(txt[i][2]+", ").append("\""+txt[i][0]+"\", ").append(txt[i][1]+");");

                System.out.println(sb.toString());

                statement.executeUpdate(sb.toString());
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            disconnection();
        }

        // Собаки

        Object[] dogs = new Dog[5];
        dogs[0] = new Dog(19,"Миша","Дворняга",10,1);
        dogs[1] = new Dog(19,"Вадим","Чихуа-хуа",10,1);
        dogs[2] = new Dog(18,"Саня","Алабай",30,1);
        dogs[3] = new Dog(19,"Егор","Мопс",40,1);
        dogs[4] = new Dog(19,"Дима","ХЗ",70,1);

        Class myClass2 = Cat.class;
        String textD = "";
        String text0D = "";
        String[][] txtD = new String[5][3];
        String objD = ((Table)myClass2.getAnnotation(Table.class)).title();
        Field[] fD = myClass2.getDeclaredFields();


        for (Field i:fD) {
            if (i.isAnnotationPresent(Column.class)){
                if (textD != "") textD+=", ";
                textD += i.getName();}
        }

        for (Field i:fD) {
            if (i.isAnnotationPresent(Column.class)){
                if (text0D != "") text0D+=",";
                text0D += i.getName() + " " + checkIntOrString(i.getType()) + " ";}
        }

        Method[] ffD = myClass2.getDeclaredMethods();
        for (int j = 0;j < dogs.length;j++) {
            for (int i = 0; i < f.length; i++) {
                if (f[i].isAnnotationPresent(Column.class)) txtD[j][i] = texter(fD[i].getType(),ffD[i].invoke(dogs[j]).toString());
            }

        }


        System.out.println(textD);
        System.out.println(text0D);
        if (myClass2.isAnnotationPresent(Table.class))
            System.out.println(((Table)myClass2.getAnnotation(Table.class)).title());
        try{
            connect();
            statement.executeUpdate("CREATE TABLE "+objD+" ("+text0D+");");
            for (int i = 0; true; i++) {
                if (i>=5){
                    break;
                }
                StringBuilder sbD = new StringBuilder("INSERT INTO ").append(objD).append(" (").append(text).append(") ").append("VALUES(").append(txtD[i][2]+", ").append("\""+txtD[i][0]+"\", ").append(txtD[i][1]+");");
                System.out.println(sbD.toString());

                statement.executeUpdate(sbD.toString());
            }
        }catch (SQLException e2){
            e2.printStackTrace();
        }finally {
            disconnection();
        }
    }

    public static String texter(Class a,Object b){
        if (a == int.class){
            return (String) b;
        }
        else{
            return (String) b;
        }
    }

    //проверка класса на то строка он или
    public static String checkIntOrString(Class a) {
        if (a == int.class)
            return "INTEGER";
        else
            return "VARCHAR";
    }

    public static void connect() throws SQLException{
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            statement = connection.createStatement();

        } catch (ClassNotFoundException | SQLException e) {
            throw  new SQLException("Не удалось подключиться");
        }
    }
    public static void disconnection(){
        try{
            statement.close();
        }catch (SQLException e){
            e.printStackTrace();
        }try{
            connection.close();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

}