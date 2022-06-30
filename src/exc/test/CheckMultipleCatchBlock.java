package exc.test;

public class CheckMultipleCatchBlock {

	public static void main(String[] args) {
		String s = null;
		try {
			System.out.println(s.length());
			System.out.println(10 / 0);
		} //catch (NullPointerException | Exception e)  There should not be parent-child/child-parent relations
			catch (NullPointerException | ArithmeticException e) {
			System.out.println(e);
		}
	}

}
