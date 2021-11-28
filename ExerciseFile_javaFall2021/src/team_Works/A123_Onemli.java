package team_Works;

public class A123_Onemli {

	public static void main(String[] args) {

		
		System.out.println(" //////// equals() methodu ile //////////");


		
		if ((" string".trim()).equals("string")) { 
			System.out.println("true1");
		}
		if (!("str ing".trim()).equals("string")) { 
			System.out.println("false1");
		}if (("string ".trim()).equals("string")) { 
			System.out.println("true2");
		}if (("string".trim()).equals("string")) { 
			System.out.println("true3");
		}
		
		
		
		System.out.println(" //////// == operatörü ile //////////");
		
		
		if ((" string".trim())== "string") { 
			System.out.println("true1");
		}
		if (("str ing".trim())== "string") { 
			System.out.println("true4");
		}if (("string ".trim())== "string") { 
			System.out.println("true2");
		}if (("string".trim())== "string") { // burada trim çalışmadığı için "string"'in referansı değişmiyor ve 
			// == operatörü kontrol ettiğinde referansı da değeri de aynı gördüğünden true dönüyor ve if bloğu çalışıyor
			// ama trim () çalışırsa "string" stringi üzerinde bir işlem yapıldığından bunun farklı bir refernas ile 
			// kaydediyor ve == operatörü değeri karşılaştırdığında aynı ama referansı farklı görüyor ve if çalışmıyor.
			System.out.println("true3");
		}

	}

}
