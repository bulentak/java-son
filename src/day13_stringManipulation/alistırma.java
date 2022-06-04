package day13_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class alistırma {
    public static void main(String[] args) {


        //Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve
        // asagidaki gibi yazdirin isim-soyisim : M***** B******* kart no : **** **** **** 1234

        //Scanner scan = new Scanner(System.in);
        //System.out.println("Lutfen isim soyisim yazınız");
        //System.out.println("Lutfen kredi kartı numarası giriniz");

       // Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
         // ve asagidaki gibi yazdirin
         // isim-soyisim : M***** B******* kart no : **** **** **** 1234

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi arasinda boşluk koyarak giriniz");
        String kullaniciBilgi=scan.nextLine();

        Scanner scanNumara=new Scanner(System.in);
        System.out.println("Lutfen Kredi karti numaranizi bosluklara dikkat ederek giriniz:)");

        String kartNumarasi=scanNumara.nextLine();
        String kartNumarasi1bolum=kartNumarasi.substring(0,13);
        String kartNumarasi2bolum=kartNumarasi.substring(kartNumarasi.length()-5,kartNumarasi.length());



        int boslukIndex=kullaniciBilgi.indexOf(" ");

        String isimilkHarf=kullaniciBilgi.substring(0,1).toUpperCase(Locale.forLanguageTag("tr"));
        String isimKalan=kullaniciBilgi.substring(1,boslukIndex).
                replaceAll("\\w","*");


        String soyisimilkHarf=kullaniciBilgi.substring(boslukIndex+1,(boslukIndex+2)).
                toUpperCase(Locale.forLanguageTag("tr"));
        String soyisimKalan=kullaniciBilgi.substring(boslukIndex+2).
                replaceAll("\\w","*");

        System.out.println("Girdiginiz isim ve soyisim : " +
                isimilkHarf + isimKalan+ " "+
                soyisimilkHarf + soyisimKalan);

        System.out.println("kart numaraniz : " + (kartNumarasi1bolum.replaceAll("\\S", "*"))
                +" " + (kartNumarasi2bolum));



    }
}
