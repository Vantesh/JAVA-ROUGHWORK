import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

       int  FirstNum=Integer.parseInt( JOptionPane.showInputDialog("Enter First Num"));
       int  SecondNum=Integer.parseInt( JOptionPane.showInputDialog("Enter Second Num"));
       int Sum = FirstNum+ SecondNum;
       JOptionPane.showMessageDialog(null, "The sum is: " + Sum);
       



    }
}