import java.util.Scanner;

// Java Lesson 2

public class JavaLesson2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String S1 = sc.nextLine();

        // If Else and Else if Statements

        if (S1.equals("Sam")) {
            System.out.printf("You typed : " + S1);
        }

        else if (S1.equals("Soumya")) {
            System.out.printf("You typed : " + S1);
        }

        else {          
            System.out.printf("You typed : " + S1);
        }

        // Nested Statements

        System.out.print("\nInput Age : ");
        String S2 = sc.nextLine();
        int age = Integer.parseInt(S2);

        if (age >= 18) {
            if (age <= 60) {
                System.out.println("Eligible for vote");
            }

            else {
                System.out.println("Over Age");
            }
        }

        else {
            System.out.println("Not Eliglible for vote");
        }

        sc.close();

    }
    
}