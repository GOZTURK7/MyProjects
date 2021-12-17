package java_Oca_Interview_Questions;

public class Interview_Questions_13 {

	public static void main(String[] args) {


		 /*
	     Write a Java Program to swap two numbers
	         
	     Swap (takas) islemini --> a=3, b=5 iken  a=5, b=3 degerlerini alması islemidir.
	     iki yoldan yaptiginiz java kodunu yaziniz.
	     1.Yol: 3. degisken kullanarak
	     2.Yol: 3. degisken kullanmadan
	*/
		
		int a = 3;
		int b = 5;
		System.out.println("ilk hali:    a :"+a + " , b :" + b);
		a=b + a;
		b=a-b;
		a=a-b;
		
		System.out.println("ikinci swap: a :"+a + " , b :" + b);
		
		int c=a;
		a=b;
		b=c;
		
		System.out.println("üçüncü swap: a :"+a + " , b :"+b);
		
		
		
		
	}

}
