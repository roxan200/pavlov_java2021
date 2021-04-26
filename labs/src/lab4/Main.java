package lab4;

import java.util.ArrayList;
import java.util.Random;

/*
* Напишите обобщенный метод для перестановки двух элементов в списке по индексам. Напишите junit-тесты.
* */

public class Main {
    public static <T> boolean swap(int i, int j, ArrayList<T> aList) {
        if (i >= aList.size() && j >= aList.size()) {
            return false;
        }

        T temp = aList.get(i);
        aList.set(i, aList.get(j));
        aList.set(j, temp);

        return true;
    }

    public static void main(String[] args) {
        final int SIZE = 5;
        Random rand = new Random();
        ArrayList<Integer> listInt = new ArrayList<>();
        ArrayList<Double> listDouble = new ArrayList<>();
        ArrayList<String> listString = new ArrayList<>();

        for (int i = 0; i < SIZE; ++i) {
            listInt.add(rand.nextInt(98) + 1);
            double val = Math.round((rand.nextDouble() * 98 + 1) * 100) / 100.0;
            listDouble.add(val);
            listString.add(String.valueOf((char)(rand.nextInt(90 - 65) + 65)));
        }

        int index11 = 1, index12 = 3, index21 = 2, index22 = 4, index31 = 0, index32 = 2;

        System.out.println("a[" + index11 + "] = " + listInt.get(index11) + "; a[" + index12 + "] = " + listInt.get(index12));
        swap(index11, index12, listInt);
        System.out.println("a[" + index11 + "] = " + listInt.get(index11) + "; a[" + index12 + "] = " + listInt.get(index12));

        System.out.println("\nb[" + index21 + "] = " + listDouble.get(index21) + "; b[" + index22 + "] = " + listDouble.get(index22));
        swap(index21, index22, listDouble);
        System.out.println("b[" + index21 + "] = " + listDouble.get(index21) + "; b[" + index22 + "] = " + listDouble.get(index22));

        System.out.println("\nc[" + index31 + "] = " + listString.get(index31) + "; c[" + index32 + "] = " + listString.get(index32));
        swap(index31, index32, listString);
        System.out.println("c[" + index31 + "] = " + listString.get(index31) + "; c[" + index32 + "] = " + listString.get(index32));
    }
}