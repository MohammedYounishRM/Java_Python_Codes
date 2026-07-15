// Harshad Number is an Integer that is completely divisible by the sum of its digits
import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number to check Harshad:");
        int enteredNumber = userInput.nextInt();
        int originalNumber = enteredNumber;
        int sum = 0;

        while(enteredNumber != 0) {
            int digit = enteredNumber % 10;
            sum += digit;
            enteredNumber /= 10;
        }
        if((originalNumber % sum == 0) && (sum != 0)) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }
        userInput.close();
    }
}