package HomeWork5;
import java.util.Scanner;

public class TaskFive {

    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string value: ");

        String word = input.next();
       if(word.length()-1 >=3) {
           System.out.println(word.substring(1, word.length()-1));
       } else{
           System.out.println(word);
       }

    }
}

//Using scanner ask user to enter one String value. If string length is bigger
//than or equals to 3 print the string without first and last char. If the length is
//not bigger than 3 print print as it is. (for this task you need to use if
//statement).
//Example 1:
//Please enter the String value:
//test
//The output is:
//es
//Example 2:
//Please enter the String value:
//Hello
//The output is:
//ell