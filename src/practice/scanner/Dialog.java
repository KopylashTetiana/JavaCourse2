package practice.scanner;
import java.util.Scanner;
public class Dialog {
    private int price;
           public static void main(String[] args) {
            Scanner test = new Scanner(System.in);
            System.out.println("Hello! What is your name?");
            String name = test.nextLine();
            System.out.println("I'm wery glad to see you, " + name + '.');
            System.out.println("How old are you?");
            if (test.hasNextInt()) {
                int age = test.nextInt();
                if (age <= 12) {
                    System.out.println("Wow, you are the child yet.");
                }
                else if (age <=19) {
                    System.out.println("You are so young! OK.");
                }
                else System.out.println("Fine! You are " + age + " years old.");
            } else {
                System.out.println("Ошибка. Введите пожалуйста число!");
            }
    }
}
