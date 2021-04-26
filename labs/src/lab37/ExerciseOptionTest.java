package lab37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class ExerciseOptionTest {

    @Test
    @DisplayName("press up: Корректный перевод String в ExerciseOption")
    void stringToEnumPressUp() {
        ArrayList<String> listOptions = new ArrayList<>(Arrays.asList("press up start", "press-up start", "start press up",
                "press start up", "start press-up", "press-start-up"));

        Assertions.assertEquals(ExerciseOption.pressUp, ExerciseOption.stringToEnum(listOptions.get(0)));
        Assertions.assertEquals(ExerciseOption.pressUp, ExerciseOption.stringToEnum(listOptions.get(1)));
        Assertions.assertEquals(ExerciseOption.pressUp, ExerciseOption.stringToEnum(listOptions.get(2)));
        Assertions.assertNull(ExerciseOption.stringToEnum(listOptions.get(3)));
        Assertions.assertEquals(ExerciseOption.pressUp, ExerciseOption.stringToEnum(listOptions.get(4)));
        Assertions.assertNull(ExerciseOption.stringToEnum(listOptions.get(5)));
    }

    @Test
    @DisplayName("skipping rope: Корректный перевод String в ExerciseOption")
    void stringToEnumSkippingRope() {
        ArrayList<String> listOptions = new ArrayList<>(Arrays.asList("squats start", "start squats", "start quotes"));

        Assertions.assertEquals(ExerciseOption.squats, ExerciseOption.stringToEnum(listOptions.get(0)));
        Assertions.assertEquals(ExerciseOption.squats, ExerciseOption.stringToEnum(listOptions.get(1)));
        Assertions.assertNull(ExerciseOption.stringToEnum(listOptions.get(2)));
    }

    @Test
    @DisplayName("squats: Корректный перевод String в ExerciseOption")
    void stringToEnumSquats() {
        ArrayList<String> listOptions = new ArrayList<>(Arrays.asList("skipping rope start", "start skipping rope",
                "skipping start rope", "skipping-start-rope", "rope start skipping"));

        Assertions.assertEquals(ExerciseOption.skippingRope, ExerciseOption.stringToEnum(listOptions.get(0)));
        Assertions.assertEquals(ExerciseOption.skippingRope, ExerciseOption.stringToEnum(listOptions.get(1)));
        Assertions.assertEquals(ExerciseOption.skippingRope, ExerciseOption.stringToEnum(listOptions.get(2)));
        Assertions.assertEquals(ExerciseOption.skippingRope, ExerciseOption.stringToEnum(listOptions.get(3)));
        Assertions.assertEquals(ExerciseOption.skippingRope, ExerciseOption.stringToEnum(listOptions.get(4)));
    }
}
