import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sides of the triangle for perimeter
        System.out.print("Enter side a: ");
        double a = scanner.nextDouble();

        System.out.print("Enter side b: ");
        double b = scanner.nextDouble();

        System.out.print("Enter side c: ");
        double c = scanner.nextDouble();

        // Input base and height for area
        System.out.print("Enter base of the triangle: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height of the triangle: ");
        double height = scanner.nextDouble();

        // Calculate perimeter
        double perimeter = a + b + c;

        // Calculate area
        double area = 0.5 * base * height;

        // Output results
        System.out.println("\nPerimeter of Triangle = " + perimeter);
        System.out.println("Area of Triangle = " + area);

        scanner.close();
    }
}