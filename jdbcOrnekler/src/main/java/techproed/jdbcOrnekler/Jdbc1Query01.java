package techproed.jdbcOrnekler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1Query01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		
		
		// 1) İlgili Driver'ı yüklemeliyiz (MySQL) mesela başka alet çalışmasın ne çalışacağını bilsin.	
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		
		// 2) bağlantı oluşturmalıyız. 
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sys?serverTimezone=UTC", "root", "ti644hanim644");
		
		
		
		
		// 3) SQL Komutları için bir 'Statement' nesnesi oluştur. 
		Statement st = con.createStatement();
		
		
		// 4) SQL ifadeleri yazabilir ve çalıştırabiliriz kumanda da 1'e basarım trt1 gelir.
		ResultSet veri = st.executeQuery("Select isim, maas from personel where id=123456789");
		
		
		
		// 5) Sonuçları aldık ve işledik
		
		while(veri.next()) {
			System.out.println(veri.getString("isim")+" "+ veri.getInt("maas"));
			
			
			System.out.println("Personel Adi: " + veri.getString(1) + ", Maas: "+veri.getString(2));
			// bu da ikinci yazdırma şekli getStringin içine yazdığımız 1 (select isim, maas....)'daki 
			// isim 1 maas 2 oluyor kendi sorgu sırasına Göre
			
			
		}
		
		// 6) Oluşturulan nesneleri bellekten kaldıralım. açtığımız tüm objeleri kapattık
		
		con.close(); // connection'ı kestik 
		st.close();
		veri.close();
		
		
		
		
	}

}
