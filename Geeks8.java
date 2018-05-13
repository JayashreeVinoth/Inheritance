package Geeks;
class ConstructorA{
	int a, b;
	ConstructorA(int aa, int bb){
		this.a = aa;
		this.b = bb;
	}
}
class ConstructorB{
	int a, b;
	public ConstructorB(int aa, int bb) {
		this.a =  aa;
		this.b = bb;
	}
	public String toString(){
		return String.format(a+" "+b);
	}
}
public class Geeks8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ConstructorA one = new ConstructorA(10, 15);
		System.out.println(one);
		System.out.println(one instanceof ConstructorA);
		ConstructorB two = new ConstructorB(5, 54);
		System.out.println(two);
	}

}
