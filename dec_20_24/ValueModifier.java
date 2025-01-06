
package dec_20_24;

import java.util.Scanner;
import java.util.function.Consumer;

public class ValueModifier 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number:");
		int number=sc.nextInt();
		
		Consumer<Integer> c1=(Integer num)->System.out.println("After doubling the value: "+(num+num));
		modifyValue(number,c1);
		Consumer<Integer> c2=(Integer num)->System.out.println("After incrementing the value by 3: "+(num+3));
		modifyValue(number,c2);
		Consumer<Integer> c3=(Integer num)->System.out.println("After squaring the value: "+num*num);
		modifyValue(number,c3);
		sc.close();
	}

	private static void modifyValue(int number, Consumer<Integer> consumer) {
		consumer.accept(number);
	}

}
	
