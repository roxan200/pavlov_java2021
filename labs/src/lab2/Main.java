package lab2;

import java.util.Random;

/*
* реализуйте метод int min(int a, int b, int c),
* находящий минимальный из трех аргументов без использования утилитарных функций стандартной библиотеки Java.
* */

public class Main {
    public static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(98) + 1, b = rand.nextInt(98) + 1, c = rand.nextInt(98) + 1;

        System.out.println("a = " + a + "; b = " + b + "; c = " + c);
        System.out.println("minimum element = " + min(a, b, c));
    }
}
