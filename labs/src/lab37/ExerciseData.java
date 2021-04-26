package lab37;

import java.io.*;
import java.util.ArrayList;

class ExerciseData implements Serializable {
    private String datafile;
    ArrayList<Exercise> pastExercises;

    ExerciseData(String datafile) {
        this.datafile = datafile;
        pastExercises = new ArrayList<>();
    }

    void addExercise(Exercise exercise) {
        pastExercises.add(exercise);
    }

    Exercise getExercise(int index) {
        return pastExercises.get(index);
    }

    //импорт сохранённых данных
    void readData() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(datafile))) {
            pastExercises = (ArrayList<Exercise>) ois.readObject();
            System.out.println("The file was read successfully");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: readData");
        }
    }

    //экспорт данных
    void writeData() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(datafile))) {
            oos.writeObject(this.pastExercises);
            System.out.println("The file was written successfully");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error: writeData");
        }
    }

    //вывод информации об упражнении на экран
    @Override
    public String toString() {
        long totalCaloriesBurned = pastExercises.stream().map(Exercise::getCaloriesBurned).reduce(0L, Long::sum);
        return pastExercises.stream().map(Exercise::toString).reduce("", (s1, s2) -> s1 + "\n" + s2)
                + "\nTotal calories burned: " + totalCaloriesBurned;
    }
}