package First;

import java.util.ArrayList;
import java.util.List;

public class TheArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list = new ArrayList<>();
		
		list.add("Ankit");
		list.add("Nikhil");
		list.add("Rushab");
		list.add("Roshan");
		
		
		
		String[] str = new String[list.size()];
		for(int i =0;i<list.size();i++) {
			str[i]= list.get(i);
	}
		
		for(String s : str) {
			System.out.println(s);
		}

	}

}
