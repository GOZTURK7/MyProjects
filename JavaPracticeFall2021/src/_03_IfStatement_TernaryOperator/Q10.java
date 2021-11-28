package _03_IfStatement_TernaryOperator;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {

        /*
          Problem tanimi : 
        Kulanıcıdan aracının hızını alınız
        Trafik cezasının değerini hesaplayın.
            45 hız sınırıdır.
            Eğer hızınız 55-74 arasında ise:
            Ceza 100 $'dır.

            Eğer hızınız 75 - 84 arasında ise:
            Ceza 150 $'dır.

            Eğer hızınız 85 -94 arasında ise:
            Ceza 320 $'dır.

            Eğer hızınız 94'den daha fazla ise:
            Ceza 500 $'dır.

            ve ayrıca,
            Eğer sürücünün ehliyeti yoksa cezaya 200 $ eklenir.

            Örn: Hızınız 77 iken cezanız 150$'dır ama ehliyetiniz yoksa ceza 350 $ olur.

-----------------------------------------

            Örn;

            currentSpeed(Hızınız) 87
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = true;

            sonuç 320 olmalıdır.

            currentSpeed(Hızınız) 65
            ve isDriverLicenceAvailable(Ehliyeti var mı?) = false;

            sonuç 300 olmalıdır.
     */

       Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen Hızınızı Giriniz:");
       int hız = scan.nextInt();
       
       System.out.println("Sürücü Ehliyetiniz Var Mı? varsa 'Var' yoksa 'Yok' yazınız:");
       String ehliyetVarMi = scan.next();
       
       System.out.println("Elliyetiniz " + ehliyetVarMi);
       
       int ehliyetCeza = (ehliyetVarMi.equalsIgnoreCase("Var")) ? (0) : (200);
       
       if (hız >= 55 && hız <75) {
    	   System.out.println("Cezanız "+(100 + ehliyetCeza));
       }else if (hız <= 84) {
       		System.out.println("Cezanız "+(150 + ehliyetCeza));
       }else if (hız <= 94) {
      		System.out.println("Cezanız "+(320 + ehliyetCeza));
       }else {
     		System.out.println("Cezanız "+(500 + ehliyetCeza));
       }
       
       scan.close();

    }
}
