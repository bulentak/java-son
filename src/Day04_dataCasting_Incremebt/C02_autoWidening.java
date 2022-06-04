package Day04_dataCasting_Incremebt;

public class C02_autoWidening {
    public static void main(String[] args) {

        boolean dogruMu=true;
        //String str=dogruMu; // sol String sag boolean olunca kabul etmiyor

        byte sayi1=44;
        System.out.println(sayi1);// 44

        short sayi2= sayi1; // esitligin solu short,sagi ise byte olmasına ragmenitiraz etmiyor
                           // deger olarak atanan data turu variable data turunden kucuk oldugu icin java sorun yapmaz
                           // Auto Widening

        System.out.println(sayi2);//44

        double sayi3= sayi2;

        System.out.println(sayi3); //44



    }
}
