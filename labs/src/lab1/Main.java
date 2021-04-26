package lab1;

import java.util.Random;

/*
* реализуйте метод boolean swap(int i, int j, int[] anArray),
* меняющий местами элементы по индексам i и j в массиве anArray
* и возвращающий false, если индексы выходят за пределы массива
* */

public class Main {
    public static boolean swap(int i, int j, int[] anArray) {
        if (i >= anArray.length && j >= anArray.length) {
            return false;
        }
        int temp = anArray[i];
        anArray[i] = anArray[j];
        anArray[j] = temp;
        return true;
    }

    public static void main(String[] args) {
        int i = 3, j = 7;
        int[] anArray = new int[10];
        Random rand = new Random();

        for (int index = 0; index < anArray.length; ++index) {
            anArray[index] = rand.nextInt(98) + 1;
        }

        System.out.println("i = " + anArray[i] + "; j = " + anArray[j]);
        System.out.println(swap(i, j, anArray));
        System.out.println("i = " + anArray[i] + "; j = " + anArray[j]);
    }
}
