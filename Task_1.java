import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        //Користувач вводить число (від 1 до 10). Вивести йому таблицю множення для даного числа

        System.out.println("Введіть число від 1 до 10.");
        Scanner task7 = new Scanner(System.in);

        if (!task7.hasNextInt()) {
            System.out.println("Помилка в введеному числі. Можливо, що введена буква. Введіть інше число.");
        }
        else {
            int userInput;
            userInput = task7.nextInt();

            int counter = 1;
            int upperBound = 10;
            int answer;

            if (userInput > upperBound) {
                System.out.println("Введене число більше 10. Введіть число менше 10");
            } else if (userInput < 0){
                System.out.println("Введене число менше 0. Введіть число від 1 до 10.");
            }
            else if (userInput == 0) {
                System.out.println("Введене число дорівнює 0. Введіть число від 1 до 10.");
            }
            else {
                while (counter <= upperBound){
                    answer = counter * userInput;
                    System.out.println(userInput + " * " + counter + " = " + answer);
                    counter++;
                }
            }
        }
    }
}
