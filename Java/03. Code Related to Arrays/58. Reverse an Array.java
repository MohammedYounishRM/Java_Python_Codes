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
        int n = numbers.length;
        int start = 0, end = n-1;
        
        while (start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;
            start++;
            end--;
        }

        for(int i = 0; i < n; i++){
            System.out.println(numbers[i]+" "); 
        }
        // Method 2
        // int n = numbers.length;        
        // for(int i = n-1; i >= 0; i--) {
        //     System.out.println(numbers[i]+" ");       
        // }
        userInput.close();
    }
}