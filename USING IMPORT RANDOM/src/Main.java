import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Generates Random Number
        Random randomNum= new Random();
        int x= randomNum.nextInt();
        System.out.println(x);

        //Generates Random Number Between 1-6
        Random ranNum= new Random();
        int y = ranNum.nextInt(6)+1;
        System.out.println(y);
    }
}