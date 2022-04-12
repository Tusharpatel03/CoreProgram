package Com.Bridgelab.CoreProgram;	

		/**
		 * Java Program to Find the Largest Among Three Numbers
		 * 
		 * @author : TusharPatel
		 *
		 */
   import java.util.Scanner;
   import Utility.Util;
   
   public class LargestNumber {
   public static void main(String[] args) {
   int num, num2, num3;
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter first number : ");
   num = sc.nextInt();
   System.out.println("Enter second number : ");
   num2 = sc.nextInt();
   System.out.println("Enter third number : ");
   num3 = sc.nextInt();
   int No = Util.largestNo(num, num2, num3);
   System.out.println("Largest number : " + No);
			}
		}




	
