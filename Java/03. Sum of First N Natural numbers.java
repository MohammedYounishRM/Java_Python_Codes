import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter the Length of digits to Add:");
        int length = userInput.nextInt();
        int total = 0;
        
        for( int i=1; i<=length; i++ ) {
            total += i;
        }
        
        System.out.println(total);
        userInput.close();
    }
}
