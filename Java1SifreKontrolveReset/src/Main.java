import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user,pass,newPass, resetPerm;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız? : ");
        user=input.nextLine();
        System.out.print("Şifreniz? : ");
        pass=input.nextLine();

        //herşey doğru ise
        if (user.equals("ilhan") && pass.equals("ilhanpass")) {
            System.out.print("Giriş Başarılı");
        }
        //şifre yanlış ise
        else if (user.equals("ilhan") && !"ilhanpass".equals(pass)){
                System.out.print("Şifreniz Yanlış,sıfırlamak istermisiniz ?(evet/hayır) : ");
                resetPerm=input.nextLine();
                    if (resetPerm.equals("hayır")) {
                        System.out.print("Hoşçakalın!");
                    }
                    else if (resetPerm.equals("evet")){
                        System.out.print("Lütfen Yeni Şifrenizi Giriniz : ");
                        newPass=input.nextLine();
                            if(newPass.equals("")||newPass.equals(" ")||newPass.equals("ilhanpass")){
                                System.out.print("Yeni şifre boş karakter veya eski şifreniz olamaz.");
                            }
                            else{System.out.print("Şifre Başarıyla Değiştirildi!");}
                    }
                    else{System.out.print("Hatalı giriş yaptınız!");}

        }
        //herşey yanlış ise
        else if (!"ilhan".equals(user) && !"ilhanpass".equals(pass)){
            System.out.print("Hem kullanıcı adınız hem şifreniz hatalı!");
        }
        //şifre doğru kullanıcı adı yanlış ise
        else{System.out.print("Kullanıcı adınız hatalı!");}

        }

}
