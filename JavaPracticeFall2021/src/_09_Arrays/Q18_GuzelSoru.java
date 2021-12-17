package _09_Arrays;

import java.util.Arrays;

public class Q18_GuzelSoru {
	public static void main(String[] args) {
		// kullanıcıdan alınan bir String'deki herbir karakterin adedini
		// bir array içinde yazdıran bir java programı yazın.
		// String "Javacilar cook afilli" ise cevap şöyle olmalıdır:
		// { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}

		String str = "Javacilar cook afilli";
		String arr[] = str.replaceAll("\s", "").split("");
		String arrKontrol = "";
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (!arrKontrol.contains(arr[i])) {
				arrKontrol += arr[i];
			}

		}
		String arrYeni[] = new String[arrKontrol.length()];

		int counter = 0;
		for (int i = 0; i < arrKontrol.length(); i++) {
			String karakter = arrKontrol.substring(i, i + 1);
			for (int j = 0; j < arr.length; j++) {
				if (karakter.equals(arr[j])) {
					counter++;
				}
				arrYeni[i] = karakter + " = " + counter;
			}
			counter = 0;
		}System.out.println(Arrays.toString(arrYeni));

//		int counter = 0;
//		for (int i = 0; i < arr.length; i++) {
//
//			for (int j = 0; j < arr.length; j++) {
//
//				if (arr[i].equals(arr[j])) {
//					counter++;
//				}
//
//			}
//			System.out.println(arr[i] + " :" + counter + " kez var.");
//		}			

//		
//		  String str = "Javacilar cook afilli";
//
//	        int count[] = new int[256];
//
//	        for (int i = 0; i < str.length(); i++)
//
//	            count[str.charAt(i)]++;
//
//	        System.out.println(Arrays.toString(count));
//
//	        char ch[] = new char[str.length()];
//
//	        for (int i = 0; i < str.length(); i++) {
//	            ch[i] = str.charAt(i);
//
//	            int find = 0;
//
//	            for (int j = 0; j <= i; j++) {
//	                // If any matches found:Herhangi bir eşleşme bulunursa
//
//	                if (str.charAt(i) == ch[j])
//	                    find++;
//	            }
//
//	            if (find == 1)
//	                System.out.print(str.charAt(i) + " = " + count[str.charAt(i)]+", ");
//	        }

	}
}
