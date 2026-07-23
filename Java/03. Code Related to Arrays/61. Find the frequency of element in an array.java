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

        int n = numbers.length;
        for (int i = 0; i < n; i++) {
            Boolean flag = false;
            int count = 0;

            for (int j = i+1; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                continue;
            }

            for (int j = 0;  j <= i; j++){
                if (numbers[i] == numbers[j]) {
                    count += 1;
                }
            }
            System.out.println(numbers[i]+":" +count);
        } 
        userInput.close();
    }
}