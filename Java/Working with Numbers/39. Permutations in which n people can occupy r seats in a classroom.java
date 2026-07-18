import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number of Students:");
        int students = userInput.nextInt();
        System.out.println("Enter the number of Seats:");
        int seats = userInput.nextInt();

        if ( students < 0 || seats < 0 ) {
            System.out.println("Number of people and seats must be non-negative");
        }

        else if ( students < seats ) {
            System.out.println("Seats cannot be greater than the number of people. Total ways: 0");
        }

        else {
            int ways = 1;
            for( int i = 0; i < seats; i++ ){
                ways *= (students - i);
            }
        System.out.println("Total possible arrangements: "+ways);
        userInput.close();
        }
    }
}