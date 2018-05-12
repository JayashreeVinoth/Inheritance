package Geeks;
class classA{
	public void show(){
		System.out.println("Inside classA");
	}
}
class classB extends classA{
	public void show(){
		System.out.println("Inside classB");
	}
}
public class Geeks1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classA a = new classB();
		a.show();
	}

}
