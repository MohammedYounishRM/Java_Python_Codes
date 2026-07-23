import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Value to Sum:");
        int enteredNumber = userInput.nextInt();

        int sum = 0;

        while(enteredNumber != 0) {
            sum += enteredNumber % 10;
            enteredNumber /= 10;
        }
        System.out.println("The sum of the digits is :" + sum );
        userInput.close();
    }
}