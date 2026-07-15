import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a Value to check Palindrome:");
        String enteredValue = userInput.nextLine();
        
        String reversed = new StringBuilder(enteredValue).reverse().toString();

        System.out.println((enteredValue.equals(reversed)) ? enteredValue + " is Palindrome" : enteredValue + " is Not Palindrome");
        userInput.close();
    }
}