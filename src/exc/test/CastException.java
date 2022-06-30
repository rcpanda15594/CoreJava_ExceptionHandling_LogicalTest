package exc.test;

public class CastException {

	public static void main(String[] args) {

	//	int age = Integer.parseInt(args[0]);
		int age =85;
		if (age > 60) {
			throw new ToOldException("Please wait some more time you will get best match");
		} else if (age < 18) {
			throw new TooYoungException("Your age is alread crossed marraige age ..no chance for getting");
		} else {
			System.out.println("You will get match details seen by email");
		}
	}

}
