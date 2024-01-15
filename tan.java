package calci;

import java.util.Scanner;

public class tan {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double angleDegrees = scanner.nextDouble();

	        double angleRadians = Math.toRadians(angleDegrees);

	        double tanValue = Math.tan(angleRadians);

	        System.out.println(tanValue);

	    }

}
