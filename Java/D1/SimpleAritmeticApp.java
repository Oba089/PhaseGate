import java.util.Scanner;
import Math.random();

public class RandomSubtraction {
	public static void main(String[] args) {

	int number1 = (int)(Math.random() * 10);
	int number2 = (int)(Math.random() * 10);

if (number1 < number2) {

	int result = number1;

	number1 = number2;
	number2 = result;
}
	System.out.print("What is " + number1 + " - " + number2 + "? ");

	Scanner input = new Scanner(System.in);
	int answer = input.nextInt();

if (number1 - number2 == answer) {

	System.out.println(number1 + " - " + number2 +28 " is " + (number1 - number2));
}
}
}