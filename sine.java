package calci;
import java.util.Scanner;

public class sine {

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double angleDegrees = scanner.nextDouble();

	        double angleRadians = Math.toRadians(angleDegrees);

	        double sineValue = Math.sin(angleRadians);

	        System.out.println(sineValue);

	    }
	}



