import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import org.xml.sax.helpers.NamespaceSupport;


public class LoopArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> names = new ArrayList<String>(Arrays.asList("JJ","Vinoth"));
		for(int i = 0;i < names.size();i++){
			System.out.println(names.get(i));
		}
		for(String i:names){
			System.out.println(i);
		}
		int count = 0;
		while(count < names.size()){
			System.out.println(names.get(count));
			count++;
		}
		Iterator iter = names.iterator();
		while(iter.hasNext()){
			System.out.println(iter.next());
		}
	}

}
