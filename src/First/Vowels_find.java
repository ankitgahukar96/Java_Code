package First;

public class Vowels_find {
	public static void main(String[] args) {
		
		String word = "I am Ankit Rambhau Gahukar";
		
		String str = word.toUpperCase();
		System.out.println(str);
		
//		String vowels = "";
		
		for(int i = 0; i<str.length(); i++)
		{
			if(str.charAt(i)=='A' || str.charAt(i)=='E' || str.charAt(i)=='I' || str.charAt(i)=='O' || str.charAt(i)=='U')
			{
				System.out.println(str.charAt(i)+ "=" + i);
			}
		}
		
	}

}
