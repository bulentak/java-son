package day14_strıngManipalition;

public class C01_trim {

    public static void main(String[] args) {

       // trim bastan sondan keser
        String str= "   Siz ne derseniz deyin, Java bildigini okur.   ";
        str.trim();
        System.out.println(str); //    Siz ne derseniz deyin, Java bildigini okur.   bosluklu
        System.out.println(str.length()); // 49
        str=str.trim();
        System.out.println(str); //Siz ne derseniz deyin, Java bildigini okur.
        System.out.println(str.length()); // 43


    }
}
