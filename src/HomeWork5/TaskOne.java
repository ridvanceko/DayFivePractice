package HomeWork5;
import java.util.Scanner;

public class TaskOne {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter String value: ");
        String stringValue = input.nextLine();

        System.out.println("Please enter the starting number: ");
        int startingNumber = input.nextInt();


        System.out.println("Please enter the ending number: ");
        int endingNumber = input.nextInt();
        System.out.println(stringValue.substring(startingNumber,endingNumber));



       //String myStr = "Hello";
        //System.out.println(myStr.startsWith("Hel"));   // true


    }
}

//Write the program to get the string value from the specified position. First,
//ask the user to enter one String value. Then ask the user the enter starting
//number and ending number. After that, print the value between the given
//starting and ending numbers. (Note: since the user does not know the java,
//the user starts counting from 1 and ending number will be included)
//Example:
//Please enter the String value:
//Definition of Science
//Please enter the starting number:
//2
//Please enter the ending number
//5
//The output is:
//efin