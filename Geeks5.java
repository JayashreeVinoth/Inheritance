package Geeks;

public class Geeks5 {
	private void show(){
		System.out.println("outer class");
	}
class innerA extends Geeks5{
	private void show(){
		System.out.println("inner class");
	}
}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// We need instance of Geeks5 to create instance for innerA
		Geeks5 a = new Geeks5();
		innerA b = a.new innerA();
		b.show();
		a.show();
	}
}
