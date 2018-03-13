import java.util.Scanner;

public class AreaAndPerimeterCalculatorApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the Area and Perimeter Calculator");
		
		Scanner sc = new Scanner(System.in);
		String choice = "y";
		while (choice.equalsIgnoreCase("y")) {
			System.out.print("Enter length:  ");
			double length = sc.nextInt();
			System.out.println();

			System.out.print("Enter width:  ");
			double width = sc.nextInt();
			System.out.println();

			double area = length * width;
			double perimeter = 2 * length + 2 * width;

			System.out.println("Area:  " + area);
			System.out.println("Perimeter:  " + perimeter);
			System.out.println();
			System.out.println("Continue? (y/n)");
			choice = sc.next();
		}
		sc.close();
		System.out.println("Bye!");

	}

}
