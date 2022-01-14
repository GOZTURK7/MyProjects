package techproed.jdbcOrnekler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1Query02 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {


		Class.forName("com.mysql.cj.jdbc.Driver");

		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "ti644hanim644");
	
		Statement st = con.createStatement();
		
		
		/*=======================================================================
//		 ORNEK1: Bolumler tablosundaki tum kayitlari listeleyen bir sorgu yaziniz.
//		========================================================================*/ 
		
		
	    ResultSet tablo = st.executeQuery("Select * from bolumler");
	    
	    while(tablo.next()) {
	    	System.out.println(tablo.getInt(1) + " " + tablo.getString("bolum_isim") + " "+ tablo.getString(3)); // sütun numarasını yazarsak da olur.
	    	
	    }
		
		System.out.println("============================================================================");
		
//		/*=======================================================================
//		 ORNEK2: SATIS ve MUHASEBE bolumlerinde calisan personelin isimlerini ve 
//		 maaslarini, maas ters sirali olarak listeleyiniz
//		========================================================================*/ 
		
		ResultSet tablo1 = st.executeQuery("select bolum_id, isim, maas from personel where bolum_id in(10,30) order by maas desc");
		
		while(tablo1.next()) {
			
			System.out.println(tablo1.getInt("bolum_id")+ " " +tablo1.getString("isim") + " \t" + tablo1.getInt("maas"));
		}
		
		
		System.out.println("===========================================================================");
//		/*=======================================================================
//		  ORNEK3: Tüm bolumlerde calisan personelin isimlerini, bolum isimlerini 
//		  ve maaslarini, bolum ve maas sirali listeleyiniz. NOT: calisani olmasa 
//		  bile bolum ismi gosterilmelidir.
//		========================================================================*/ 
		
		ResultSet tablo2 = st.executeQuery("select b.bolum_isim, p.isim, p.maas from bolumler as b "
				+ "left join personel as p on p.bolum_id = b.bolum_id order by b.bolum_isim, p.maas");
		
		
		while(tablo2.next()) {
			System.out.println(tablo2.getString("b.bolum_isim") + " " + tablo2.getString("p.isim") + " \t" + tablo2.getInt("p.maas"));
			
		}
		System.out.println("===========================================================================");
		/*=======================================================================
//		  ORNEK4: Maasi en yuksek 10 kisinin bolumunu,adini ve maasini listeyiniz
//		========================================================================*/ 
		
		
		ResultSet tablo3 = st.executeQuery("select b.bolum_isim, p.isim, p.maas from personel p "
				+ "left join bolumler b on b.bolum_id=p.bolum_id order by p.maas desc limit 10");
		
		while(tablo3.next()) {
			System.out.println(tablo3.getRow() + " "+ tablo3.getString(1) + " " + tablo3.getString(2) + " " + tablo3.getInt(3));
		}
		
		
		
//	
		
	}

}
