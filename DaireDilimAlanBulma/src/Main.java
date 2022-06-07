import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double alan,pi=3.14,yariCap,alanRound;
        int angle;

        System.out.print("Daire Yarıçapını Giriniz : ");
        yariCap = input.nextDouble();
        System.out.print("Daire Diliminin Açısını Giriniz : ");
        angle = input.nextInt();

        alan = (pi*(yariCap*yariCap)*angle)/360;
        alanRound = Math.round( alan * 100.0 ) / 100.0;

        System.out.println("Daire Diliminin Alanı : "+ alanRound);
    }
}