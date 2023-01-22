package JavaCollection;
import java.util.ArrayList;

public class Arraylist {

	static ArrayList<String> list = new ArrayList<>();
	
	void displyList(ArrayList<String> name) {
		for(String names:name) {
			System.out.println(names);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		list.add("Ankit");
		list.add("Harshal");
//		System.out.println(list);
		Arraylist xyz = new Arraylist();
		xyz.displyList(list);
		
	}
	
	

}
