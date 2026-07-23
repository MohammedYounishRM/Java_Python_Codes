import java.util.Scanner;

class Main {
    public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);    

        System.out.print("Enter the Hexadecimal number : ");
        String hexadecimal = userInput.nextLine();

        int decimalValue = Integer.parseInt(hexadecimal,16);
        System.out.println("The Deciamal value of " + hexadecimal + " is " + decimalValue);
        
        // String digits = "0123456789ABCDEF";
        // String hexaValue = hexadecimal.toUpperCase();
        // int add = 0;

        // for(int i=0; i<hexaValue.length(); i++) {
        //     char character = hexaValue.charAt(i);
        //     int digit = digits.indexOf(character);
        //     add = 16 * add + digit;
        // }
        // System.out.println(add);
 
        userInput.close();
	}
}