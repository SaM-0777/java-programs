import java.io.ObjectInputFilter.Status;
import java.util.Scanner;

// Data and Variables in JAVA
// Basic Operations in JAVA (IP & OP)

public class JavaLesson1{
    public static void main(String [] args){

        //Data and Variables

        // Primitive Data Types
        int Data1 = 50;
        int Data4 = 10;
        int Data2 = 2;
        
        int Data5 = Data1 + Data4 / Data2;
        int Data6 = (Data1 + Data4) / Data2;
        double Data3 = (Data1 / Data4);
        double Data8 = Math.PI;
        double Data7 = Math.pow(Data3, Data8);

        System.out.println(Data5);  // 55
        System.out.println(Data6);  // 30
        System.out.println(Data3);  // 5.0
        System.out.println(Data7);  // 156.9925...

        //Input and Scanner
        Scanner sc = new Scanner(System.in);
        String Scanned = sc.next();   // Allows String from the user
        System.out.println(Scanned); // Print the Input Items
        // Input a integer
        int A = sc.nextInt();   // Input A from User 
        int B = sc.nextInt();   // Input B from User
        System.out.println(A + B);  // Print A + B

        // Conditions and Boolean

        // Comparisons
        int x = 8;
        int y = 7;
        int z = 10;
        Boolean compareAnd = x == y && z >= y;  // ! is Not Opeartor
        Boolean compareOr = x <= y || x >= z;
        String X = "Hello";
        String Y = "Sam";
        Boolean cmpstr = X != Y;    // >= and <= are not valid for Strings

        System.out.println(compareAnd);
        System.out.println(compareOr);
        System.out.println(cmpstr);

        sc.close();
    }
}