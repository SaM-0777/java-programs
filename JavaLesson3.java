import java.util.Scanner;

// Java Lesson 3

public class JavaLesson3 {
    
    // Arrays in Java
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //String S = sc.nextLine();

        int[] arr = new int[5]; // Array Declaration
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[4] = 40;
        arr[3] = 50;

        int x = arr[0];
        System.out.println(x);
        x = 0;

        // For loops in Java

        for (int i = 0; i < arr.length; i ++) {
            x += (10 + (x * arr[0])); 
            System.out.printf("i : " + i + "\n");
        }
        System.out.printf("X : " + x);

        // Linear Search 

       // Full linear search Implementation

    }
}
