
public class BlankFinalVariable {
	
	final int rollNumber;
	BlankFinalVariable(int roll) {
		rollNumber = roll;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BlankFinalVariable var = new BlankFinalVariable(3);
		BlankFinalVariable var1 = new BlankFinalVariable(4);
		System.out.println(var.rollNumber+" "+var1.rollNumber);
	}

}
