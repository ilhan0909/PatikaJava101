import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut,elma,domat,muz,patcan,armutKg,elmaKg,domatKg,muzKg,patcanKg,topla,toplam;
        armut = 2.14;
        elma = 3.67;
        domat = 1.11;
        muz = 0.95;
        patcan = 5.00;

        System.out.print("Armut kaç kilo ? : ");
        armutKg = input.nextDouble();
        System.out.print("Elma kaç kilo ? : ");
        elmaKg = input.nextDouble();
        System.out.print("Domates kaç kilo ? : ");
        domatKg = input.nextDouble();
        System.out.print("Muz kaç kilo ? : ");
        muzKg = input.nextDouble();
        System.out.print("Patlıcan kaç kilo ? : ");
        patcanKg = input.nextDouble();

        topla = armut*armutKg+elma*elmaKg+domat*domatKg+muz*muzKg+patcan*patcanKg;
        toplam = Math.round( topla * 100 ) / 100.0 ;

        System.out.println("Toplam Tutar : "+ toplam+ " TL");
    }
}