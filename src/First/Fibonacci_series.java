package First;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
	
//		int a=1,b=1;
//		Scanner sc = new Scanner(System.in);
//		int k =0;
//		System.out.println("Enter a value");
//		int n = sc.nextInt();
//
//		System.out.print(a+ " " + b);
//		
		//the value of n is indicate that upto which number you need to print value
//		while(k<=n)
//		{
//			k = a+b;
//			if(k>=n)
//				break;
//			System.out.print(" " +k);
//			 a =b;
//			 b=k;
//		}
		
		int a=0,b=1;
		System.out.println(a+" "+b);
		int z =0;
		//if you want to print only 3 series number use i=3
		for(int i=1;i<=3;i++) {
			z= a+b;
			System.out.println(z);
			a=b;
			b=z;
		}
	}

}
