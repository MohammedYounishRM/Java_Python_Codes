import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Number to Reverse:");
        int enteredNumber = userInput.nextInt();
        int originalNumber = enteredNumber;
        int reverse = 0;
        int remaining;

        while(enteredNumber != 0) {
            remaining = enteredNumber % 10;
            reverse = reverse * 10 + remaining;
            enteredNumber /= 10;
        }
        System.out.println("The reverse of the number is :" + reverse );

        // num => str convertion
        String numberToString = String.valueOf(originalNumber);
        System.out.println(new StringBuilder(numberToString).reverse().toString());
        userInput.close();
    }
}