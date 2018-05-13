package Geeks;
class classAAA{
	public static void show(){
		System.out.println("Inside classA");
	}
}
class classBBB extends classAAA{
	public static void show(){
		System.out.println("Inside classB");
	}
}
public class Geeks3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classAAA a = new classBBB();
		a.show();
	}

}
