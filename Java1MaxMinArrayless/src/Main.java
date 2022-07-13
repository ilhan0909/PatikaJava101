import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz ? : ");
        int numOfValues = scan.nextInt();

        int max = 0;
        int min = 0;

        for(int i=0;i<numOfValues;i++)
        {
            System.out.print("Sayı giriniz : ");
            int value = scan.nextInt();

            if(i==0){
                max=value;
                min=value;
            }
            else{
                if (value>=max){
                    max=value;
                } else if (value<=min) {
                    min=value;
                }
            }

        }
        System.out.println("En büyük sayi : " + max);
        System.out.println("En küçük sayi : " + min);
    }
}