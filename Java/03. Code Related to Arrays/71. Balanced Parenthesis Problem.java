import java.util.*;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter the string of brackets: ");
        String str = userInput.next();

        while ( str.length() != 0 ) {
            int original = str.length();

            str = str.replace("(","");
            str = str.replace("[","");
            str = str.replace("{","");
            str = str.replace(")","");
            str = str.replace("]","");
            str = str.replace("}","");

            if( (str.length()) == original ) {
                break;
            }
        }

        if ( str.length() == 0) {
            System.out.println("The Entered String has Balanced brackets");
        }
        else {
            System.out.println("The entered string does not have balanced brackets");
        }
        userInput.close();
    }
}