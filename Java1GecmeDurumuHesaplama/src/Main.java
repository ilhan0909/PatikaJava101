import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int math,fizik,kimya,turk,music,toplam=0;

        //input aldıktan sonraki if else döngüleri 0<=not<=100 kuralında olmayan notları almamamızı sağlıyor.
        System.out.print("Matematik notunu giriniz:");
        math = input.nextInt();
        if (0<=math && math<=100){ toplam += math;}
        else { toplam=toplam;}

        System.out.print("Fizik notunu giriniz:");
        fizik = input.nextInt();
        if (0<=fizik && fizik<=100){ toplam += fizik;}
        else { toplam=toplam;}

        System.out.print("Kimya notunu giriniz:");
        kimya = input.nextInt();
        if (0<=kimya && kimya<=100){ toplam += kimya;}
        else { toplam=toplam;}

        System.out.print("Türkçe notunu giriniz:");
        turk = input.nextInt();
        if (0<=turk && turk<=100){ toplam += turk;}
        else { toplam=toplam;}

        System.out.print("Müzik notunu giriniz:");
        music = input.nextInt();
        if (0<=music && music<=100){ toplam += music;}
        else { toplam=toplam;}

        double ortalama = toplam / 5.0;
        String gecmeDurumu;
        gecmeDurumu = (ortalama >= 55) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";

        System.out.print("\n");
        System.out.println("Öğrenci Not Ortalaması:"+ortalama);
        System.out.println(gecmeDurumu);
    }
}