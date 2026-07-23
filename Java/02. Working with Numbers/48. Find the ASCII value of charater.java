import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Enter a Word :");
        String word = userInput.next();
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int ascii = (int) ch;  // Explicit type casting converts char to its ASCII integer
            
            System.out.println(ch + " -> " + ascii);
        }
        userInput.close();
    }
}