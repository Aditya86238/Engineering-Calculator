package calci;

import java.util.Scanner;

public class log {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double d = scanner.nextDouble();
        if(d>0)
        {
        double ans = Math.log(d);
        System.out.println(ans);
        }
        else {
        System.out.println("error");
        }
        
    }

}
