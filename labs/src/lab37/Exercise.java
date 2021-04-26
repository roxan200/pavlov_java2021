package lab37;

import java.io.Serializable;

class Exercise implements Serializable {
    ExerciseOption option;
    long timeStart;
    long timeEnd;

    Exercise(ExerciseOption option) {
        this.option = option;
        this.timeStart = System.currentTimeMillis() / 1000;
    }

    static Exercise start(String input) {
        ExerciseOption opt = ExerciseOption.stringToEnum(input); //распознавание типа упражнения
        if (opt != null) {
            return new Exercise(opt);
        } else {
            System.out.println("Your option of exercise is not recognised!");
            return null;
        }
    }

    //зафиксировать время окончания
    void end() {
        timeEnd = System.currentTimeMillis() / 1000;
    }

    //потраченное время
    long getPassedTime() {
        return timeEnd - timeStart;
    }

    //количество сожжённых калорий
    long getCaloriesBurned() {
        return getPassedTime() * option.caloriesPerSec();
    }

    //вывод информации об упражнении на экран
    @Override
    public String toString() {
        return "Exercise: " + option + "; calories burned: " + getCaloriesBurned() +
                "; time passed: " + getPassedTime() + " seconds;";
    }
}