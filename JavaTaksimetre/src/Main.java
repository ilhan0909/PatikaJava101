import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int acilis=10;
        double mesafe,toplam,toplamRounded,kmBasiFiyat = 2.20 ;

        System.out.print("Gidilen mesafe kaç kilometre? : ");
        mesafe = input.nextDouble();

        toplam = acilis+(mesafe*kmBasiFiyat);

        toplam = (toplam < 20) ? 20 : toplam;

        toplamRounded = Math.round( toplam * 100.0 ) / 100.0;

        System.out.print("\n");
        System.out.print("Taksimetre Tutarı : "+ toplamRounded + " TL'dir.");
    }
}