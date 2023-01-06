package First;

import java.util.Scanner;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1;
		Scanner sc = new Scanner(System.in);
		int k =0;
		System.out.println("Enter a value");
		int n = sc.nextInt();

		System.out.print(a+ " " + b);
		
		while(k<=n)
		{
			k = a+b;
			System.out.print(" " +k);
			 a =b;
			 b=k;
		}
	}

}
