package Com.Bridgelab.CoreProgram;

		/**
		 * This program takes a command-line argument N and prints a table of the powers
		 * of 2 that are less than or equal to 2^N.
		 * 
		 * @author : TusharPatel
		 *
		 */
		import java.util.Scanner;
		import Utility.Util;
		
		public class PowerofTwo {
		public static void main(String[] args) {
		System.out.println("Enter the power : ");
		Scanner sc = new Scanner(System.in);
		int pwr = sc.nextInt();
		Util.powerOfTwo(pwr);
			}
		}

