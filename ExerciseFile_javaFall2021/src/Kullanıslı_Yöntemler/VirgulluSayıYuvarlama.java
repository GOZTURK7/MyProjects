package Kullanıslı_Yöntemler;

import java.text.DecimalFormat;
import java.text.Format;

public class VirgulluSayıYuvarlama {

	public static void main(String[] args) {
		
		Format decimal = new DecimalFormat("0.000");
        double a = 23.00000005;
        System.out.println(decimal.format(a));
	}

}
