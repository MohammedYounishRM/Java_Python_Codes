import java.util.Scanner;

class Main{
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter the Number:");
        int number = userInput.nextInt();
        
        System.out.println("Enter the digit to Count :");
        int digit = userInput.nextInt();
        
        int currentNumber = number;
        int count = 0;
        if ( currentNumber == 0 && digit == 0 ) {
            count = 1;
        }
        else {
            while ( currentNumber > 0 ) {
                int lastDigit = currentNumber % 10;
                if( lastDigit == digit ) {
                    count++;
                }
                currentNumber /= 10;
            }
        }

        // Simple Method

        // System.out.println("Enter the Number:");
        // String number = userInput.next();
        
        // System.out.println("Enter the digit to Count :");
        // String digit = userInput.next();

        // int count = number.length()-number.replace(digit,"").length();
        // System.out.println(count);
    System.out.println("The "+ digit + " ocuured in the "+ number +" for "+ count+" times");
    userInput.close();
    }
}