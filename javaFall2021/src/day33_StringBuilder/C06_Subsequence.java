package day33_StringBuilder;

public class C06_Subsequence {

	public static void main(String[] args) {


		
		StringBuilder sb = new StringBuilder("Java ne kadar kolay");
		
		System.out.println(sb.substring(14)); // kolay (burada . nokta koyarsak string metodlarını kullanabiliriz)
		
		System.out.println(sb.subSequence(14, 19)); // kolay (burada . nokta koyarsak string metodları gelmiyor)


		
		
	}

}
