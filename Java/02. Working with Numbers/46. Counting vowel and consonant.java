import java.util.Scanner;

class Main {
    public static void main(String [] args) {
		Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the word to count Vowel and Consonent :");
        String word = userInput.next();
        word = word.toLowerCase();
        String vowels = "aeiou";
        
        int vowelCount = 0;
        int consonantCount = 0;
        
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);

            if (vowels.indexOf(letter) != -1) {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }
        
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
        userInput.close();
    }
}