package lab5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class lab5Tests {
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

    @Test
    @DisplayName("minimum integer")
    void minInteger() {
        ArrayList<Integer> listInt = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        Assertions.assertEquals(2, min(1, 4, listInt));
    }

    @Test
    @DisplayName("minimum double")
    void minDouble() {
        ArrayList<Double> listDouble = new ArrayList<>(Arrays.asList(1.2, 3.4, 5.6, 7.8, 9.1));

        Assertions.assertEquals(3.4, min(1, 4, listDouble));
    }

    @Test
    @DisplayName("minimum char")
    void minCharacter() {
        ArrayList<Character> listCharacter = new ArrayList<>(Arrays.asList('h', 'g', 'c', 'b', 'a'));

        Assertions.assertEquals('b', min(1, 4, listCharacter));
    }
}