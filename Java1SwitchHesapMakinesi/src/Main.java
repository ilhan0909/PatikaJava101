import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2;
        int islem;

        System.out.print("İlk sayıyı giriniz:");
        num1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz:");
        num2 = input.nextDouble();
        System.out.print("Hangi İşlemi Yapmak İstiyorsunuz?\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme\n");
        System.out.print("Seçiminiz : ");
        islem = input.nextInt();

        switch (islem) {
            case 1 -> {
                double toplam = num1 + num2;
                System.out.println("İşlem sonucu : " + toplam);
            }
            case 2 -> {
                double cikma = num1 - num2;
                System.out.println("İşlem sonucu : " + cikma);
            }
            case 3 -> {
                double carpim = num1 * num2;
                System.out.println("İşlem sonucu : " + carpim);
            }
            case 4 -> {
                double bolum = num1 / num2;
                if (num2==0){System.out.println("Bir sayı 0'a bölünemez! ");}
                else{ System.out.println("İşlem sonucu : " + bolum);}
            }
            default -> System.out.println(" Lütfen geçerli bir işlem seçiniz. ");
        }
    }
}