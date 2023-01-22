package First;

import java.util.Arrays;

public class RemoveDuplicateCharString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "   programming\t";
		
		StringBuilder sb = new StringBuilder();
//		System.out.println(str.chars());
		
		System.out.println(str.strip());
		
		int[] array = {1, 2, 3, -1, -2, 4};

		Arrays.sort(array);
//		System.out.println();

		System.out.println(Arrays.toString(array));

	}

}
