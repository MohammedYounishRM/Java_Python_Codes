import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter row:");
        int r = input.nextInt();
        System.out.print("Enter column:");
        int c = input.nextInt();

        for(int i=1; i<=r; i++){
            for(int j=1; j<=c;j++){
                if( (i==1 || i==r) || (j==1 || j==c) ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        input.close();
    }
}