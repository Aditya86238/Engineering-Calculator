import java.util.Scanner;

public class add {
	
	public static double add(double a,double b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(add(a,b));
		
	}

}
