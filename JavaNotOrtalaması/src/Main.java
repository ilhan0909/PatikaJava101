import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int math,fizik,kimya,turkish,tarih,music;

        System.out.print("Matematik notunu giriniz:");
        math = input.nextInt();

        System.out.print("Fizik notunu giriniz:");
        fizik = input.nextInt();

        System.out.print("Kimya notunu giriniz:");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu giriniz:");
        turkish = input.nextInt();

        System.out.print("Tarih notunu giriniz:");
        tarih = input.nextInt();

        System.out.print("Müzik notunu giriniz:");
        music = input.nextInt();

        int toplam = math+fizik+kimya+turkish+tarih+music;
        double ortalama = toplam/6.0;
        String gecmeDurumu;
        gecmeDurumu = (ortalama>60) ? "Sınıfı Geçti" : "Sınıfta Kaldı";

        System.out.print("\n");
        System.out.println("Öğrenci Not Ortalaması:"+ortalama);
        System.out.println(gecmeDurumu);
    }
}