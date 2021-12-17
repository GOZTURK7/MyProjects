package RandomExercises;

import java.util.Scanner;

public class Ali_ata {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen isminizi ve kaç kelime olduğunu girin");
		String isim=scan.nextLine();
		int num = scan.nextInt();
		String isimFormatlıSon="";
		
		
		for(int i=1; i<num; i++) {
			
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
