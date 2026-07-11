import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the First number:");
        int firstNumber = userInput.nextInt();

        System.out.println("Enter the Second number:");
        int secondNumber = userInput.nextInt();

        System.out.println("Enter the Third number:");
        int thirdNumber = userInput.nextInt();
        
        if (( firstNumber >= secondNumber ) && (firstNumber >= thirdNumber)) {
            System.out.println (firstNumber + " is the Greatest Number");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println (secondNumber + " is the Greatest Number");
        } else {
            System.out.println (thirdNumber + " is the Greatest Number");
        }
       userInput.close();
    }
}
