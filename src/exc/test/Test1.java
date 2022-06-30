package exc.test;

public class Test1 {

	public static void main(String[] args) {

		System.out.println(avoidThis("testTry"));
		
		////String s = avoidThis("testTry");
		//System.out.println(s);
		//System.out.println(avoidThis("testCatch"));

	}

	@SuppressWarnings("finally")
	private static String avoidThis(String string) {
		try {
			if (string.equals("testTry")) {
				System.out.println("In try block " + string);
			} else if (string.equals("testCatch")) {
				throw new Exception();
			}
			return "return from try-catch";
		} catch (Exception e) {
			System.out.println("In catch block " + string);
			return "return from catch";
		} /*finally {
			return "return from finally";
		}*/
	}

}
