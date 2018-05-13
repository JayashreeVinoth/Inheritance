//Different in type of arguments
public class MethodOverloading_2 {

	void add(int a, int b){
		System.out.println(a+b);
	}
	void add(double a, double b){
		System.out.println(a+b);
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading_2 two = new MethodOverloading_2();
		two.add(1, 2);
		two.add(10.2, 1.1);
		
	}

}
