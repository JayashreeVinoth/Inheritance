// Different no of arguments
public class MethodOverloading_1 {

	void  concat(String a, String b, String c){
		System.out.println(a+b+c);
	}
	void concat(String a, String b){
		System.out.println( a+b);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading_1 one = new MethodOverloading_1();
		one.concat("Jayashree", "Seshadri", "Narasimman");
		one.concat("Vinoth", "Gopu");
	}

}
