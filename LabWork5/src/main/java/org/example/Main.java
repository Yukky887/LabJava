package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("-----------------Задание № 1-----------------");
        String[] words = {"0","1","2","3","4","5","6","7","8","9","5","0"};
        System.out.println("Повторяющиеся слова:");
        for(int i = 0;i<words.length;i++)
        {
            for(int j = i+1;j<words.length;j++)
            {
                if(words[i]==words[j])
                {
                    System.out.println(words[i]);
                }
            }
        }
        System.out.println("-----------------Задание № 2-----------------");
        Phonebook phonebook = new Phonebook();
        phonebook.add("Дмитрий",11111);
        phonebook.add("Егор",22222);
        phonebook.add("Михаил",33333);
        phonebook.add("Вадим",44444);
        phonebook.add("Александр",55555);

        System.out.println(phonebook.get("Дмитрий"));
        System.out.println(phonebook.get("Егор"));
        System.out.println(phonebook.get("Михаил"));
        System.out.println(phonebook.get("Вадим"));
        System.out.println(phonebook.get("Александр"));
    }
}