package day33_StringBuilder;

public class C01_Append_Length_Capacity {

	public static void main(String[] args) {

		StringBuilder sb = new StringBuilder();

		System.out.println(sb.length()); // 0 sb'nin uzunuluğunu verir.
		System.out.println(sb.capacity()); // 16 sb'nin kapasitesini verir.

		StringBuilder sb2 = new StringBuilder("Java candir");

		System.out.println(sb2.length()); // 11 sb'nin uzunuluğunu verir.
		System.out.println(sb2.capacity()); // 21 sb'nin kapasitesini verir.

		StringBuilder sb3 = new StringBuilder(7);
		sb3.append("Mehlika");
		System.out.println(sb3.length()); // 7 sb'nin uzunuluğunu verir.
		System.out.println(sb3.capacity()); // 7 sb'nin kapasitesini verir.

		StringBuilder sb4 = new StringBuilder(7);

		System.out.println(sb4.length()); // 0 sb'nin uzunuluğunu verir.
		System.out.println(sb4.capacity()); // 7 sb'nin kapasitesini verir.
		sb4.append("Nilgun");
		System.out.println(sb4.length()); // 6 sb'nin uzunuluğunu verir.
		System.out.println(sb4.capacity()); // 7 sb'nin kapasitesini verir.
		
		sb4.append(" candir");
		System.out.println(sb4.length()); // 13 sb'nin uzunuluğunu verir. kapasite 7'idi  candir ekleyince yetmediği için kapasiteyi 2 ile çarpıp 2 ekledi.
		System.out.println(sb4.capacity()); // 16 sb'nin kapasitesini verir.
		
		
		sb.append("Java");
		System.out.println(sb); // Java
		sb.append(" candir");
		System.out.println(sb); // Java candir
		
		
		sb.append("anlasildi mi", 3, 4);
		System.out.println(sb);

		
		
		
		
	}

}
