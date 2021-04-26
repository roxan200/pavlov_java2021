package lab29;
import java.util.*;

/*
* Создать 10 случайных фигур Circle, Triangle, Rectangle со случайными параметрами – радиусом, длиной стороны.
Все классы фигур имплементируют интерфейс Shape с одним методом getArea():double, возвращающим площадь фигуры.
Найти фигуру с максимальной площадью, вывести информацию о ней: тип фигуры, параметры фигуры.
* */

public class Main {
    public static void main(String[] args) {
        final int SIZE = 10;
        ArrayList<Shape> shapes = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < SIZE; ++i) {
            switch (random.nextInt(3)) {
                case 0 -> shapes.add(new Circle(random.nextInt(49) + 1));
                case 1 -> shapes.add(new Triangle(random.nextInt(99) + 1, random.nextInt(99) + 1));
                case 2 -> shapes.add(new Rectangle(random.nextInt(99) + 1, random.nextInt(99) + 1));
            }
        }

        for (Shape s : shapes) {
            System.out.print(s);
        }
        System.out.print("\nThe largest figure:\n" + shapes.stream().max(Comparator.comparing(Shape::getArea)).get());
    }
}