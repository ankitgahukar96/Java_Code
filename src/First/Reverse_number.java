package First;

public class Reverse_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1234;
		
		int reverse=0;
		
		while(n!=0) {
		    reverse= reverse*10 + n%10;
		    n = n/10;
		    
		}
System.out.println(reverse);
	}

}
