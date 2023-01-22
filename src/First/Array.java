package First;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] stringArray = {"Ankit","Harshal","Rambhau","Saangita"};
		
		//foreach loop = Introduce post java version 8
		for(String i : stringArray) {
			System.out.println(i);
		}

		System.out.println(stringArray.length);
	}

}
