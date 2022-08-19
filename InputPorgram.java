import java.util.Scanner;


public class InputPorgram {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your First Name : ");
        String firstName = input.next();

        System.out.print("Enter your Last Name : ");
        String lastName = input.next();
        
        input.close();
        
        System.out.println("Name : " + firstName + " " + lastName);
    }
}
