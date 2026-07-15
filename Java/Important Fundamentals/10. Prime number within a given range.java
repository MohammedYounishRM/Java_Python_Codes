import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the Starting value:");
        int start = userInput.nextInt();
        
        System.out.println("Enter the Ending value:");
        int end = userInput.nextInt();

        for(int i=start; i<=end; i++ ) {
            boolean result = true;
            
            if(i<2){
                continue;
            } else if(i==2){
                System.out.println(2);
                continue;
            } else {
                for( int j=2; j<i; j++ ) {
                    if( i % j == 0 ) {
                        result = false;
                        break;
                    }
                }
            }
            
            if( result == true ) {
                System.out.println(i);
            }
        }
        userInput.close();
    }
}