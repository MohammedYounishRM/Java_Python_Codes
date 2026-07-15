import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number to find Factorial:");
        int factValue = userInput.nextInt();
        long res = 1;

        for (int i = 1; i<=factValue;i++) {
            res = res * i;
        }

        System.out.println("The Factorial value is " + res);
        userInput.close();
    }
}