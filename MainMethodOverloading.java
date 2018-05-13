
public class MainMethodOverloading {

	/**
	 * @param args
	 */
	public static void main(String args){System.out.println("main with String");}  
	
	//JVM calls main() method which receives string array as arguments only
	public static void main(String[] args){
		System.out.println("main with String[]");
		}  
	public static void main(){System.out.println("main without args");}

}
