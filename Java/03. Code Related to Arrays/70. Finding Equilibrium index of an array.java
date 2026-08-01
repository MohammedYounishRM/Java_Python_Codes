import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the number of elements of the Array : ");
        int size = userInput.nextInt();
        int[] numbers = new int[size];
        int total = 0;
        boolean find = false;

        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = userInput.nextInt();
            total += numbers[i];
        }
        int leftSideAdd = 0;

        for (int i = 0; i < size; i++) {
            int number = numbers[i];
            int rightSideAdd = total - leftSideAdd - number;

            if(leftSideAdd == rightSideAdd) {
                System.out.println("The index "+i+" is the Equilibrium Index");
                find = true;
                break;
            }
            leftSideAdd += number;
        }
        if(!find){
            System.out.println("no equilibrium found!");
        }
        userInput.close();
    }
}