import java.util.Scanner;

public class Task2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int x = Scan.nextInt();
		
		System.out.println("Enter Second number number");
		int y =Scan.nextInt();
		
		Calculator C = new Calculator();
		
		C.add(x,y);
		C.divide(x, y);
		C.subtract(x, y);
		C.modulus(x, y);
		C.multiply(x, y);

	}

}
