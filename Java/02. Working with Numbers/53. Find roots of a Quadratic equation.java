import java.util.Scanner;

class Main {
    public static void main(String [] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter coefficients for ax^2 + bx + c = 0");
        System.out.print("Enter coefficient a: ");
        double a = userInput.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = userInput.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = userInput.nextDouble();

        double determinant = (b * b) - (4 * a * c);

        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.printf("Roots are Real and Different: %.2f and %.2f\n", root1, root2);
        } 
        else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.printf("Roots are Real and Equal: %.2f\n", root);
        } 
        else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
            System.out.printf("Roots are Complex and Imaginary: %.2f + %.2fi and %.2f - %.2fi\n", realPart, imaginaryPart, realPart, imaginaryPart);
        }
        userInput.close();
    }
}