import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the First number:");
        int number1 = userInput.nextInt();
        
        System.out.println("Enter the Second number:");
        int number2 = userInput.nextInt();
		
        int minimum = number1 < number2 ? number1 : number2;
        int i;

		for( i=minimum; i>=1 ;i-- ){
		    if(( number1 % i == 0 ) && (number2 % i == 0 )){
		        break;
            }
        }
		System.out.println("GCD of " + number1 + " and " + number2 + " is "+ i);
        userInput.close();
    }
}