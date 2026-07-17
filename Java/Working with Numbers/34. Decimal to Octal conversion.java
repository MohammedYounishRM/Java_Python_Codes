import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Decimal value:");
        int decimal = userInput.nextInt();
        
        // String octal = "";
        // if(decimal == 0) {
        //     octal = "0";
        // }
        // while(decimal > 0) {
        //     int rem = decimal % 8;
        //     octal = rem + octal;
        //     decimal /= 8;
        // }

        //Built-in Method 
        String octal = Integer.toOctalString(decimal);
        System.out.println("The Octal value of " + decimal + " is " + octal );

        userInput.close();
    }
}