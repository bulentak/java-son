package Day0_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class FilmTahmin {

    static List<String> filmList = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("~~~FILM TAHMIN OYUNUNA HOSGELDINIZ~~~");
        int secimIndex = -1;
        String film = "";
        int kalanhak = -1;
        String tahmin = "";
        char devamke = ' ';

        System.out.println("1-" + (filmList.size()) + " arasinda bir sayi giriniz");
        secimIndex = scan.nextInt();
        film = filmList.get(secimIndex - 1);
        kalanhak = film.length();

        while (true) {
            System.out.println(" Kalan Hak : " + kalanhak);
            System.out.print("Tahmin : ");
            tahmin = scan.next();
            if (tahmin.equalsIgnoreCase(film)) {
                System.out.println(" Tebrikler. Bildiniz. ");
                break;
            } else {
                kalanhak -=1;
                if (kalanhak == 0) {
                    System.out.println(" Maalesef hakkınız kalmadı .");
                    System.out.println(" Film : " + film);
                    break;
                }
            }
        }
    }
}
