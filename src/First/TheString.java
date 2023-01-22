package First;


public class TheString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "    Java is a programming lang";
		
		//Convert into char array
		char[] chars = str.toCharArray();
		System.out.println(chars);
		
		String str1 = "";
		
		for(int i = 0;i<chars.length;i++) {
//			System.out.println(i);
			if(chars[i]!= ' ')
			str1 = str1 + chars[i];
//			str1 = str1 + str.charAt(i);
		}
		System.out.println(str1);
		
		//method 3
		String str3 = str.replaceAll("\\s", "");
		System.out.println("method 3");
		System.out.println(str3);
		

	}

}

