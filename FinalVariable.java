
public class FinalVariable {

	final int c;
	FinalVariable() {
		c = 30;
	}
	final static int d = 40;
	final static int e;
	static{
		e = 50;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		final int a = 10;
		final int b;
		{
			b = 20;
		}
		System.out.println("Direct final variable "+a);
		System.out.println("Instance initializer block "+b);
		FinalVariable variable = new FinalVariable();
		int cd = variable.c;
		System.out.println("constructor "+cd);
		System.out.println("Direct static final variable "+d);
		System.out.println("Inside static block "+e);
		
		final StringBuilder sb = new StringBuilder();
		sb.append("a");
		sb.append("b");
		//sb = new StringBuilder();
		System.out.println(sb);
	}

}
