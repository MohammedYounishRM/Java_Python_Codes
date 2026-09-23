import java.util.Scanner;

class Main{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of Row:");
        int r = input.nextInt();
        System.out.print("Enter the no of Column:");
        int c = input.nextInt();

        for(int i=1; i<=r; i++) {
            for(int j=1; j<i; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=c; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}