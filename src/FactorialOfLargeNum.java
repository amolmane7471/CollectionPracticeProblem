import java.math.BigInteger;
import java.util.Scanner;

public class FactorialOfLargeNum {

	  static BigInteger factorial(int num)
	    {
	/*
	 * BigInteger class is used for the mathematical operation which 
	 * involves very big integer calculations that are outside the limit 
	 * of all available primitive data types.
	 */

		  //initialize fact
		  BigInteger fact = new BigInteger("1"); // BigInteger fact = BigInteger.One;
	 
	        for (int i = 2; i <= num; i++)
	            fact = fact.multiply(BigInteger.valueOf(i));
	        return fact;
	    }
	 
	   
	    public static void main(String args[]) throws Exception
	    {
	    	Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number : ");
	    	int num = sc.nextInt();
	        System.out.println(factorial(num));
	        sc.close();
	    }

}
