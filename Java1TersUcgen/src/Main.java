import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        while (true) {
            Scanner scan = new Scanner(System.in);
            int limit = 0;
            System.out.print("Üçgen Kaç Basamaklı Olsun? : ");
            limit = scan.nextInt();
            if(limit<=0){
             System.out.println("Geçersiz Değer Girdiniz!(Minimum 1 girilebilir.)");
            }
            else {
                for (int i = 1; i <= limit; i++) {
                    for (int k = 1; k <= i; k++) {
                        System.out.print(" ");
                    }
                    for (int x = 1; x <= (2 * (limit - i + 1) - 1); x++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
            }
        }
    }
}