
class  DerivedFinal{
	
	// Final methods cannot be overridden
	
	final int add(int a, int b){
		return a+b;
	}
}
 public class FinalMethod extends DerivedFinal{
	public static void main(String[] args) {
		DerivedFinal fm = new DerivedFinal();
		System.out.println(fm.add(10, 20));
	}
}
