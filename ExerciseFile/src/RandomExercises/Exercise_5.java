package RandomExercises;

public class Exercise_5 {

	public static void main(String[] args) {
		/*
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz. 
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		*/ 
		
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		char harf1 = pickName.charAt(0);
		char harf2 = pickName.charAt(11);
		char harf3 = pickName.charAt(8);
		System.out.print(harf1 + " " + harf2 + " " + Character.toLowerCase(harf3));
		
		
	}

}
