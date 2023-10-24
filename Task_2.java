import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        // Користувач вводить число (до 20). Програма рахує суму усіх чисел до даного числа включно

        System.out.println("Введіть число любе число до 20.");
        Scanner task7 = new Scanner(System.in);

        if (!task7.hasNextInt()) {
            System.out.println("Помилка в введеному числі. Можливо, що введена буква. Введіть інше число.");
        } else {
            int userInput;
            userInput = task7.nextInt();
            if (userInput < 0) {
                System.out.println("Введене число менше нуля.");
            }
            else {
                int counter = 0;
                int answer = 0;
                while (counter <= userInput) {
                    answer += counter;
                    counter++;
                }
                System.out.println("Сума усіх чисел до даного числа включно дорівнює " + answer);
            }
        }
    }
}
