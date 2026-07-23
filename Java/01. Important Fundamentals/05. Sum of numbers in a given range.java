import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Starting Number:");
        int startValue = userInput.nextInt();

        System.out.println("Enter the Ending Number:");
        int endValue = userInput.nextInt();
        
        int total = 0;
        
        for( int i=startValue; i<=endValue; i++ ) {
            total += i;
        }
        
        System.out.println("The Sum of the range is " + total);
        userInput.close();
    }
}