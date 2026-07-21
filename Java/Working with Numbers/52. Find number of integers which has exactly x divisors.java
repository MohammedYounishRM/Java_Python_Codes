import java.util.Scanner;
 
class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter the Number:");
        int number = userInput.nextInt();
        
        System.out.println("Enter the digit to Count :");
        int digit = userInput.nextInt();
        
        int count = 0;
    
        for(int i=1; i<=number; i++){
            int count_factors = 0;
        
            for(int j = 1; j<= i; j++){
        
                if(i%j==0){
                    count_factors++;
                }
            }
        
        if(count_factors == digit)
            count++;
        }
    System.out.println(count);
    userInput.close();
    }
}