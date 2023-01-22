package First;

public class CallValueCallReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;
		CallValueCallReference obj = new CallValueCallReference();
		obj.displayValue(a);
		
	}
	
	void displayValue(int a) {
		System.out.println("current value of displayMethod is "+ a);
	}

}
