import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        Logical Operators are used to connect two or more expressions
        && = (AND) both conditions must be true
        ||= (OR) Either Condition must be true
        != Reverses boolean Value of condition

         */


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Temperature: ");
        int Temp = scanner.nextInt();

        if (Temp > 40) {
            System.out.println("It's Very Hot Today you should consider wearing light clothes");

        }
        else if (Temp > 20 && Temp <= 40) {
            System.out.println("It's moderate today yoy should consider wearing normal clothes");

        }
        else {
            System.out.println("It's very cold today you should consider wearing heavy clothes");


        }
    }
}