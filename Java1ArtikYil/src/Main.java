import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int yil;
        System.out.print("Yıl Giriniz : ");
        yil = input.nextInt();

        if (yil>0){
        if( yil%400==0 ){
            System.out.println(yil + " artık yıldır.");
        }
        else if ( yil%400!=0 && yil%4==0 ) {
            System.out.println(yil + " artık yıldır.");
        }
        else {
            System.out.println(yil + " artık yıl değildir!");
        }
        }
        else {
            System.out.println("Hatalı giriş yaptınız!");
        }

    }
}
