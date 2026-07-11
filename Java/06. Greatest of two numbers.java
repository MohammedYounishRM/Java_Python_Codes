import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the First number:");
        int firstNumber = userInput.nextInt();

        System.out.println("Enter the Second number:");
        int secondNumber = userInput.nextInt();

        if( firstNumber > secondNumber ) {
            System.out.println(firstNumber + " is Greatest Number");
        } else if ( firstNumber < secondNumber ) {
            System.out.println(secondNumber + " is Greatest Number");
        } else {
            System.out.println("Both Values are Equal");
        }

        // Inbuild Math Function
        System.out.println(Math.max(firstNumber, secondNumber) + " is Greatest");
        
        userInput.close();
    }
}
