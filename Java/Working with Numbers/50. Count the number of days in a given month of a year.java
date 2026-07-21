import java.util.Scanner;

class Main{
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the Month in number:");
        int month = userInput.nextInt();
        
        System.out.println("Enter the Year:");
        int year = userInput.nextInt();
        
        switch (month) {
            case 1:             //Fall through next statements
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Month "+ month+ " of "+ year+ " has 31 days");
                break;
  
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("Month "+ month+ " of "+ year+ " has 30 days");
                break;

            case 2:
                if(( year % 400 == 0 ) || (( year % 100 != 0 ) && ( year % 4 == 0 ))) {
                    System.out.println("Month "+ month+ " of "+ year+ " has 29 days");
                    break;
                }
                else {
                    System.out.println("Month "+ month+ " of "+ year+ " has 28 days");
                    break;
                }
  
            default:
                System.out.println("Invalid Month.");
                break;
        }
        userInput.close();
    }
}