  package Com.Bridgelab.CoreProgram;

  import java.util.Scanner;
  import Utility.Util;
  
    public class LeapYear {
	public static void main(String[] args) {
		int year = Util.input();

		if (Util.leapYear(year)) {
			System.out.println(" Leap Year");
		} else
			System.out.println("Not a leap Year");
	}
}