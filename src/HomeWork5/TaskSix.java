package HomeWork5;
import java.util.Scanner;

public class TaskSix {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a String Value ");
        String number = input.next();

        if(number.length()%2 !=0) {
            System.out.println(number.substring(number.length()/2-1, number.length()/2+2));
        }

    }
}

//Using scanner ask user to enter one String value. If this String length is odd
//number print middle 3 string from given value. (You need to use if statement
//for this task)
//Example 1:
//Please enter the String value:
//test
//The output is:
//(Since "test" length is not odd number output should be nothing)
//Example 2:
//Please enter the String value:
//Chicago
//The output is:
//ica