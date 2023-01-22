package JavaCollection;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class It {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> countries = new LinkedList<>();
int result;
		countries.add("Chandrapur");
		countries.add("Nagpur");
		countries.add("Wani");
		countries.add("Ballarpur");
		countries.add("Tadoba");
		result = countries.get(0).compareTo("Chandrapur");
		System.out.println(result);
		
		
		It i = new It();
		
		i.printlist(countries);
		System.out.println("***************");
		countries.sort(null);
		i.printlist(countries);
		System.out.println("***************");
		Collections.reverse(countries);
		i.printlist(countries);
		
	}
	void printlist(List<String> list) {
       Iterator<String> iterator = list.iterator();
       while (iterator.hasNext()) {
		System.out.println("Elemnet: "+ iterator.next());
		
	}
		
		
	}

}
