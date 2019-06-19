import java.util.Scanner;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		int first;
		int second;
		int third;
		int temp;
		
		System.out.println("Enter the first number");
		first = keyboard.nextInt();
		
		System.out.println("Enter the second number");
		second = keyboard.nextInt();
		
		System.out.println("Enter the third number");
		third = keyboard.nextInt();
		
		
		if (first  > second)
		{
			temp = first;
			first = second;
			second = temp;
		}
		if (first > third)
		{
			temp = first;
			first = third;
			third = temp;
		}
		if (second>third)
		{
			temp = second;
			second = third;
			third = temp;
		}
		
		System.out.println("First: " + first + " Second: " + second + " Third: " + third);
		
		keyboard.close();

	}
	

}
