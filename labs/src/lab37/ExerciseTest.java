package lab37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExerciseTest {
    @Test
    @DisplayName("press up: корректный подсчёт калорий")
    void calorieCountingPressUp() {
        Exercise exer = Exercise.start("press up");
        long SleepSeconds = 2;
        try
        {
            Thread.sleep(SleepSeconds * 1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        assert exer != null;
        exer.end();

        Assertions.assertEquals(SleepSeconds * ExerciseOption.pressUp.pressUpCalories, exer.getCaloriesBurned());
    }

    @Test
    @DisplayName("skipping rope: корректный подсчёт калорий")
    void calorieCountingSkippingRope() {
        Exercise exer = Exercise.start("skipping rope");
        long SleepSeconds = 3;
        try
        {
            Thread.sleep(SleepSeconds * 1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        assert exer != null;
        exer.end();

        Assertions.assertEquals(SleepSeconds * ExerciseOption.skippingRope.skippingRopeCalories, exer.getCaloriesBurned());
    }

    @Test
    @DisplayName("squats: корректный подсчёт калорий")
    void calorieCountingSquats() {
        Exercise exer = Exercise.start("squats");
        long SleepSeconds = 4;
        try
        {
            Thread.sleep(SleepSeconds * 1000);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
        assert exer != null;
        exer.end();

        Assertions.assertEquals(SleepSeconds * ExerciseOption.squats.squatsCalories, exer.getCaloriesBurned());
    }
}