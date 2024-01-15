package calci;

import java.util.Scanner;

public class cos {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double angleDegrees = scanner.nextDouble();

	        double angleRadians = Math.toRadians(angleDegrees);

	        double cosineValue = Math.cos(angleRadians);

	        System.out.println(cosineValue);

	    }
}
