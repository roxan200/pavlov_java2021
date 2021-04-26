package lab3;

import java.util.ArrayList;
import java.util.Random;
/*
Имеется класс Spaceship. Создайте 3 экземпляра. Напишите методы, которые находят:
a) среднюю скорость кораблей
б) минимальную скорость кораблей
*/

public class Main {
    public static double averageSpeed(ArrayList<Spaceship> ships) {
        double result = 0.;
        for (Spaceship ship : ships) {
            result += ship.getSpeed();
        }
        return result / ships.size();
    }

    public static int minSpeed(ArrayList<Spaceship> ships) {
        int minimum = Integer.MAX_VALUE;
        for (Spaceship ship : ships) {
            if (ship.getSpeed() < minimum) {
                minimum = ship.getSpeed();
            }
        }
        return minimum;
    }

    public static void main(String[] args) {
        ArrayList<Spaceship> sList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 3; ++i) {
            sList.add(new Spaceship(rand.nextInt(98) + 1));
            System.out.print("[" + i + "] = " + sList.get(i).getSpeed() + "; ");
        }

        System.out.println("\n\nAverage Speed = " + averageSpeed(sList));
        System.out.println("Minimum Speed = " + minSpeed(sList));
    }
}