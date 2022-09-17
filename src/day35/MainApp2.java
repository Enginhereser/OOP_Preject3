package day35;

public class MainApp2 {
    public static void main(String[] args) {
    LazerPrinter yazici=new LazerPrinter(50,-1000,true);
 /*       System.out.println(yazici.tonerEkle(20));
        System.out.println(yazici.tonerEkle(35));*/

        System.out.println("Toner Seviyesi : "+yazici.kagitYuke(600));
        System.out.println("Yazdirilan Kagit Miktari : "+yazici.yazdir(-11));
    }
}
