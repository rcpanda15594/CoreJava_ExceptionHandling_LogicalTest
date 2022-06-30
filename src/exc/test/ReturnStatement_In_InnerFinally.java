package exc.test;

public class ReturnStatement_In_InnerFinally {

	public static void main(String[] args) {
		System.out.println(m1());
	}

	static int m1() {
		try {
			System.out.println("Outer try");
			try {
				System.out.println("Inner try");
			} catch (NullPointerException e) {

				System.out.println("Inner catch");
			} finally {
				System.out.println("Inner finally");
				return 10;
			}
			// System.out.println("After Outer try/catch/finally");

		} catch (NullPointerException e) {

			System.out.println("Outer catch");
		} finally {
			System.out.println("Outer finally");
		}
		System.out.println("After Outer try/catch/finally");
		return 30;
	}

}
