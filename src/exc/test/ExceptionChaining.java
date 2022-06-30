package exc.test;

public class ExceptionChaining {

	@SuppressWarnings("null")
	public static void main(String[] args) {

		try {
			String s =null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("Exception Chainging Happens");
			throw new RuntimeException(e);
			}
	}

}
