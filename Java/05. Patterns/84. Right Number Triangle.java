import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int n = input.nextInt();
        int inc = 0;

        for(int i=1; i<=n;i++){
            for(int j=1; j<=i; j++){
                inc++;
                System.out.print(inc);
            }
            System.out.println();
        }
        input.close();
    }
}