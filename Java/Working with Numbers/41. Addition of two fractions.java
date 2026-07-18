import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Numerator 1 :");
        int n1 = userInput.nextInt();
        
        System.out.println("Enter the Denominator 1 :");
        int d1 = userInput.nextInt();
        
        System.out.println("Enter the Numerator 2 :");
        int n2 = userInput.nextInt();
        
        System.out.println("Enter the Denominator 2 :");
        int d2 = userInput.nextInt();

        int numerator = (n1*d2)+(n2*d1);
        int denominator = d1*d2;
        
        int a = Math.abs(numerator);
        int b = Math.abs(denominator);
        
        while(b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        
        int gcd = a;
        
        numerator /= gcd;
        denominator /= gcd;
        
        System.out.println(numerator + "/" + denominator);
        userInput.close();
    }
}