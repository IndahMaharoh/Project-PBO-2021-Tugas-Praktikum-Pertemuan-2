package sepatu_07342;
import PilihanMethod_07342.*;
import java.util.Scanner;

public class Sepatu_07342 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        SepatuAdidas_07342 Adidas = new SepatuAdidas_07342();
        SepatuNike_07342 Nike = new SepatuNike_07342();
        SepatuDC_Shoes_07342 DC_Shoes = new SepatuDC_Shoes_07342();
        int pil;
        System.out.println("Selamat Datang Kim Rakha");
        do {
            System.out.println("\nPilihan Stock Sepatu Olahraga yang Ada :");
            System.out.println("1. Sepatu Adidas");
            System.out.println("2. Sepatu Nike");
            System.out.println("3. Sepatu DC Shoes");
            System.out.println("0. Log Out");
            System.out.println("Masukan Pilihan Anda : ");
            pil = scan.nextInt();
            switch(pil){
                case 1 :
                    Adidas.MerkApa();
                    Adidas.method();
                    break;
                case 2 :
                    Nike.MerkApa();
                    Nike.method();
                    break;
                case 3 :
                    DC_Shoes.MerkApa();
                    DC_Shoes.method();
                    break;
            }
        }while(pil!=0);
    }
}
