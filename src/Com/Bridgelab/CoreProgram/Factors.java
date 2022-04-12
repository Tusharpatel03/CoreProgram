package Com.Bridgelab.CoreProgram;

		/**
		 * Program to Computes the prime factor of N using brute force
		 * 
		 * @author : TusharPatel
		 * 
		 */
  import java.util.Scanner;
  import Utility.Util;
  
  public class Factors {
  public static void main(String[] args) {
  System.out.println("Enter number:");
  Scanner sc = new Scanner(System.in);
  int num = sc.nextInt();
  Util.primeFactor(num);
			}
		}
