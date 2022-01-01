package JavaLamda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Lambda06 {

	public static void main(String[] args) throws IOException   {

		 //TASK 01 --> haluk.txt dosyasini okuyunuz.(Console'a yazdiriniz)
	    System.out.println("\n*** gokhan.txt dosyasini okuyunuz -->  ");
	    Files.
        lines(Paths.get("src/JavaLamda/gokhan")).//file erisip  file satirlari akis alindi
        forEach(System.out::println);
	    
	    
	    //TASK 02 --> haluk.txt dosyasini buyuk harflerle okuyunuz.(Console'a buyuk harflerle yazdiriniz)
	    System.out.println("\n*** gokhan.txt dosyasini buyuk harflerle okuyunuz -->  ");
	    Files.
        lines(Paths.get("src/JavaLamda/gokhan")).//file erisip  file satirlari akis alindi
        forEach(System.out::println);
	    
	    
	    
	  //TASK 03 --> haluk.txt dosyasindaki ilk satiri kucuk harflerle yazdiriniz.
	    System.out.println("\n*** gokhan.txt dosyasindaki ilk satiri kucuk harflerle okuyunuz 01 -->  ");
	  Files.
	            lines(Paths.get("src/JavaLamda/gokhan")).//file erisip  file satirlari akis alindi
	            limit(1).//ilk satir alindi
	            map(String::toLowerCase).
	            forEach(System.out::println);
	    
	    
	    //TASK 04 --> haluk.txt dosyasinda "basari" kelimesinin kac satirda gectiginiz yazdiriniz
	    System.out.println("\n*** gokhan.txt dosyasinda basari kelimesinin kac satirda gectiginiz yazdiriniz -->  ");
	    System.out.println(Files.
	    		lines(Paths.get("src/JavaLamda/gokhan")).
	    		filter(t->t.contains("başarı")).
	    		count());
	    
	    
	    
	    
	    // ÖNEMLİ !!!!!!!!!!!!!!!!!!!!!
	    
	    //TASK 05 --> haluk.txt dosyasindaki farkli kelimeleri  yazdiriniz.
	    System.out.println("\n*** gokhan.txt dosyasindaki farkli kelimeleri  yazdiriniz. -->  ");
	    System.out.println(Files.lines(Paths.get("src/JavaLamda/gokhan")).
	    map(t->t.split(" ")). // " "'a göre satırlardaki elemanları parçalayıp array'e ataadı.
	    flatMap(Arrays::stream). // Arrays clasından stream() methodu ile array elemanlarından yeni bir akış oluşturdu.
	    distinct(). // Yeni akıştaki arrray elemanları tekrarsız hale getirildi.
	    collect(Collectors.toList())); // yeni akıştaki tekrarsız olan array elemanları list'e atandı.

	    
	    
	    
	    
	    
	    //TASK 06 --> gokhan.txt dosyasindaki tum kelimeleri natural order  yazdiriniz.
	    System.out.println("\n*** gokhan.txt dosyasindaki tum kelimeleri natural order  yazdiriniz. -->  ");
	    Files.lines(Paths.get("src/JavaLamda/gokhan")).
	    map(t->t.split(" ")).flatMap(Arrays::stream).sorted().forEach(t->System.out.println(t+" "));
	    
	    
	    //TASK 07 --> gokhan.txt dosyasinda "ozturk" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız yaziniz.
	    System.out.println("\n*** gokhan.txt dosyasinda basari kelimesinin kac kere gectigini  yazdiriniz. -->  ");
	    
	   System.out.println(Files.lines(Paths.get("src/JavaLamda/gokhan"))
	    .map(t->t.split(" ")).flatMap(Arrays::stream)
	    .filter(t->t.equals("ozturk")).count());
	    
	    
	    
	    //TASK 08 --> gokhan.txt dosyasinda "a" harfi gecen kelimelerin sayisini ekrana yazdiran programi yaziniz
	    System.out.println("\n*** gokhan.txt dosyasinda a harfi gecen kelimelerin sayisini ekrana yazdiran programi yazdiriniz. -->  ");
	    
	    long sonuc = Files.lines(Paths.get("src/JavaLamda/gokhan")).map(t->t.split(" "))
	    .flatMap(Arrays :: stream).filter(t->t.contains("a")).count();
	    
	    System.out.println(sonuc);
	    
	    
	    
	    //TASK 09 --> haluk.txt dosyasinda icinde "a" harfi gecen kelimeleri yazdiriniz
	    System.out.println("\n*** haluk.txt dosyasinda a harfi gecen kelimeler yazdiriniz. -->  ");
	    //TASK 10 --> haluk.txt dosyasinda kac /farklı harf kullanildigini yazdiriniz
	    System.out.println("\n*** haluk.txt dosyasinda kac /farklı harf kullanildigini  yazdiriniz. -->  ");
	    //TASK 11 --> haluk.txt dosyasinda kac farkli kelime kullanildigini yazdiriniz
	    System.out.println("\n*** haluk.txt dosyasinda kac farkli kelime kullanildigini  yazdiriniz. -->  ");

		
		
		
		
	}
	
	

}
