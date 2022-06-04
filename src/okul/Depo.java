package okul;

import java.util.Scanner;

public class Depo {
    static Scanner scan = new Scanner(System.in);
    public static void anaMenu() throws InterruptedException {


            String tercih;
            do {
                System.out.println("**********YILDIZ KOLEJI***********\n" +
                        "**********ANA MENU**********\n" +
                        "\n" +
                        "\t     1-okul bılgılerı goruntule\n" +
                        "\t     2-ogretmen menu\n" +
                        "\t     3-ogrencı menu\t\t  \n" +
                        "\t     Q-cıkıs\n");
                System.out.println("lutfen tercıhınızı yapınız");
                tercih = scan.nextLine();
                switch (tercih) {
                    case "1":
                        Depo.okuBilgileriniYazdır();
                        break;
                    case "2":
                        Ogretmen.ogretmenMenu();
                        break;
                    case "3":
                        break;
                    case "q":
                    case "Q":
                        break;
                    default:
                        System.out.println("lutfen gecerlı giris yapınız");
                }


            } while (!tercih.equalsIgnoreCase("q"));

            Depo.projeDurdur();
    }

    private static void okuBilgileriniYazdır() {
        System.out.println("**********YILDIZ KOLEJI***********\n"+
        "adres: " + Okul.odres +
                "\n\t\t telefon:" +Okul.tel);
    }


    static void projeDurdur()
    {
        System.out.println("okul pro den cıktınız");
    }
}
