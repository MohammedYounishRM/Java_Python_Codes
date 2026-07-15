import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number to find Factor:");
        int factor = userInput.nextInt();

        for (int i=1; i<factor; i++) {
            if(factor % i == 0) {
                System.out.println(i);
            }
        }
        userInput.close();
    }
}