// Goldbech's Conjecture Logic
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a Number:");
        int number = userInput.nextInt();
        boolean res = false;

        for (int i=2; i <= number / 2; i++) {
            boolean prime = true;
            for (int j=2; j < i;j++) {
                if(i%j == 0) {
                    prime = false;
                }
            }
            int secondnum = number - i;
            boolean isPrime = true;
            for( int j=2; j<secondnum;j++) {
                if(secondnum % j == 0) {
                    isPrime = false;
                }
            }
            
            if(prime && isPrime) {
                System.out.println(number + " = " + i + " + " + (secondnum));
                res = true;
            }
        }
        if ( !res ) {
            System.out.println(number + " cannot be expressed as a sum of two prime numbers");
        }
        userInput.close();
    }
}