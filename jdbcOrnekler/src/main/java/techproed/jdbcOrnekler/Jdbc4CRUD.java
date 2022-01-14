package techproed.jdbcOrnekler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Jdbc4CRUD {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "ti644hanim644");

		Statement st = con.createStatement(); //

		// 3. YONTEM
	 	//-----------------------------------------------------
	 	// batch metoduyla birlikte PreparedStatement kullanmak en efektif yontemdir.
	 	// bir sonraki ornekte bunu gerceklestirecegiz.
		
		
		/*=======================================================================
		  ORNEK1: urunler adinda bir tablo olusturalim id int, 
		  isim VARCHAR(10) fiyat int 
		========================================================================*/ 
//		st.execute("CREATE TABLE urunler("
//			       + " id int,"
//			       + " isim VARCHAR(10),"
//			       + " fiyat double)");
//		
//		System.out.println("urunler tablosu oluşturuldu.");
		
		/*=======================================================================
//		  ORNEK2: urunler tablosuna asagidaki kayitlari toplu bir sekilde ekleyelim
//		========================================================================*/ 
		// Cok miktarda kayit eklemek icin PreparedStatement metodu kullanilabilir. 
		// PreparedStatement hem hizli hem de daha guvenli (SQL injection saldirilari icin) bir yontemdir. 
		// Bunun icin; 
		// 	1) Veri girisine uygun bir POJO(Plain Old Java Object) sinifi olusturulur.
		// 	2) POJO Class nesnelerini saklayacak bir collection olusturulur
		// 	3) bir dongu ile kayitlar eklenir. 
		
//		List<Urun> kayitlar = new ArrayList<>();
//		kayitlar.add(new Urun(101,"laptop", 6500));
//		kayitlar.add(new Urun(102,"PC", 4500));
//		kayitlar.add(new Urun(103,"Telefon", 4500));
//		kayitlar.add(new Urun(104,"Anakart", 1500));
//		kayitlar.add(new Urun(105,"Klavye", 200));
//		kayitlar.add(new Urun(106,"Fare", 100));
//		
//		PreparedStatement veri = con.prepareStatement("INSERT INTO urunler Values(?,?,?)");
//		
//		for(Urun each : kayitlar) {
//			
//			veri.setInt(1, each.getId()); // 1 ilk integer için each objesinden gelen ID'yi getir.
//			veri.setString(2, each.getIsim()); // 
//			veri.setDouble(3, each.getFiyat());
//			veri.addBatch(); // hepsini toparla tek veri haline getir yığın haline
//			
//		}veri.executeBatch(); // database'e o yığını yolla.
//		
//		System.out.println("Urunler Tabloya Eklendi.");
		
		/*=======================================================================
		  ORNEK3: urunler tablosundaki PC'nin fiyatini %10 zam yapiniz
		========================================================================*/
//		String query = "update urunler set fiyat = fiyat*1.1 where isim = 'PC'";
//		
//		System.out.println(st.executeUpdate(query) + " satır güncellendi.");
//		
		
		/*=======================================================================
		  ORNEK4: urunler tablosuna Marka adinda ve Default degeri ASUS olan yeni 
		  bir sutun ekleyiniz.
		========================================================================*/
//		String query1="Alter table urunler add marka varchar(10) default 'ASUS'";
//		
//		System.out.println(st.executeUpdate(query1) + " yeni sütün eklendi.");
		
		
		/*=======================================================================
		  ORNEK5: urunler tablosunu siliniz.
		========================================================================*/
//		String query2="drop table urunler";
//		int s1 = st.executeUpdate(query2);
//		System.out.println(s1 + " tablo silindi.");
		
		con.close();
		st.close();
		
		
		
	}

}
