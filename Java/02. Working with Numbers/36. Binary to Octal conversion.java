import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Binary value:");
        String binary = userInput.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        String octal = Integer.toOctalString(decimal);
        
        // int binary = userInput.nextInt();
        // int decimal = 0;
        // int i = 0;
        // while (binary != 0) {
        //     long remainder = binary % 10;
        //     decimal += remainder * Math.pow(2, i);
        //     i+=1;
        //     binary /= 10;
        // }
        
        // int octal = 0;
        // int n = 1;
        // while (decimal != 0) {
        //     octal += (decimal % 8) * n;
        //     decimal /= 8;
        //     n *= 10;
        // }
        
        System.out.println("The Octal value of " +binary+" is " +octal);
        userInput.close();
    }
}