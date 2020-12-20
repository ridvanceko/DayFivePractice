package HomeWork5;
import java.util.Scanner;

public class TaskFour {
    public static void main(String []args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String");

        String str = input.nextLine();
        String str2 = str.substring(str.indexOf(" "+1),str.indexOf(" "+2));
        System.out.println(str.replace(str2, str2.toUpperCase()));

    }
}

//Why is it Run time error!!!!

//Using scanner enter String (two words) value with spaces in the beginning
//and at the end. In this input the second word is not starting with upper case,
//using string methods change the letter with upper case and print it
//Example 1:
//Please enter the String with following format “ word
//Natural black
//The output is:
//Natural Black