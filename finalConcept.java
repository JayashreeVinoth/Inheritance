
final class checkA{
	checkA(int a){
		System.out.println(a);
	}
}
// final class is not inheritable
/*class checkB extends checkA{
	
}*/
public class finalConcept {
	final void sum(int a, int b){
		System.out.println(a+b);
	}
	
	// final methods are not overrideable
	/*sum(int a, int b, int c){
		System.out.println(a+b+c);
	}*/

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String  a = "jj";
		//a = "vin";   // final variables are not changeable
		
		System.out.println("final variable is not changeable\nfinal method is not overrideable\nfinal class is not inheritable");
	}

}
