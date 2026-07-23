import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number to find Prime Factor:");
        int number = userInput.nextInt();

        int factor = 2;

        while( factor <= number ) {
            if( number % factor == 0 ) {
                System.out.println(factor);
                number /= factor;
            } else {
                factor += 1;
            }
        } userInput.close();
    }
}