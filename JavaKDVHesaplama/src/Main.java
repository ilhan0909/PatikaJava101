import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double baseFiyat,kdvOran,kdvDahil,kdvTutar,kdvTutari;
        String kdvOrani;

        System.out.print("KDV'siz fiyatı giriniz:");
        baseFiyat = input.nextFloat();

        //1000 lira şartı ile oran değişimi sağlandı.
        if (baseFiyat>1000) { kdvOran = 0.08; }
        else{ kdvOran = 0.18; }

        kdvTutar = baseFiyat*kdvOran;
        kdvDahil = baseFiyat+kdvTutar;

        //Bu adımı yapmayınca 10 lirada 1.8 çıkması gereken kdv 1.7999..çıkıyor.
        //30 lirada 5.4 çıkması gereken kdv 5.3999... çıkıyor,örnekler çoğaltılabilir.
        kdvTutari = Math.round( kdvTutar * 100.0 ) / 100.0;

        if (kdvOran==0.08) { kdvOrani = "%8"; }
        else{ kdvOrani = "%18"; }

        System.out.print("\n");
        System.out.println("KDV'siz fiyat: "+baseFiyat);
        System.out.println("KDV'li fiyat: "+kdvDahil);
        System.out.println("KDV oranı: "+kdvOrani);
        System.out.println("KDV tutarı: "+kdvTutari);
    }
}