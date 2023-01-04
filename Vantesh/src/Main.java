import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//strings
String message = "hello Vantesh";
        System.out.println(message.replace("Vantesh", "Victor"));
        //ARRAYS; used to list a list of items
        int [] numbers = new int [6];
        numbers[0]= 1;
        numbers[1]=2;
        numbers[3]=3;
        numbers[4]=4;
        numbers[5]=5;  System.out.println(Arrays.toString(numbers));
        /*constants
        We use Constants to allow some values not to change in the future
         */
final float pi = 3.42f;
int Radius= 7;
double sum= Radius * pi;

        System.out.println(sum);}
}