package Geeks;
class GrandParent{
	public void print(){
		System.out.println("Grand Parent");
	}
}
class Parent extends GrandParent{
	public void print(){
		super.print();
		System.out.println("Parent");
	}
}
class Child extends Parent{
	public void print(){
		super.print();
		System.out.println("Child");
	}
}
public class Geeks7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c = new Child();
		c.print();
	}

}
