package First;

public class Prime_number {
public static void main(String[] args) {
	System.out.println(isPrime(25));
}

public static boolean isPrime(int n) {
	if(n==0 || n==1) {
		return false;
	}
	if(n==2) {
		return true;
	}
	
	for(int i =2; i<n/2;i++) {  
		if(n%i==0) {
			return false;
		}
		
	}
	return true;
}
}

//int num = 7;
//int temp;
//boolean isPrime=true;
//for(int i =2;i<=num/2;i++) {
//	temp= num%2;
//	if(temp==0) {
//		isPrime=false;
//		break;
//	}
//	return isPrime;
//}
