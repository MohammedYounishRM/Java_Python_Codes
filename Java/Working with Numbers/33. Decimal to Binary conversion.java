import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Decimal value:");
        int decimal = userInput.nextInt();
        
        // String binary = "";
        // if(decimal == 0) {
        //     binary = "0";
        // }
        // while(decimal > 0) {
        //     int rem = decimal % 2;
        //     binary = rem + binary;
        //     decimal /= 2;
        // }

        //Built-in Method 
        String binary = Integer.toBinaryString(decimal);
        System.out.println("The Binary value of " + decimal + " is " + binary );

        userInput.close();
    }
}