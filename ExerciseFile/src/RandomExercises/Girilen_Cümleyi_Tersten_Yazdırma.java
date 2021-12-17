package RandomExercises;

import java.util.Scanner;

public class Girilen_Cümleyi_Tersten_Yazdırma {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir cümle girin girin");
		String isim=scan.nextLine();
		
		String isimFormatlı = isim;
		int girilenKelimeSayısı = 0;
		
		while (isimFormatlı.contains(" ")) {
			
			String ilkKelime=(isimFormatlı.substring(0, isimFormatlı.indexOf(" ")));
			isimFormatlı=((isimFormatlı.substring(isimFormatlı.indexOf(ilkKelime)+4)));
			girilenKelimeSayısı++;
		}	
		for(int i=1; i<girilenKelimeSayısı; i++) {
			
			if(isim.contains(" ")) {
				int idxSonBosluk = isim.lastIndexOf(" ");
				String station = isim.substring(idxSonBosluk+1);
				System.out.print(station+ " ");
				isim=isim.substring(0, idxSonBosluk);
			}
		}System.out.println(isim);
		
		scan.close();
	}

}
