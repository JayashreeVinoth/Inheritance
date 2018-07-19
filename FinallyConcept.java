
public class FinallyConcept {

	/*
	 * Finally block is used to execute important code like closing connections.
	 * Finally block follws try/catch block
	 * Finally is always executed whether exception is habdled or not
	 * Finally will be executed by JVM even if it is not present in the code
	 */
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			System.out.println("inside try");
			int a = 10/0;
		} 
		catch(Exception e){
			System.out.println("inside catch "+e);
		} 
		finally{
			System.out.println("inside finally");
		}
	}

}
