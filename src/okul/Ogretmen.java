package okul;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Ogretmen {
    static Scanner scan = new Scanner(System.in);
    static Map<String, String> ogretmenlerMap = new HashMap<>();

    public static void feykOgretmenEkle() {

        ogretmenlerMap.put("12345678909", "Ali,Can,1980.Matematik");
        ogretmenlerMap.put("12345678908", "veli ,Can,1980.Kımya");
        ogretmenlerMap.put("12345678907", "Can,Can,1980.Cog");
        ogretmenlerMap.put("12345678906", "Hasan,Can,1980.Fizik");
        ogretmenlerMap.put("12345678905", "Han,Can,1980.Turkce");
    }

    public static void ogretmenMenu() throws InterruptedException {
        String tercih;
        do {
            System.out.println("**********YILDIZ KOLEJI***********\n" +
                    "**********OGRETMEN**********\n" +
                    "\n" +
                    "\t     1-ogretmen lıstesi yazdır \n" +
                    "\t     2-soyısımden ogretmen bulma\n" +
                    "\t     3-bransdan ogretmen bulma\t\t  \n" +
                    "\t     4-bılgılerını gırerek ogretmen ekleme\n" +
                    "\t     5-kımlık no ıle kayıt sılme\n)" +
                    "\t     A-anamenu\n" +
                    "\t     Q-Cıkıs\n");
            tercih = scan.nextLine();

            switch (tercih) {
                case "1" :
                    ogretmenLıstesiYazdır();
                    break;
                case "2" :
                    break;
                case "3" :
                    break;
                case "4" :
                    break;
                case "5" :
                    break;
                case "a" :
                case "A" :
                    Depo.anaMenu();
                    break;
                case "q" :
                case "Q" :
                    break;
                default :
                    System.out.println("lutfen gecerli tercih yapınıx");


            }

        } while (tercih.equalsIgnoreCase("q")) ;

    }

    public static void ogretmenLıstesiYazdır() throws InterruptedException{

        Set<Map.Entry<String,String>> ogretmenEntryset=ogretmenlerMap.entrySet();
        System.out.println("**********YILDIZ KOLEJI***********\n" +
                "**************OGRETMEN**********\n" +
                "TcNo         Isım        SoyIsım       DYılı       Brans");


        for (Map.Entry<String,String>each:ogretmenEntryset) {
            String eachKey = each.getKey();
            String eachValue = each.getValue();
            //System.out.println(eachKey + "       " + eachValue  );

            String[] eachvaluArr =eachValue.split(",   ");
           // System.out.println("eachvaluArr");


          System.out.printf("%11s %-6s %-8s %4s %s  \n "  ,eachKey,eachvaluArr[0],eachvaluArr[1],
                  eachvaluArr[2],eachvaluArr[3]);



        }
    }


}
