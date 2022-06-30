package exc.test;

public class CheckInnerTryCatch_Inside_TryCatch {

	public static void main(String[] args) {
		try {
			try {

				
			} catch (Exception e) {
				System.out.println("inside main try");
			}
		} catch (Exception e) {
			try {

			} catch (Exception e1) {
			}
		} finally {
			try {

			} catch (Exception e) {
			}
		}

	}

}
