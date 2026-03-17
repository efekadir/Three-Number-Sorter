import java.util.Scanner;
public class ThreeNumberSorter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double temp = 0;
		
		System.out.print("Enter first value: ");
		double number1 = sc.nextDouble();
		System.out.print("Enter second value: ");
		double number2 = sc.nextDouble();
		System.out.print("Enter third value: ");
		double number3 = sc.nextDouble();
		
		
		if (number1 < number2) {
			temp = number1;
			number1 = number2;
			number2 = temp;
		}
		if (number1 < number3) {
			temp = number1;
			number1 = number3;
			number3 = temp;
		}
		if (number2 < number3) {
			temp = number2;
			number2 = number3;
			number3 = temp;
		}	
		
		if (number1 == number2 && number2 == number3) {
			System.out.println("Order of numbers: " +  number1 + " >= " + number2 + " >= " + number3);
		}
		else if (number1 == number2 && number2 != number3) {
			System.out.println("Order of numbers: " +  number1 + " >= " + number2 + " > " + number3);
		}
		else if (number1 != number2 && number2 == number3) {
			System.out.println("Order of numbers: " +  number1 + " > " + number2 + " >= " + number3);
		}
		else {
			System.out.println("Order of numbers: " +  number1 + " > " + number2 + " > " + number3);
		}
	}
}