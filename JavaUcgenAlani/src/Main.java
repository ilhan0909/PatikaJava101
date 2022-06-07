import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int a,b,c,cevre;
        double alanKaresi,alan,z;

        System.out.print("Kenar1 uzunluğu giriniz:");
        a = input.nextInt();
        System.out.print("Kenar2 uzunluğu giriniz:");
        b = input.nextInt();
        System.out.print("Kenar3 uzunluğu giriniz:");
        c = input.nextInt();

        cevre = a+b+c;
        z = cevre/2;
        alanKaresi = z * (z - a)* (z - b) * (z - c);
        alan= Math.sqrt(alanKaresi);

        System.out.print("\n");
        System.out.println("Ölçüleri Girilen Üçgenin Alanı: "+ alan + " m²");
    }
}