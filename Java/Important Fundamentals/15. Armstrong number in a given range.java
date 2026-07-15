import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Starting value:");
        int startValue = userInput.nextInt();

        System.out.println("Enter the Ending value:");
        int endValue = userInput.nextInt();

        for( int i=startValue; i<=endValue; i++ ) {
            int length = String.valueOf(i).length();
            int add = 0;
            int originalValue = i;
            
            while(originalValue != 0) {
                int digit = originalValue % 10;
                add += (int) Math.pow(digit,length);
                originalValue /= 10;
            }
            
            if(i == add) {
                System.out.println(i);
            }
        } userInput.close();
    }
}