import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            /*Mükemmel sayılar çok hızlı biçimde yüksek hanelere çıkıyor,
            absürd büyük sayılar için long kullanılmazsa hata veriyor.*/
            long num, sum=0 ;
            System.out.print("Lütfen bir sayı giriniz : ");
            num = scan.nextLong();

            for (long i = 1; i < num; i++) {
                if (num % i == 0) {
                    sum += i;
                } else {
                    sum = sum;
                }
            }
            if (sum == num) {
                System.out.println(num + " mükemmel sayıdır.");
            } else {
                System.out.println(num + " mükemmel sayı değildir.");
            }

        }
    }
}