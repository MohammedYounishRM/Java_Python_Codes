import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Decimal value:");
        int decimal = userInput.nextInt();
        
        // String hexa = "";
        // String hexaValue = "0123456789ABCDEF";
        // if(decimal == 0) {
        //     hexa = "0";
        // }
        // while(decimal > 0) {
        //     int rem = decimal % 16;
        //     hexa = hexaValue.charAt(rem) + hexa;
        //     decimal /= 16;
        // }

        //Built-in Method 
        String hexa = Integer.toHexString(decimal);
        System.out.println("The Hexadecimal value of " + decimal + " is " + hexa );

        userInput.close();
    }
}