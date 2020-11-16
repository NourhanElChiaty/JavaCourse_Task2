import java.util.Scanner;

public class Task2_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter First number");
		int x = Scan.nextInt();
		
		System.out.println("Enter Second number number");
		int y =Scan.nextInt();
		
		
		int z = x;
		int w = y;
	     z+=w;
		System.out.println("addition is : " + z );
		
		int a = x;
		int b = y;
		
		a-=b;
		System.out.println("subtraction is : " + a );
		
		int c = x;
		int d =y;
		c*=d;
		System.out.println("multiplication is : " + c );
	
		int e = x;
		int f =y;
		e/=f;
		System.out.println("division is : " + e );
		
		int g = x;
		int h =y;
		g%=h;
		System.out.println("division is : " + g );
		
		
	}

}
