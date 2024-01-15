package calci;

import java.util.Scanner;

public class div {
	public static double divi(double a,double b)
	{
		if(b==0)
		{
			return 0;
		}
		return a/b;
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		//System.out.println(divi(a,b));
		double c=divi(a,b);
		if(c==0)
		{
			System.out.println("error");
		}
		else
		{
			System.out.println(c);
		}
		
	}

}
