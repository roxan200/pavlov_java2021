package lab5;

import java.util.ArrayList;
import java.util.Random;

/*
* Напишите обобщенный метод для поиска минимального элемента списка в диапазоне [begin, end).
* Где [ – включительно, ) – исключительно. Напишите junit-тесты.
* */

public class Main {
    //begin - inclusive, end - exclusive
    public static <T extends Comparable<T>> T min(int begin, int end, ArrayList<T> aList) {
        T minimum = aList.get(begin);
        for (int i = begin; i < end; ++i) {
            if (aList.get(i).compareTo(minimum) < 0) {
                minimum = aList.get(i);
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        final int SIZE = 5;
        Random rand = new Random();
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<Double> listDouble = new ArrayList<>();
        ArrayList<Character> listChar = new ArrayList<>();

        for (int i = 0; i < SIZE; ++i) {
            listInt.add(rand.nextInt(98) + 1);
            double val = Math.round((rand.nextDouble() * 98 + 1) * 100) / 100.0;
            listDouble.add(val);
            listChar.add((char)(rand.nextInt(90 - 65) + 65));
        }

        System.out.println(listInt);
        System.out.println("minimum element: " + min(1, 4, listInt));
        System.out.println(listDouble);
        System.out.println("minimum element: " + min(0, 3, listDouble));
        System.out.println(listChar);
        System.out.println("minimum element: " + min(2, 4, listChar));
    }
}