import java.util.Scanner;

class Main {						
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Word / Char:");
        String st = userInput.next();
		
        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                System.out.println(ch + " is an Alphabet");
            }
            else {
                System.out.println(ch + " is not an Alphabet");			
            }
        }
        userInput.close();
    }
}