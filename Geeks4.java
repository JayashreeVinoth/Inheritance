package Geeks;
class Base1{
	private  void show(){
		System.out.println("Inside base");
	}
}
public class Geeks4 extends Base1{
	// privatemethods cannot be overridden
	private  void show(){
		System.out.println("Inside derived");
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base1 b = new Geeks4();
		b.show();
	}
}
