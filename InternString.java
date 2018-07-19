
public class InternString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Vinoth";
		String b = "Vinoth";
		String obj = new String("Vinoth");
		System.out.println(a==obj);
		System.out.println(a==b);
		System.out.println(obj.intern());
		System.out.println(a.equals(obj));
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase("vinoth"));
		System.out.println(a.charAt(3));
		System.out.println(a.codePointAt(1));
	}

}
