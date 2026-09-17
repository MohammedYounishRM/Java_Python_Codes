import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to get in Sqaure :");
        int num = input.nextInt();
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}