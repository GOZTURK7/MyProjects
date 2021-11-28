package RandomExercises;

import java.util.Scanner;

public class Ex_02_MethodCreation {

	public static void main(String[] args) {

		/*
         * Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
         * 
         * - @ isareti icermiyorsa gecersiz email yazdirin - @gmail.com icermiyorsa
         * "lutfen gmail adresinizi girin" yazdirin - @gmail.com ile bitmiyorsa
         * "Yazimda bir sorun var, maili kontrol ediniz"
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen email adresinizi yazınız");
        String mail = scan.next();
        EtvarMi(mail);
        gmContain(mail);
        gmSondaMi(mail);
        if (EtvarMi(mail) == "" && gmContain(mail) == "" && gmSondaMi(mail) == "") {
            System.out.println("Mailiniz basariyla kaydedildi");
        } else {
            System.out.println(EtvarMi(mail) + " " + gmContain(mail) + " " + gmSondaMi(mail));
        }
        scan.close();
    } /// main sonu
    public static String EtvarMi(String mail) {
        String flag = "";
        if (mail.contains("@")) {
            flag = "";
        } else {
            flag = "Mail @ isareti icermelidir";
        }
        return flag;
    }
    public static String gmContain(String mail) {
        String flag = "";
        if (mail.contains("@gmail.com")) {
            flag = "";
        } else {
            flag = "Mail @gmail.com icermelidir";
        }
        return flag;
    }
    public static String gmSondaMi(String mail) {
        String flag = "";
        if (mail.endsWith("@gmail.com")) {
            flag = "";
        } else {
            flag = "Mail @gmail.com ile bitmelidir";
        }
        return flag;
    }
}










