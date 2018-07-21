
public class FinalParameters {
	public FinalParameters(final int a) {
		System.out.println(a);
		//a = a + 1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FinalParameters fp = new FinalParameters(10);
	}

}
