import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Number to check Perfect:");
        int enteredNumber = userInput.nextInt();
        int add = 0;

        for(int i = 1; i<enteredNumber; i++) {
            if ( enteredNumber % i == 0 ) {
                add += i;
            }
        }
        if((add == enteredNumber) && (enteredNumber != 0)) {
            System.out.println(enteredNumber + " is a Perfect number");
        } else {
            System.out.println(enteredNumber + " is not a Perfect Number");
        }
        userInput.close();
    }
}