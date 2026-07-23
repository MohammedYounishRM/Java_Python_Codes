import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a Number :");
        String number = userInput.next();

        String converted = number.replace("0","1");
        System.out.println("Original :" + number + " Replaced :" + converted);
        
        // Method 2
        // System.out.println("Enter a Number :");
        // int number = userInput.nextInt();
        // int converted = 0;
        // int value = 1;

        // if( number == 0 ) {
        //     converted = 1;
        // }
        // while( number > 0 ) {
        //     int digit = number % 10;
        //     if( digit == 0 ) {
        //         digit = 1;
        //     }
        //     converted += (digit * value);
        //     value *= 10;
        //     number /= 10;
        // }
        // System.out.println(converted);

        userInput.close();
    }
}