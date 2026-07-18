import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Octal value:");
        String octal = userInput.nextLine();
        int decimal = Integer.parseInt(octal, 8);
        String binary = Integer.toBinaryString(decimal);
        
        // Method 2
        // int octal = userInput.nextInt();
		// int decimal = 0;
		// int n = 0;
        // if (octal == 0) {
        //     System.out.println("The Binaey value of 0 is 0");
        // }
		// while(octal > 0) {
		// 	int digit = octal % 10;
		// 	decimal += digit * Math.pow(8, n);
		// 	octal /= 10;
		// 	n += 1;
		// }
        
        // String binary = "";
        // while(decimal > 0) {
        //     int rem = decimal % 2;
        //     binary = rem + binary;
        //     decimal /= 2;
        // }        
        System.out.println("The Binary value of "+octal +" is " +binary);
        userInput.close();
    }
}