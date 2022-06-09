import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int bilet,yas,mesafe,i;
        double toplamBrut,toplamNet,finalPrice=0,kmUcret=0.1;

        System.out.print("Mesafeyi km olarak giriniz : ");
        mesafe = input.nextInt();

        System.out.print("Yaşınızı giriniz:");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        bilet = input.nextInt();

        //Herhangi bir veri girişi hatası olduğunda diğer veriler doğru olsa bile çıktı almamak için.
        for(i=1;i<2;i++){
            if (bilet<1 || bilet>2){ System.out.print("Hatalı Yolculuk Tipi Girdiniz!");break;}
            else { bilet=bilet;}
            if (mesafe<=0){System.out.print("Hatalı Mesafe Girdiniz!"); break;}
            else { mesafe=mesafe;}

            toplamBrut = mesafe*kmUcret;

            if (bilet==2){ toplamNet = toplamBrut*2*0.8;}
            else { toplamNet=toplamBrut*1;}

            if(yas>=0 && yas<12){finalPrice=toplamNet*0.5;}
            else if(yas>=12 && yas<=24){finalPrice=toplamNet*0.9;}
            else if(yas>24 && yas<=65){finalPrice=toplamNet;}
            else if(yas>65 && yas<200){finalPrice=toplamNet*0.7;}
            else {System.out.print("Geçersiz Bir Yaş Girdiniz!");break;}

            System.out.print("\n");
            System.out.println("Toplam Tutar : "+ finalPrice + " TL");
        }
    }
}