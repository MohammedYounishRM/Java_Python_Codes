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
        int distinctCount = 0;
        for (int j = 0; j < size; j++) {
            boolean distinct = true;
            for (int k = 0; k < j; k++) {
                if (array[j] == array[k]) {
                    distinct = false;
                    break;
                }
            }
            if(distinct) {
                distinctCount++;
            }
        }
        System.out.println("The Count of Distinct elements are " + distinctCount);
        userInput.close();
    }
}