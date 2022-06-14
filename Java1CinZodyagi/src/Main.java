import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dogumYili,i;

        System.out.print("Doğum yılınızı giriniz(1850-2023) : ");
        dogumYili = input.nextInt();
        for(i=1;i<2;i++){
            //en yaşlı insan aslında 150 yaşında bile değil ve 9 ay içinde doğacak tüm çocuklar 2023 içinde doğabilir,herkes için ortak aralık 1850-2023
            if (dogumYili<1850 || dogumYili>2023){ System.out.print("Hatalı Yıl Girdiniz!");break;}
            else { dogumYili=dogumYili;}

            System.out.print("\n");
            if (dogumYili%12==0){System.out.print("Çin Zodyağı Burcunuz Maymun");}
            else if (dogumYili%12==1){System.out.print("Çin Zodyağı Burcunuz Horoz");}
            else if (dogumYili%12==2){System.out.print("Çin Zodyağı Burcunuz Köpek");}
            else if (dogumYili%12==3){System.out.print("Çin Zodyağı Burcunuz Domuz");}
            else if (dogumYili%12==4){System.out.print("Çin Zodyağı Burcunuz Fare");}
            else if (dogumYili%12==5){System.out.print("Çin Zodyağı Burcunuz Öküz");}
            else if (dogumYili%12==6){System.out.print("Çin Zodyağı Burcunuz Kaplan");}
            else if (dogumYili%12==7){System.out.print("Çin Zodyağı Burcunuz Tavşan");}
            else if (dogumYili%12==8){System.out.print("Çin Zodyağı Burcunuz Ejderha");}
            else if (dogumYili%12==9){System.out.print("Çin Zodyağı Burcunuz Yılan");}
            else if (dogumYili%12==10){System.out.print("Çin Zodyağı Burcunuz At");}
            else if (dogumYili%12==11){System.out.print("Çin Zodyağı Burcunuz Koyun");}
            System.out.print("\n");


    }
}
}