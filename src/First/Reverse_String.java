package First;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		String str = "Ankit";
		String reverse = "";
		
		System.out.println(str.length());
		
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse = reverse + str.charAt(i);
		}
		
		System.out.println("This is solution" + " "+ reverse);
	}

}
