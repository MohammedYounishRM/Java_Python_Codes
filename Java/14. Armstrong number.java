import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Number to check Armstrong:");
        int enteredNumber = userInput.nextInt();
        int originalNumber = enteredNumber;
        int add = 0;
        int length = String.valueOf(enteredNumber).length();

        while(enteredNumber != 0) {
            int digit = enteredNumber % 10;
            add += Math.pow(digit,length);
            enteredNumber /= 10;
        }
        System.out.println((add == originalNumber) ? (originalNumber + " is Armstrong") : (originalNumber + " is not Armstrong"));
        userInput.close();
    }
}