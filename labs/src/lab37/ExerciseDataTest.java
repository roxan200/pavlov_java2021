package lab37;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ExerciseDataTest {

    @Test
    @DisplayName("press up: корректная сериализация и десериализация")
    void serializeAndDeserializePressUp() {
        String filename1 = "test1";
        ExerciseData data1;
        data1 = new ExerciseData(filename1);

        Exercise exer1 = Exercise.start("press up");
        assert exer1 != null;
        exer1.end();
        data1.addExercise(exer1);

        data1.writeData();
        data1.readData();

        Assertions.assertEquals(exer1.option, data1.getExercise(0).option);
        Assertions.assertEquals(exer1.timeStart, data1.getExercise(0).timeStart);
        Assertions.assertEquals(exer1.timeEnd, data1.getExercise(0).timeEnd);
    }

    @Test
    @DisplayName("skipping rope: корректная сериализация и десериализация")
    void serializeAndDeserializeSkippingRope() {
        String filename2 = "test2";
        ExerciseData data2 = new ExerciseData(filename2);

        Exercise exer2 = Exercise.start("skipping rope");
        assert exer2 != null;
        exer2.end();
        data2.addExercise(exer2);

        data2.writeData();
        data2.readData();

        Assertions.assertEquals(exer2.option, data2.getExercise(0).option);
        Assertions.assertEquals(exer2.timeStart, data2.getExercise(0).timeStart);
        Assertions.assertEquals(exer2.timeEnd, data2.getExercise(0).timeEnd);
    }

    @Test
    @DisplayName("squats: корректная сериализация и десериализация")
    void serializeAndDeserializeSquats() {
        String filename3 = "test3";
        ExerciseData data3 = new ExerciseData(filename3);

        Exercise exer3 = Exercise.start("squats");
        assert exer3 != null;
        exer3.end();
        data3.addExercise(exer3);

        data3.writeData();
        data3.readData();

        Assertions.assertEquals(exer3.option, data3.getExercise(0).option);
        Assertions.assertEquals(exer3.timeStart, data3.getExercise(0).timeStart);
        Assertions.assertEquals(exer3.timeEnd, data3.getExercise(0).timeEnd);
    }
}
