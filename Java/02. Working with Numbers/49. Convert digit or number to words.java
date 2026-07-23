import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter a number to convert into words: ");
        long number = userInput.nextLong(); 
        
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String[] thousands = {"", "thousand", "million", "billion"};
        
        if (number == 0) {
            System.out.println("Zero");
        }
        else {
            String finalResult = "";
            int thousandIndex = 0;
            long originalNumber = number;
            
            while (originalNumber > 0) {
                int subNumber = (int) (originalNumber % 1000); // Grab last 3 digits
                
                if (subNumber > 0) {
                    String combineWords = "";
                    
                    if (subNumber / 100 > 0) {
                        combineWords += ones[subNumber / 100] + " hundred ";
                    }
                    
                    int rem = subNumber % 100;
                    
                    if (rem > 0 && rem < 20) {
                        combineWords += ones[rem] + " ";
                    }
                    else if (rem >= 20) {
                        combineWords += tens[rem / 10] + " ";
                        
                        if (rem % 10 > 0) {
                            combineWords += ones[rem % 10] + " ";
                        }
                    }
                    
                    if (!thousands[thousandIndex].equals("")) {
                        combineWords += thousands[thousandIndex] + " ";
                    }
                    
                    finalResult = combineWords + finalResult;
                }
                
                originalNumber = originalNumber / 1000; // Move to next 3 digits
                thousandIndex++;
            }
            System.out.println(finalResult.trim());
        }
        userInput.close();
    }
}