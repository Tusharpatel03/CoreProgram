package Com.Bridgelab.CoreProgram;
		/**
		 * Program to Prints the Nth Harmonic number.
		 * 
		 * @author : TusharPatel
		 *
		 */
  import java.util.Scanner;
  import Utility.Util;
  
  public class HarmonicNumber {
  public static void main(String[] args) {
  System.out.print("Enter Nth Harmonic no : ");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  Util.harmonicNo(num);
			}
		}

