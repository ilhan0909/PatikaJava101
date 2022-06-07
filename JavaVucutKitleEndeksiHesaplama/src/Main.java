import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double boy,kilo,bmi;

        System.out.print("Lütfen boyunuzu 'metre,santimetre' şeklinde giriniz : ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu 'kilogram,gram' şeklinde giriniz : ");
        kilo = input.nextDouble();

        bmi = kilo / (boy*boy);

        System.out.println("Vücut Kitle İndeksiniz : "+ bmi);
    }
}