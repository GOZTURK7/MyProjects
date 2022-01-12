package LambdaPractice;

import java.util.List;

public class Q07 {
	
	
	
	public static void main(String[] args) {
		
		 //String isimlerden olusan bir list olusturnuz
		List<String> list = List.of("Ali", "Ayşe", "Nuran", "Gökhan", "Hatice", "Yusuf", "Burhan");
		
		
	    //List'deki isimlerden "a" ve "n" icerenlerin harf sayilarinin toplamini ekrana yazdiriniz
		System.out.println(
				list.
				stream().
				filter(t->t.toLowerCase().contains("a") && t.contains("n")).
				mapToInt(t->t.length()).sum());
		
		
	    //List'deki isimlerden ilk harfi son harfinden alfabetik olarak onde olan isimleri ekrana yazdirin
		
				list.stream().
				filter(t->t.toLowerCase().charAt(0) < t.charAt(t.length()-1)).
				forEach(System.out::println);
				
		
		
	}
   
}
