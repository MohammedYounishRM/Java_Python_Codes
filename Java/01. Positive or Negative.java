import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        
        Scanner userInput= new Scanner(System.in);
        
        System.out.println("Enter a number to check Positive Or Negative:");
        int givenInput = userInput.nextInt();
        
        if( givenInput > 0 ) {
            System.out.println("Given Integer " + givenInput + " is Positive");
        } else if( givenInput < 0 ) {
            System.out.println("Given Integer " + givenInput + " is Negative");
        } else {
            System.out.println("Given Integer " + givenInput + " is Nutral");
        }
    
        userInput.close();
    }
}
