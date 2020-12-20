package HomeWork5;

import java.util.Scanner;

public class TaskEight {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a Grade Letter: ");
        String grade = input.nextLine();

     if(grade == "A") {
         System.out.println("4.0");
     }if(grade == "A-") {
            System.out.println("3.7");
        }if(grade == "B+") {
            System.out.println("3.3");
        }if(grade == "B") {
            System.out.println("3.0");
        }if(grade == "B-") {
            System.out.println("2.7");
        }if(grade == "C+") {
            System.out.println("2.3");
        }if(grade == "C") {
            System.out.println("2.0");
        }if(grade == "C-") {
            System.out.println("1.7");
        }if(grade == "D+") {
            System.out.println("1.3");
        }if(grade == "D-") {
            System.out.println("1.0");
        }if(grade == "F") {
            System.out.println("0.");
        }

    }
}

//Using scanner ask user to enter grade letter and print the number value
//matching with this grade.
//Example:
//Input : A
//Output: 4.0
//Input: AOutput: 3.7
//NOTE:
//The University uses a 4 point scale for grades; these “quality” grades are as
//follows 4.0 = A, 3.7 = A-, 3.3=B+, 3.0 = B, 2.7 = B-, 2.3 = C+, 2.0 = C, 1.7 = C-,
//1.3 = D+, 1.0 = D, F = 0.