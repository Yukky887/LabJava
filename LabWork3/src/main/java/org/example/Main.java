package org.example;


import java.math.BigInteger;

import static java.lang.Integer.valueOf;

public class Main {

    public static void main(String[] args)
    {
        String[][] array = new String[][]{
                {"3", "273", "3", "3"},
                {"2", "11", "7", "5"},
                {"3", "2", "3", "7"},
                {"3", "2", "3", "11"}

        };
        try
        {
            System.out.println(transformAndSum(array));

        } catch (MyArraySizeException | MyArrayDataException|MyArrayException e)
        {
            e.printStackTrace();
        }
    }

    public static boolean isPrime(int number)
    {
        for (int i = 2; i <= Math.sqrt(number); i++)
        {
            if (number % i == 0)
                return false;
        }
        return true;
    }


    private static int transformAndSum(String[][] in) throws MyArraySizeException, MyArrayDataException, MyArrayException {
        int arrDim = 4;
        int sum = 0;

        // Проверяем, что у массива 4 основных измерения
        if (in.length != 4) {
            throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
        }
        // Т.к. размерность вложенных массивов может быть не всегда одинакова, то проверяем, что в каждом из 4-х основных измерений находится массив ровно из 4 элементов
        for (int i = 0; i < in.length; i++) {
            if (in[i].length != 4) {
                throw new MyArraySizeException(String.format("Размерность массива должна быть %dх%d.", arrDim, arrDim));
            }
        }
        // проверка на простоту
        int[][] array = new int[4][4];
        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                array[i][j] = valueOf(in[i][j]);
                Integer integer = array[i][j];
                //BigInteger bigInteger = BigInteger.valueOf(integer);
                //boolean probablePrime = bigInteger.isProbablePrime((int) Math.log(integer));
                boolean probablePrime = isPrime(integer);
                if(probablePrime == false)
                {
                    throw new MyArrayException(String.format("Не все числа являются простыми!!!"));
                }

            }
        }


        for (int i = 0; i < in.length; i++) {
            for (int j = 0; j < in[i].length; j++) {
                try {
                    sum += valueOf(in[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException(String.format("В ячейке [%d][%d] исходного массива находится не целое число %s.", i + 1, j + 1, in[i][j]));
                }
            }
        }

        return sum;
    }



}