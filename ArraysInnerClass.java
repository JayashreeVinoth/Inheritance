import java.util.ArrayList;


public class ArraysInnerClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> innerString = new ArrayList<String>(){{
			add("JJ");
			add("Vinoth");
		}};
		System.out.println(innerString);
	}

}
