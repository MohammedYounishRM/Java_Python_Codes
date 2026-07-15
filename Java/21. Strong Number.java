import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Number to check Strong:");
        int enteredNumber = userInput.nextInt();
        int originalNumber = enteredNumber;
        int add = 0;

        while(enteredNumber != 0) {
            int digit = enteredNumber % 10;
            int factorial = 1;
            for(int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            add += factorial;
            enteredNumber /= 10;
        }
        if( add == originalNumber ) {
            System.out.println(originalNumber + " is a Strong number");
        } else {
            System.out.println(originalNumber + " is not a Strong Number");
        }
        userInput.close();
    }
}