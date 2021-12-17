package day40_Exeption;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C05_ParentChildExceptions {

	public static void main(String[] args) {


		try {
			FileInputStream fis = new FileInputStream("src/day40_Exeption/yazi.txt");
			int k=0;
			while((k=fis.read())!=-1) {
				System.out.print((char)k);
			}
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Görev tamamlandı.");
	}

}
