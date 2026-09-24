import java.util.Scanner;

class Main{
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of Row:");
        int r = input.nextInt();
        System.out.print("Enter the no of Column:");
        int c = input.nextInt();

        for(int i=0; i<r; i++) {
            for(int j=r; j>i; j--) {
                System.out.print(" ");
            }
            for(int j=0; j<c; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}