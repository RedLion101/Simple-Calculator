import java.util.Scanner;

public class SimpCalc {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your first number : ");
		Double a = Double.valueOf(scanner.nextLine());
		System.out.println("Input your operator : ");
		String o = scanner.nextLine();
		System.out.println("Input your second number : ");
		Double b = Double.valueOf(scanner.nextLine());
		if(o.equals("+")) {
			System.out.println("a + b = "+(a+b));

		}else if(o.equals("-")) {
			System.out.println("a - b = "+(a-b));

		}else if(o.equals("*")) {
			System.out.println("a * b = "+(a*b));

		}else if(o.equals("/")) {
			System.out.println("a / b = "+(a/b));

		}

	}
}
