package replit_Questions;

import java.util.Scanner;

public class ForLoop_ReplitQ3 {

	public static void main(String[] args) {
		/*SORU3:
			Bir String icerisinde yinelenen karakterleri döndüren bir kod yazıniz.(mülakat Sorusu)
			Input :
			String str=“Javaisalsoeasy”
			Output: a s
			*/
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir isim string  yazınız");
		String str = scan.nextLine();
		
		String repeat = "";
		
		for(int i=0; i<str.length(); i++) {
			
			String c = String.valueOf(str.charAt(i));	
			
			if(str.indexOf(c) != str.lastIndexOf(c) && !repeat.contains(c)) {	
				repeat+=str.charAt(i);
				}
			}System.out.println(repeat);
	
		
		
	}

}
