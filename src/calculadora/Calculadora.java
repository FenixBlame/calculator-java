package calculadora;
import java.util.*;

public class Calculadora {
	public static void main (String [] args) {
		Scanner scanner = new Scanner (System.in);
		
		double numA, numB;
		System.out.print("Enter the first number: ");
		numA = scanner.nextDouble();
		System.out.print("Enter the second number: ");
		numB = scanner.nextDouble();
		
		System.out.println("Choose the operation: +, -, *, / ");
		char operation;
		operation = scanner.next().charAt(0);
		
		double result;
		switch(operation) {
		case '+': 
			result = numA + numB;
			System.out.println("The sum of the numbers is: " + result);
			break;
		
		case '-': 
			result = numA - numB;
			System.out.println("The difference of the numbers is: " + result);
			break;
		
		case '*': 
			result = numA * numB;
			System.out.println("The multiplication of the numbers is: " + result);
			break;
			
		case '/': 
			if(numB != 0) {
				result = numA / numB;
			
			System.out.println("The division of the numbers is: " + result);
			}
			else {
				System.out.println("Division by 0 is undetermined");
			}
			break;
			
		default:
			System.out.println("Invalid operation");
		}
		
		scanner.close();
	}
}
