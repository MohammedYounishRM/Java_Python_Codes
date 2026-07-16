import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the First number:");
        int number1 = userInput.nextInt();
        
        System.out.println("Enter the Second number:");
        int number2 = userInput.nextInt();

        int originalNumber1 = number1;
        int originalNumber2 = number2;
        
        while( number1 != number2 ) {
            if( number1 > number2 ) {
                number1 -=  number2;
            } else {
                number2 -= number1;
            }
        }
        int lcm = (originalNumber1 * originalNumber2)/number1;
        System.out.println("The lCM is " + lcm);
        userInput.close();
    }
}