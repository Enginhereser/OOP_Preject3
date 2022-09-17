package day35;

public class MAinApp {
    public static void main(String[] args) {
        //Encapsulation: Kodlarimizi ve verilerimizi koruma altina almak icin kullaniriz.


        Kitap kitap1=new Kitap("Kasagi","Ömer Seyfettin",-300);
        kitap1.setIsim("Kasagi");
        kitap1.yazar="Ömer Seyfettin";

       // kitap1.sayfaAdedi=300;
        kitap1.setSayfaAdedi(300);
        System.out.println(kitap1.getSayfaAdedi());
        System.out.println(kitap1.getIsim());



    }
}
