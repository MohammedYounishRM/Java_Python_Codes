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

        int total = 0;

        for (int i = 0; i < size; i++) {
            total += numbers[i];
        }

        // Method 2
        // for (int num : numbers) { //for-each loop
        //     total = Math.addExact(total,num);
        // }
        
        System.out.println("The Sum of element in the array is: " + total);
        userInput.close();
    }
}