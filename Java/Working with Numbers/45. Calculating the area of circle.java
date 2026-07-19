import java.util.Scanner;

class Main {
	public static void main(String [] args)	{
		Scanner userInput = new Scanner(System.in);
        System.out.println("Enter the Radius of the Circle :");
		double radius = userInput.nextDouble();
		
		double area = 3.1415 * radius * radius;
		System.out.println("The Area of the Circle is " + area);

        // Built-in
        // System.out.println(Math.PI*Math.pow(radius, 2));
        userInput.close();
	}
}