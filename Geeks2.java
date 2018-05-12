package Geeks;
class classAA{
	final public void show(){
		System.out.println("Inside classA");
	}
}
class classBB extends classAA{
	public void show(){
		System.out.println("Inside classB");
	}
}
public class Geeks2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classAA a = new classBB();
		// final methods cannot be overridden
		a.show();
	}

}
