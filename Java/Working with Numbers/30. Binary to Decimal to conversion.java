import java.util.Scanner;

class Main {
    public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);    
		System.out.print("Enter the Binary number : ");
		int binaryValue = userInput.nextInt();
        int originalValue = binaryValue;
		int decimal = 0;
		int n = 0;

		while(binaryValue > 0) {
			int digit = binaryValue % 10;
			decimal += digit * Math.pow(2, n);
			binaryValue = binaryValue / 10;
			n += 1;
		}
		
        System.out.println("Decimal number of "+ originalValue + " is " +decimal); 
        userInput.close();

        // Simple Convertion

        // String binary = String.valueOf(originalValue);
        // int decimalValue = Integer.parseInt(binary,2);
        // System.out.println(decimalValue);
	}
}