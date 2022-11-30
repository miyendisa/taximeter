import java.util.Scanner;
public class Taximeter {
    public static void main (String[] args){
        double kilometer,perKm=2.20, taxiMeter;
        int startPrice=10;

        Scanner input=new Scanner(System.in);
        System.out.print("Enter the distance (km):");

        kilometer = input.nextDouble();
        taxiMeter=kilometer*perKm ;
        taxiMeter += startPrice;

        taxiMeter= (taxiMeter<20) ? 20 : taxiMeter ;
        System.out.print("Taksimeter Fare:" + taxiMeter+ " TL");
    }
}
