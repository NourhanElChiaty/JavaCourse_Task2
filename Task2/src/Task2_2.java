import java.util.Scanner;

public class Task2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int x = Scan.nextInt();
		
		System.out.println("Enter Second number number");
		int y =Scan.nextInt();
		
		Boolean Result;
		
		Result = x > y;
		System.out.println("number one > number 2: 2"+ Result);
		
		Result = x >= y;
		System.out.println("number one >= number 2: "+ Result);
		
		Result = x < y;
		System.out.println("number one < number 2: "+ Result);
		
		Result = x <= y;
		System.out.println("number one <= number 2: "+ Result);

		Result = x == y;
		System.out.println("number one == number 2: "+ Result);
		
		Result = x != y;
		System.out.println("number one != number 2: "+ Result);




	}

}
