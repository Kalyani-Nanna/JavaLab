
package dec_19_24;

import java.util.Scanner;
import java.util.function.Function;

public class FunctionApplier 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String:");
		String str=sc.nextLine();
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		Function<String,Integer> f1=(String s)->s.length();
		System.out.println("String Length of"+str+"is" +f1.apply(str));
		

		Function<Integer,Double> f2=(Integer a)->a/2.0;
		System.out.println("Result of dividing of"+num+"by 2 is" +f2.apply(num));
		sc.close();
	}

}
