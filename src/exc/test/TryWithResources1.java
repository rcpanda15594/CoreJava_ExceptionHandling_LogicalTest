package exc.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResources1 {

	public static void main(String[] args) {

		try(BufferedReader br = new BufferedReader(new FileReader("input.txt")))
		{
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found exception");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOException");
			//e.printStackTrace();
		}
	}

}
