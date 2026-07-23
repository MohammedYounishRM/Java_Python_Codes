import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Fibonacci value range:");
        int fibonacciValue = userInput.nextInt();

        int n1 = 0;
        int n2 = 1;
        System.out.println(n1+ " " +n2);

        for( int i=2; i<fibonacciValue; i++ ) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.println(n3+" ");
        }
        userInput.close();
    }
}