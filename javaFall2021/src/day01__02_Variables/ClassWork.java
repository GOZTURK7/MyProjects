package day01__02_Variables;

public class ClassWork {

	public static void main(String[] args) {

		
		int sayi1 = 25;
		int sayi2 = 20;
		
		int istasyon; 
		
		istasyon = sayi1;
		sayi1 = sayi2;
		sayi2=istasyon;
		
		
		System.out.println("sayi1="+ sayi1 +" " + "ve" + " " + "sayi2=" + sayi2);
		
		/* 2- Verilen sayi1 ve sayi2 variable’larinin degerlerini 3.bir variable olmadan
		degistiren (SWAP) bir program yapiniz */
		                
		        int x=5 ; int y= 6;
		        System.out.println("Swap oncesi \nX : " +x+"\nY : "+y);
		        
		        x=x+y ; //Yeni durumda x=11 artik 
		        y=x-y; // y=11-6=5 ; artik yeni y=5
		        x=x-y ; // x 11 olmustu . 11 den y yani son y 65 idi 11-5=6
		        System.out.println("Yeni durumda \nX : "+x+ "\nY : " + y);
		
		
		
	}

}
