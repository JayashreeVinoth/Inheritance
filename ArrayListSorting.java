import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class ArrayListSorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> intArray = new ArrayList<Integer>(Arrays.asList(10,4,1,34,9,100,54));
		System.out.println("Before Sorting "+ intArray);
		Collections.sort(intArray);
		System.out.println("Ascending "+intArray);
		Collections.reverse(intArray);
		System.out.println("Descending "+intArray);
		ArrayList<Integer> intArray2 = new ArrayList<Integer>(Arrays.asList(10,4,1,34,9,100,54));
		System.out.println("Before Sorting "+ intArray2);
		Collections.sort(intArray2,Collections.reverseOrder());
		System.out.println("Descending order using reverseOrder method "+intArray2);
		System.out.println("**************");
		ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("JJ","Ramya","Vinoth","Vnooo","Srinivasan","Jayashree"));
		System.out.println("Before Sorting"+stringList);
		Collections.sort(stringList);
		System.out.println("Ascending Order "+stringList);
		Collections.reverse(stringList);
		System.out.println("Descending Order "+stringList);
		ArrayList<String> stringList2 = new ArrayList<String>(Arrays.asList("JJ","Ramya","Vinoth","Vnooo","Srinivasan","Jayashree"));
		System.out.println("Before Sort "+stringList2);
		Collections.sort(stringList2,Collections.reverseOrder());
		System.out.println("Descending order using reverseOrder method "+stringList2);
	}

}
