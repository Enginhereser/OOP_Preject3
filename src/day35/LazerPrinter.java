package day35;

public class LazerPrinter {
    private final int MAKS_TONER_SEVIYESI = 100;
    private final int MAKS_KAGIT_MIKTARI = 500;

    private int tonerSeviyesi;
    private int kagitAdedi;
    private boolean ciftYonluBaski;

    public LazerPrinter(int tonerSeviyesi, int kagitAdedi, boolean ciftYonluBaski) {
        tonerEkle(tonerSeviyesi);
        kagitYuke(kagitAdedi);
        this.ciftYonluBaski = ciftYonluBaski;
    }

    public int getTonerSeviyesi() {
        return tonerSeviyesi;
    }

    public int tonerEkle(int miktar) {
        if (miktar >= 0 && miktar <= MAKS_TONER_SEVIYESI && tonerSeviyesi + miktar <= MAKS_TONER_SEVIYESI) {
            tonerSeviyesi += miktar;
        } else if (tonerSeviyesi + miktar > MAKS_TONER_SEVIYESI) {
            tonerSeviyesi = MAKS_TONER_SEVIYESI;
        }
        return tonerSeviyesi;
    }

    public int getKagitAdedi() {
        return kagitAdedi;
    }

    public int kagitYuke(int miktar) {
        if (miktar > 0 && kagitAdedi + miktar <= MAKS_KAGIT_MIKTARI) {

            kagitAdedi += miktar;
        } else if (kagitAdedi + miktar > MAKS_KAGIT_MIKTARI) {
            kagitAdedi = MAKS_KAGIT_MIKTARI;

        }
        return kagitAdedi;
    }
        //sart?case1:case2; törnary
    public int yazdir(int sayfaAdedi) {
        if (sayfaAdedi<=0) return 0;
        return ciftYonluBaski?sayfaAdedi/2+sayfaAdedi%2:sayfaAdedi;


    }

}

