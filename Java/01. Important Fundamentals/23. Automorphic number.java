import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Number to check Automorphic:");
        int enteredNumber = userInput.nextInt();
        int sqValue = (int) Math.pow(enteredNumber, 2); //enteredNumber*enteredNumber
        String stringValue = Integer.toString(enteredNumber);
        int mod = (int) Math.pow(10, stringValue.length());

        if(sqValue % mod == enteredNumber) {
            System.out.println(enteredNumber + " is a Automorphic number");
        } else {
            System.out.println(enteredNumber + " is not a Automorphic Number");
        }
        userInput.close();
    }
}