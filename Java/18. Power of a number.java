import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number:");
        int number = userInput.nextInt();
        
        System.out.println("Enter the power:");
        int power = userInput.nextInt();

        System.out.println(Math.pow(number,power));
        userInput.close();
    }
}