import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string to check Palindrome:");
        String s = userInput.nextLine();
        String rev = "";
        for(int i=s.length()-1; i >= 0; i--){
            rev += s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println(s+ " is Palidrome");
        } else {
            System.out.println(s+ " is not Palindrome");
        }
        userInput.close();
    }
}