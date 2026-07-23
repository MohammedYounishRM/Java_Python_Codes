import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number to check Perfect Square:");
        int number = userInput.nextInt();
        int rootValue = (int) Math.sqrt(number);

        if (rootValue * rootValue == number) {
            System.out.println(number + " is Perfect Square");
        } else {
            System.out.println(number + " is Not Perfect Square");
        }
        userInput.close();
    }
}