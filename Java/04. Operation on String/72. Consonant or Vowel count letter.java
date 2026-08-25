import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a string to check it contains vowel:");
        String s = userInput.nextLine().toLowerCase();
        
        int count = 0;
        
        for (char chr : s.toCharArray()){
            if (chr=='a' || chr=='e' || chr=='i' || chr=='o' || chr=='u'){
                count++;
            }   
        }
        if (count>0){
            System.out.println(s + " has contains " + count + " Vowels and " + Math.abs(count-(s.length())) + " consonents.");
        }
        else {
            System.out.println(s + " is a complete Consonent Word");
        }
        userInput.close();
    }
}