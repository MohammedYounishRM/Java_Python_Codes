import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        
        Scanner userInput= new Scanner(System.in);
        
        System.out.println("Enter a Number to Check Odd or Even:");
        int givenInput = userInput.nextInt();

        if( givenInput % 2 == 0) {
            System.out.println( givenInput + " is Even");
        }
        else if( givenInput % 2 != 0 ) {
            System.out.println(givenInput + " is Odd");
        }
        else {
            System.out.println("Enter a valid Digit");
        }
        userInput.close();
    }
}