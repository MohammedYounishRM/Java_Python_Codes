import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of elements of the Array: ");
        int size = userInput.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = userInput.nextInt();
        }

        int length = 0;

        for (int i : array) {
            String s = String.valueOf(i);
            String reverse = new StringBuilder(s).reverse().toString();
            if (s.equals(reverse)) {
                if (s.length() > String.valueOf(length).length()) {
                    length = i;
                }
            }
        }
        System.out.println(length);
        userInput.close();
    }
}