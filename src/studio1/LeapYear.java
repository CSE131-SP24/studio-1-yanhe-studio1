package studio1;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("What is your year?");
		int year = in.nextInt();
		
		boolean leapyear = ((year/4 == year/4.0) && (year/100 != year/100.0))||(year/400 == year/400.0);
		System.out.println(year + " is a leap year: " + leapyear);
		
	}
	/* Creative exercise:
	 * int
	 * boolean
	 * int
	 * double
	 * string
	 * double
	 */
	
}
