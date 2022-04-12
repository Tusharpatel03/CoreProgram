 package Com.Bridgelab.CoreProgram;
		/**
		 * Java Program to Swap Two Numbers
		 * 
		 * @author : Tusharpatel
		 *
		 */
  import java.util.Scanner;
  import Utility.Util;
  
  public class SwapNumber {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter number  to swap :");
  int first = sc.nextInt();
  int second = sc.nextInt();
  Util.swapNo(first, second);
 			}
		}