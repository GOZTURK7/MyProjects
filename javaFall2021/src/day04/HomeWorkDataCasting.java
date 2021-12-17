package day04;

public class HomeWorkDataCasting {

	public static void main(String[] args) {
		
		// 1- byte veri tipinde bir değişken oluşturun, short, int, float, double data tiplerinde birer değişken oluşturup
		// adım adım widening yapın ve yazdırın.
		
		byte x = 120;
		
		short a = x;
		
		int b = x;
		
		float c = x;
		
		double d = x;
		
		System.out.println("x: " + x + " a: " + a + " b: "+ b + " c: " + c + " d: "+ d);

		
		
		// 2- int veri türünde bir değişken oluşturun ve adım adım narrowing yapın ve yazdırın.
		
		int sayi1 = 300;
		
		short sayi2 = (short) sayi1;
		
		byte sayi3 = (byte) sayi1; //44 byte (-128, +128 arası) data tipine integer 300 sığmayacağından 
									// başa dönüp tekrar sayıyor ve 300'üncü birime gelince duruyor
									// bu 300'üncü birimde sayı doğrusu üzerinde +44'e tekabül ediyor.
		
		System.out.println("sayi1: "+sayi1+" sayi2: "+sayi2+" sayi3: "+sayi3);
		
		
		// 3-Float data türünde bir variable oluşturun ve yazdırın.
		
		float sayi4 = 2.34556f;
		
		System.out.println(sayi4);
		
		
		// 4- double 255.36 sayısını int'a ve sonra da oluşturduğunuz int sayıyı byte'a çevirip yazdırın.
		
		double sayi5 = 255.36;
		
		int sayi6 = (int) sayi5; //OUTPUT: 255
								//(int'e onalıklı bir data türünü çevirince virgülden sonraki kısmı
								// dikkate almıyor ve veri kaybına uğruyoruz ancak int bir data türünü
								// ondalıklı bir data türüne (float, double) çevirince bir sıkıntı olmuyor.
		
		byte sayi7 = (byte) sayi5; // OUTPUT: -1 
									// burada byte data türününün sınırı olan 127'ye kadar gidip 
									// sayı doğrusunun başına -128'e gelip saymaya devam ediyor ve 255'inci adım -1'de 
									// bitiyor. byte da tamsayı bir data türü olduğundan virgülden sonraki kısmı baştan görmüyor.
		
		System.out.println("sayi5: "+sayi5+" sayi6: "+sayi6+" sayi7: "+sayi7);
		
		
		// 5- int iki sayıyı birbirine böldürün ve sonucu yazdırın.
		
		int sayi8 = 12;
		int sayi9 = 4;
		
		System.out.println(sayi8 / sayi9);
		
		
		// 6- int bir sayıyı double bir sayıya bölün ve sonucu yazdırın.
		
		int sayı10 = 100;
		
		double sayı11 = 12.4;
		
		System.out.println(sayı10 / sayı11);

		
		// 7- farklı data tipleri ile işlem yapıp sonuçları yazdıralım.
		
		System.out.println(sayı11 / sayı10);

		byte byte1 = 120; 
		short short1 = 100; 
		int int1 = 1457; 
		long long1= 12; 
		float float1 = 305858848485844858.94959506065f;
		double double1 = 94959.9490400595950040404955950;
		
		System.out.println("-----TOPLAMLAR------");
		System.out.println("byte1+double1: " + byte1+double1 + "\nshort1+float1: "+ short1+float1 + "\nint1+long1: "+ int1+long1);

		System.out.println("-----FARKLAR------");
		System.out.println("byte1-double1: " + (byte1-double1) + "\nshort1-float1: "+ (short1-float1) + "\nint1-long1: "+ (int1-long1));
		
		System.out.println("------BÖLMELER------");
		System.out.println("byte1/double1: " + (byte1/double1) + "\nshort1/float1: "+ (short1/float1) + "\nint1/long1: "+ (int1/long1));
		
		System.out.println("---ÇARPIMLAR------");
		System.out.println("byte1*double1: " + (byte1*double1) + "\nshort1*float1: "+ (short1*float1) + "\nint1*long1: "+ (int1*long1));
		
		
		//   SCRATCH PAPER
		
		
		int t = 12;
		
		int z = t++;
		
		t += 5;
		
		z-= 3;
		
		z/=3;
		
		t/=10;
		
		System.out.println(z + " " + t);

		
		
	}

}
