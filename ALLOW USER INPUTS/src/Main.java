import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    // HOW TO ALLOW USER INPUTS IN JAVA
        Scanner scanner= new Scanner (System.in);
        System.out.println("Input First Num: ");
        int FirstNum= scanner.nextInt();
        System.out.println("Input Second Num: ");
        int SecondNum = scanner.nextInt();
        int sum =FirstNum + SecondNum;
        System.out.println("The sum of the number is: " + sum);




    }
}