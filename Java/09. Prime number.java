import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number to check Prime:");
        int number = userInput.nextInt();
        boolean res = true;

        if ( number == 0 || number == 1 ) {
            res = false;
        }
        
        for( int i=2; i<number; i++ ) {
            if( number % i == 0 ) {
                res = false;
                break;
            }
        }
        
        if ( res == true ) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not Prime Number");
        }
        userInput.close();
    }
}
