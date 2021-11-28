package day_01;

public class HomeWorkVariablesQ_5 {

	public static void main(String[] args) {
	
		/*  Problem Tanımı
        Bir dik üçgenin iki dik kenarını alarak hipotenüsünü hesaplayan kod yazınız.
        Örnek Ekran Çıktısı
        birinci kenar: 12
        ikinci kenar: 5
        hipotenus: 13      */
		
		int birinciKenar = 12;
		int ikinciKenar = 5;
		int hipotenus = (int) Math.sqrt((birinciKenar * birinciKenar) + (ikinciKenar*ikinciKenar));
	
		System.out.println(hipotenus);
	
	}

}
