package lab37;
import java.util.Scanner;

/*
* Приложение позволяет указать вид тренировки: отжимание, скакалка, приседания. Доступны команды:
* начать тренировку, закончить тренировку.
* За отработанное время высчитывается количество потраченных калорий по формуле K*t=cal,
* где K - количество калорий в секунду, затрачиваемое на определенный вид тренировки,
* t - время, засеченное трекером. От запуска к запуску программы данные должны сохраняться и общее количество калорий - суммироваться.
* */

public class Main {
    public static void main(String[] args) {
        Exercise performingExercise = null;                                     //текущее упражнение
        Scanner scan = new Scanner(System.in);                                  //ввод типа упражнения
        ExerciseData data;
        data = new ExerciseData("data");                                 //журнал упражнений
        data.readData();                                                        //импорт сохранённых данных

        while (true) {
            if (performingExercise == null) {
                System.out.println("\nChoose next exercise: press up, skipping rope, squats; and type \"start\"");
            }
            String input = scan.nextLine();                                     //ввод типа упражнения
            if (input.contains("start")) {
                if (performingExercise == null) {
                    performingExercise = Exercise.start(input);                 //начать упражнение
                    System.out.println("Exercise is started");
                } else {
                    System.out.println("Other exercise is already in progress. Type \"end\" to finish it.");
                }
            } else if (input.contains("end") || input.contains("finish")) {
                if (performingExercise == null) {
                    System.out.print("You are doing nothing");
                } else {
                    performingExercise.end();                                   //зафиксировать время окончания
                    System.out.println(performingExercise);
                    data.addExercise(performingExercise);
                    data.writeData();                                           //протоколирование последнего упражнения
                    performingExercise = null;                                  //текущее упражнение обнуляется
                }
            } else if (input.contains("quit") || input.contains("exit")) {      //завершение приложения
                break;
            } else if (input.contains("output") || input.contains("data")) {    //вывести данные на экран
                System.out.println(data.toString());
            }
        }
    }
}