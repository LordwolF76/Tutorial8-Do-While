import java.util.Scanner;

/**
 * Created by LordwolF on 7/31/2016.
 */
public class Application {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        /*

        System.out.println("Enter a number");

        int value = scanner.nextInt();

        while(value !=5) {
        System.out.println("Enter a number: ");
        value = scanner.nextInt();
        }

        */
        int value = 0;
        do {
            System.out.println("Enter a Number: ");
            value = scanner.nextInt();
        }
        while(value != 5);

        System.out.println("Got 5!");
    }
}
