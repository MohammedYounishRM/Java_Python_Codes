import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of elements of the Array 1: ");
        int size1 = userInput.nextInt();
        int[] numbers1 = new int[size1];

        for (int i = 0; i < size1; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers1[i] = userInput.nextInt();
        }
        System.out.print("Enter the number of elements of the Array 2: ");
        int size2 = userInput.nextInt();
        int[] numbers2 = new int[size2];

        for (int j = 0; j < size2; j++) {
            System.out.print("Element " + (j + 1) + ": ");
            numbers2[j] = userInput.nextInt();
        }
        int flag = 1;
        for(int i=0; i<size1; i++){
            for(int j=0; j<size2; j++){
                if(numbers1[i] == numbers2[j]){
                    flag = 0;
                    break;
                }
            }
            if (flag == 0) {
                break;
            }
        }
        if (flag == 1){
            System.out.println("The arrays are Disjoint");
        } else {
            System.out.println("The array is not Disjoint");
        }
        userInput.close();
    }
}