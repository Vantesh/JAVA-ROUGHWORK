
import javax.swing.*;


public class Main {
    public static void main(String[] args) {

        // Calculator Using  if statements


        int FirstNum = Integer.parseInt(JOptionPane.showInputDialog("Enter First Num"));

        int SecondNum = Integer.parseInt(JOptionPane.showInputDialog("Enter Second Num"));
        String operator = JOptionPane.showInputDialog("Enter Operator");


        if (operator.equals("+")) {
            int Sum = FirstNum + SecondNum;
            JOptionPane.showMessageDialog(null, "The Sum is " + Sum);
        }
        else if (operator.equals("-")) {
            int Sub = FirstNum - SecondNum;
            JOptionPane.showMessageDialog(null, "The Subtraction is " + Sub);

        }
        else if (operator.equals("*")){
            int multiply = FirstNum * SecondNum;
            JOptionPane.showMessageDialog(null, "The Multiplication is "+ multiply);
        }
        else if (operator.equals("/")){
            double Divide =  FirstNum / SecondNum;
            JOptionPane.showMessageDialog(null, "The Division is "+ Divide);
        }
       

    }
    
}