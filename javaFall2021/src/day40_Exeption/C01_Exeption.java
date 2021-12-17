package day40_Exeption;

public class C01_Exeption {

	public static void main(String[] args) {


		int a = 20;
		int b = 0;
		
		try {
		
		System.out.println("Sayıların bölümü "+ (a/b));
		System.out.println("Görev tamamlandı.");

		}catch(ArithmeticException e) {
			System.out.println("Sıfıra bölüm yapılamaz.:");
			//System.out.println(e.getMessage());
			e.printStackTrace();
			//java.lang.ArithmeticException: / by zero
			//			at day40_Exeption.C01_Exeption.main(C01_Exeption.java:13)
		}
		
		
		System.out.println("Görev tamamlanıdı. ");
		
		
	}

}
