package lab4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class lab4Tests {
    public static <T> boolean swap(int i, int j, ArrayList<T> aList) {
        if (i >= aList.size() && j >= aList.size()) {
            return false;
        }

        T temp = aList.get(i);
        aList.set(i, aList.get(j));
        aList.set(j, temp);

        return true;
    }

    @Test
    @DisplayName("Integer: swap -> assertNotEquals -> swap -> assertEquals")
    void swapInteger() {
        ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> listInt2 = new ArrayList<>(listInt);

        swap(1, 3, listInt);
        Assertions.assertAll(() -> assertNotEquals(listInt.get(1), listInt2.get(1)),
                () -> assertNotEquals(listInt.get(3), listInt2.get(3)));
        swap(1, 3, listInt);
        assertEquals(listInt.get(1), listInt2.get(1));
        assertEquals(listInt.get(3), listInt2.get(3));
        Assertions.assertAll(() -> assertEquals(listInt.get(1), listInt2.get(1)),
                () -> assertEquals(listInt.get(3), listInt2.get(3)));
    }

    @Test
    @DisplayName("Double: swap -> assertNotEquals -> swap -> assertEquals")
    void swapDouble() {
        ArrayList<Double> listDouble = new ArrayList<>(Arrays.asList(1.2, 3.4, 5.6, 7.8, 9.1));
        ArrayList<Double> listDouble2 = new ArrayList<>(listDouble);

        swap(1, 3, listDouble);
        Assertions.assertAll(() -> assertNotEquals(listDouble.get(1), listDouble2.get(1)),
                () -> assertNotEquals(listDouble.get(3), listDouble2.get(3)));
        swap(1, 3, listDouble);
        Assertions.assertAll(() -> assertEquals(listDouble.get(1), listDouble2.get(1)),
                () -> assertEquals(listDouble.get(3), listDouble2.get(3)));
    }

    @Test
    @DisplayName("String: swap -> assertNotEquals -> swap -> assertEquals")
    void swapString() {
        ArrayList<String> listString = new ArrayList<>(Arrays.asList("i am", "sorry.", "Sorry", "for", "what?"));
        ArrayList<String> listString2 = new ArrayList<>(listString);

        swap(1, 3, listString);
        Assertions.assertAll(() -> assertNotEquals(listString.get(1), listString2.get(1)),
                () -> assertNotEquals(listString.get(3), listString2.get(3)));
        swap(1, 3, listString);
        Assertions.assertAll(() -> assertEquals(listString.get(1), listString2.get(1)),
                () -> assertEquals(listString.get(3), listString2.get(3)));
    }
}