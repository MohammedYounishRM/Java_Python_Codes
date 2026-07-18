import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the number of People:");
        int people = userInput.nextInt();

        int handShake = ((people*(people-1))/2);
        System.out.println("For "+ people +" people there will be " + handShake +" handshakes");
        
        // Method 2
        // int totalHandshake = 0;
        // for(int i=0;i<people;i++) {
        //     totalHandshake += i;
        // }
        // System.out.println(totalHandshake);
        userInput.close();
    }
}