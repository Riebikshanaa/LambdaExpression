package lambdaexpression;
interface ArithmeticOperation {
	 int performOperation(int num1, int num2);
	}

	public class ArithmeticOperationsApp {
	 public static void main(String[] args) {
	     ArithmeticOperation addition = (num1, num2) -> num1 + num2;
	     ArithmeticOperation subtraction = (num1, num2) -> num1 - num2;
	     ArithmeticOperation multiplication = (num1, num2) -> num1 * num2;
	     ArithmeticOperation division = (num1, num2) -> num1 / num2;

	     int num1 = 12;
	     int num2 = 4;

	     System.out.println("Addition: " + addition.performOperation(num1, num2));
	     System.out.println("Subtraction: " + subtraction.performOperation(num1, num2));
	     System.out.println("Multiplication: " + multiplication.performOperation(num1, num2));
	     System.out.println("Division: " + division.performOperation(num1, num2));
	 }
	}


