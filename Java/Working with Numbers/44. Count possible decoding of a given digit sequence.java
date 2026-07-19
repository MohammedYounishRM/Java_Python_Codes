import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the number :");
        String number = userInput.next();
        int result;

        if (number.length() == 0 || number.charAt(0) == '0') {
            result = 0;
        } else {
            int prev = 1;
            int current = 1;

            for (int i = 1; i < number.length(); i++) {
                int nextStep = 0;

                if (number.charAt(i) != '0') {
                    nextStep += current;
                }

                int twoDigits = Integer.parseInt(number.substring(i - 1, i + 1));
                if (twoDigits >= 10 && twoDigits <= 26) {
                    nextStep += prev;
                }

                if (nextStep == 0) {
                    current = 0;
                    break;
                }

                prev = current;
                current = nextStep;
            }
            
            result = current;
        }

        System.out.println("Total ways to Decode: " + result);
        userInput.close();
    }
}