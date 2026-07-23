import java.util.Scanner;

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

        int smallest = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }
        // Method 2

        // for (int num : numbers) {
        //     smallest = Math.min(smallest,num);
        // }
        System.out.println("The Smallest element in the array is: " + smallest);
        userInput.close();
    }
}