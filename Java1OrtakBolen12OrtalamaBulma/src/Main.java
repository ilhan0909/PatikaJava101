import java.util.Scanner;
//0'dan girilen sayıya kadar bulunan, 3 ve 4'e aynı anda bölünebilen sayıların ortalamasını al
public class Main {
    public static void main(String[] args) {
        //Devamlı Loop olmasını sağlıyor
        while (true) {
            int num, count = -1;
            float mean, sum = 0;
            Scanner scan = new Scanner(System.in);

            System.out.print("Sayı Giriniz : ");
            num = scan.nextInt();

            if (num > 0) {
                for (int i = 0; i <= num; i++) {
                    //bir sayının hem 3 hem 4 e bölünebilmesi için 12 ve 12'nin katları şeklinde olması gerekir
                    if (i % 12 == 0) {
                        sum += i;
                        count++;
                    }
                }
                mean = sum / count;
                //11 ve altında sayı girdiğimiz sürece bu hatayı verecek
                if (sum <= 11) {
                    System.out.println("0'dan Girdiğiniz sayıya kadar 3 ve 4'e aynı anda bölünebilen sayı bulunmamakta!");
                } else {
                    System.out.println("0'dan Girdiğiniz sayıya kadar 3 ve 4'e aynı anda bölünebilen tüm sayıların ortalaması : " + mean);
                }
            }
            //negatif-pozitif input ayrımı yapabiliyoruz.
            else {
                System.out.println("Geçersiz bir değer girdiniz! (Minimum değer 1 olabilir!)");
            }
        }
    }
}