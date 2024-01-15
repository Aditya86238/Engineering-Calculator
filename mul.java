package calci;

import java.util.Scanner;

public class mul {
	public static double multi(double a,double b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(multi(a,b));
		
	}

}
