import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of elements of the Array: ");
        int size = userInput.nextInt();
        int[] numbers = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = userInput.nextInt();
        }

        int[] withoutDuplicate = new int[size];
        int different = 0;

        for (int i = 0; i < size; i++) {
            int current = numbers[i];
            boolean duplicate = false;

            for( int j = 0; j < different; j++ ) {
                if (withoutDuplicate[j] == current) {
                    duplicate = true;
                    break;
                }
            }
            if (!duplicate) {
                withoutDuplicate[different] = current;
                different++;
            }
        }
        for (int i = 0; i < different; i++) {
            System.out.println(withoutDuplicate[i]);
        }
        userInput.close();
    }
}