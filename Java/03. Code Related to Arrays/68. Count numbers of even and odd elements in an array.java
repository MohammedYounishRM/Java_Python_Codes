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

        int even = 0;
        int odd = 0;

        for(int i = 0; i < size; i++) {
            if(numbers[i] % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }
        System.out.println("The count of Odd elements in given array is "+ odd + " and even is "+ even);
        userInput.close();
    }
}