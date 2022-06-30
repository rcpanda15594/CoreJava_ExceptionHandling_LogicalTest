package exc.test;

public class AccessVariablFromTrytoCatch {

	public static void main(String[] args) {
		int a = 10;
		try {
			int b= 20;
			System.out.println(a);
			System.out.println(b);
			
		} catch (Exception e) {
			a=30;
			//b=40;
			
		}
		System.out.println(a);
	//	System.out.println(b);
	}

}
