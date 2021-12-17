package _00_day_01;

public class Q_01 {

	public static void main(String[] args) {
		// Write a Java program to break an integer into a sequence of individual digits.
		// Hint: use / and %
		// ex: input: 12345
//		    output: 1
//		            2
//		            3
//		            4
//		            5
		
		int sayi = 12345;
		int birler = sayi%10;
		int onlar = (sayi/10)%10;
		int yüzler = (sayi/100)%10;
		int binler = (sayi/1000)%10;
		int onBinler =(sayi/10000);
		
		System.out.println(onBinler);
		System.out.println(binler);
		System.out.println(yüzler);
		System.out.println(onlar);
		System.out.println(birler);

		System.out.println(onBinler+"\n"+binler+"\n"+yüzler+"\n"+onlar+"\n"+birler);
		
	}

}
