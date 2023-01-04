import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

      /* Switch is a statement that allows a variable to be tested for equality against a list of values
         its good to use switches when you find yourself repeating if statements more often
          */


        // Using switches to Create a terminal Calculator

        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter First Number: ");
        double FirstNum = scanner.nextInt();
        System.out.println("Enter Second Number: ");
        double SecondNum = scanner.nextInt();
        System.out.println("Enter Operator: ");
        String Operator = scanner.next();

        switch (Operator){
            case "+": double Sum = FirstNum+ SecondNum;
                System.out.println("The Sum Is: "+ Sum);
                break;
            case "-": double Sub = FirstNum- SecondNum;
                System.out.println("The Subtraction Is: "+ Sub);
                break;
            case "/":  double div = FirstNum/ SecondNum;
                System.out.println("The Division Is: "+ div);
                break;
            case "*": double Multiplication = FirstNum* SecondNum;
                System.out.println("The Multiplication Is: "+ Multiplication);
                break;
        }





    }
}