import java.util.Scanner;

class Main {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String to convert the letter cases:");
        String s1 = input.nextLine();
        String newStr = "";
        for(int i = 0; i < s1.length(); i++){
            if(Character.isUpperCase(s1.charAt(i))){
                newStr = newStr + Character.toLowerCase(s1.charAt(i));
            }
            else {
                newStr += Character.toUpperCase(s1.charAt(i));
            }
        }
        System.out.println("The Final Output is "+ newStr);
        input.close();
    }
}