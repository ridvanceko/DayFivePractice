package HomeWork5;
import java.util.Scanner;

public class TaskSeven {

    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a random Number: ");
       double number = input.nextDouble();

       if(number < 0) {
           System.out.println("This is a NEGATIVE(-) number ");
       } if(number > 0) {
            System.out.println("This is a POSITIVE(+) number ");
        }


    }
}

//Write a Java program to get a number from the user and print whether it is
//positive or negative.
//Input number: 35
//Output :Number is positive