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
        
        boolean visited[] = new boolean[size];
        Arrays.fill(visited, false);
     
        for (int i = 0; i < size; i++) {
            if (visited[i] == true ) {
                continue;
            }

            int count = 1;
            for (int j = i + 1; j < size; j++) {
                if ( numbers[i] == numbers[j] ) {
                   visited[j] = true;
                   count++;
                }
            }
            
            if( count == 1 ) {
               System.out.println("The non repeated Elements are " + numbers[i]);
            }
        }
        userInput.close();
    }
}