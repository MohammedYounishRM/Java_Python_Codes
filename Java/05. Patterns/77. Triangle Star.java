import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = input.nextInt();
        
        for(int i=0; i<num+1; i++){
            for(int j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}