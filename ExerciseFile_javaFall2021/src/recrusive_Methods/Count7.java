package recrusive_Methods;

public class Count7 {

	public static void main(String[] args) {

		int num = 1772;

		System.out.println(count7(num));

	}

	private static int count7(int num) {
	
		if(num==0) return 0;
		
		if(num%10==7) return 1 + count7(num/10);
		
		return count7(num/10);

	}

//	private static int count7(int n) {
//
//		 if(n == 0) return 0;
//		 if(n % 10 == 7) return 1 + count7(n / 10);
//		 return count7(n / 10);
//	}	 
//	
	
	
	
	
}
