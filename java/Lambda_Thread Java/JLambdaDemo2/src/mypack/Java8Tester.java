package mypack;

public class Java8Tester {

	private double operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java8Tester tester = new Java8Tester();

		//with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		//with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		//with return statement along with curly braces
		MathOperation multiplication = 
				(int a, int b) -> 
					{ return a * b; };

		//without return statement and without curly braces
		MathOperation division = (int a, int b) -> a*1.0 / b;

		System.out.println("10 + 5 = " + 
		tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + 
		tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + 
		tester.operate(10, 5, multiplication));
		System.out.println("12 / 5 = " + 
		tester.operate(12, 5, division));

		//without parenthesis
		GreetingService greetService1 = message ->
		System.out.println("Hello " + message);

		//with parenthesis
		GreetingService greetService2 = (message) ->
		System.out.println("Hello " + message);

		greetService1.sayMessage("Mahesh");
		greetService2.sayMessage("Suresh");
	}

}
