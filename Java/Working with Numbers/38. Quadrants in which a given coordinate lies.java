import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter the value of X:");
        int xaxis = userInput.nextInt();
        System.out.println("Enter the value of Y:");
        int yaxis = userInput.nextInt();

        if ( xaxis > 0 && yaxis > 0 ) {
            System.out.println("point ("+ xaxis +","+ yaxis + ") lies in the First(I) Quadrant");
        }
        
        else if ( xaxis < 0 && yaxis > 0 ) {
            System.out.println("point ("+ xaxis +","+ yaxis + ") lies in the Second(II) Quadrant");
        }
        
        else if ( xaxis < 0 && yaxis < 0 ) {
            System.out.println("point ("+ xaxis +","+ yaxis + ") lies in the Third(III) Quadrant");
        }
        
        else if ( xaxis > 0 && yaxis < 0 ) {
            System.out.println("point ("+ xaxis +","+ yaxis + ") lies in the Fourth(IV) Quadrant");
        }
        
        else if ( xaxis == 0 && yaxis == 0 ) {
            System.out.println("point ("+ xaxis +","+ yaxis + ") on Origin(0,0)");
        }
        
        else if ( xaxis != 0 && yaxis == 0 ) {
            System.out.println("point ("+ xaxis + ","+ yaxis + ") on X-axis");
        }
        
        else if ( xaxis == 0 && yaxis != 0 ) {
            System.out.println("point ("+ xaxis + ","+ yaxis + ") on Y-axis");
        }
        
        else {
            System.out.println("Enter a Valid Number");
        }
        
        userInput.close();
    }
}