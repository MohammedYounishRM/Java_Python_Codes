import java.util.Scanner;

class Main {
    public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);    
		System.out.print("Enter the Octal number : ");
		int octalValue = userInput.nextInt();
        int originalValue = octalValue;
		int decimal = 0;
		int n = 0;

		while(octalValue > 0) {
			int digit = octalValue % 10;
			decimal += digit * Math.pow(8, n);
			octalValue = octalValue / 10;
			n += 1;
		}
		
        System.out.println("Decimal number of "+ originalValue + " is " +decimal); 
        userInput.close();

        // Simple Convertion

        // String octal = String.valueOf(originalValue);
        // int decimalValue = Integer.parseInt(octal,8);
        // System.out.println(decimalValue);
	}
}