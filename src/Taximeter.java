import java.util.Scanner;
public class Taximeter {
    public static void main (String[] args){
        double kilometer,perKm=2.20, startPrice=10, taxiMeter;

        Scanner input=new Scanner(System.in);
        System.out.print("Gitmek İstediğiniz Mesafe(km):");

        kilometer = input.nextDouble();
        taxiMeter=kilometer*perKm ;
        taxiMeter += startPrice;

        taxiMeter= (taxiMeter<20) ? 20 : taxiMeter ;
        System.out.print("Taksimetrenin Gösterdiği Tutar:" + taxiMeter+ " TL");

    }
}
