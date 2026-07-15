// Sum of proper divisor is larger than the number itself
import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number to find Abundant:");
        int Abundant = userInput.nextInt();
        int add = 0;
        for (int i=1; i<Abundant; i++) {
            if(Abundant % i == 0) {
                add += i;
            }
        }
        System.out.println((add > Abundant) ? (Abundant + " is Abundant number") : (Abundant + " is not Abundant number"));
        userInput.close();
    }
}