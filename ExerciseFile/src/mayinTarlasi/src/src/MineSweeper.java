package mayinTarlasi.src.src;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
	
	
	static Scanner scan = new Scanner(System.in);
    static int satir;
    static int sutun;

    public MineSweeper(int satir, int sutun) {
        this.sutun = sutun;
        this.satir = satir;
    }

    
    public static void board(int satir, int sutun){
        
    }

    public static void main(String[] args) {

        System.out.println("Matris Satır Miktarı:");
        satir = scan.nextInt();
        System.out.println("Matris Sütun Miktarı:");
        sutun = scan.nextInt();

        String [][] board = new String[satir][sutun];
        String[][] boardMayinKonumlari = new String[satir][sutun];
        for(String [] w : board){
            for(int i=0; i<w.length; i++){
                w[i]="_";
            }

        }

        Random rand = new Random();
        for (int i = 0; i < satir*sutun/4 ; i++) {
            int randSatirIndex = rand.nextInt(satir);
            int randSutunIndex = rand.nextInt(sutun);
            board[randSatirIndex][randSutunIndex]="*";

        }

        for(String[] w : board){

            for (int i = 0; i <w.length ; i++) {

                System.out.print(w[i]+" ");
            }System.out.println();

            }





        System.out.println("Satır Giriniz:");
        int satirKullanici = scan.nextInt();

        System.out.println("Sütun Giriniz:");
        int sutunKullanici = scan.nextInt();

        // Seçilen noktanın dizinin sınırları içerisinde
        // olup olmadığını kontrol edilmeli
        // ve koşul sağlanmazsa tekrar nokta istenmeli.


        if(satirKullanici < 0 || satirKullanici > board.length-1
                || sutunKullanici < 0 || sutunKullanici > board.length-1){
            System.out.println("Board sınırları için Koordinat girin;");

        }




        // RUN

        int startSatirIdx = satirKullanici-1;
        int startSutunIdx= sutunKullanici-1;
        int finishSatirIdx = satirKullanici+1;
        int finishSutunIdx= sutunKullanici+1;
        if(satirKullanici==0 || sutunKullanici==0){
            startSatirIdx=satirKullanici;
            startSutunIdx=sutunKullanici;
        }else if(satirKullanici==(board.length-1) || sutunKullanici==(board.length-1)){
            startSatirIdx=board.length-2;
            startSutunIdx=board.length-2;
            finishSatirIdx=board.length-1;
            finishSutunIdx=board.length-1;
        }



        int counter=0;
        for (int i = startSatirIdx; i <= finishSatirIdx; i++){

            for(int j=(startSutunIdx); j<=(finishSutunIdx); j++) {

                if(!board[i][j].equals(board[satirKullanici][sutunKullanici]) && board[i][j].equals("*")){
                    counter++;

                }


            }
        }board[satirKullanici][sutunKullanici]=String.valueOf(counter);
        for(String[] w : board){

            for (int i = 0; i <w.length ; i++) {

                System.out.print(w[i]+" ");
            }System.out.println();

        }




    }


}
