package First;

public class Fibonacci_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1,b=1;
		int k =0;

		System.out.println(a+ " " + b);
		
		while(k<=50)
		{
			k = a+b;
			System.out.println(k);
			 a =b;
			 b=k;
		}
	}

}
