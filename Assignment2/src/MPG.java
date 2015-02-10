
//More self-descriptive variable names, such as miles, gallons..
// Ayman Alghamdi
import java.util.Scanner;

public class MPG {

	public static void main(String[] args) {
		Scanner car = new Scanner(System.in);

		double MD, Gofg, MPG;
		System.out.println("Enter the Miles driven");
		MD = car.nextDouble();
		System.out.println("Enter the Gallons of gas used");
		Gofg = car.nextDouble();
		MPG = MD / Gofg;
		System.out.printf("The mile-per-gallons is %.4f", MPG);
	}
}
