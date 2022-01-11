package sepatu_07342;
import PilihanMethod_07342.*;
import java.util.Scanner;

public class SepatuDC_Shoes_07342 extends MerkSepatu_07342{
    public static Scanner scan = new Scanner(System.in);

    @Override
    public void MerkApa() {
        System.out.println("Merk Sepatu DC Shoes");
    }
    
    public void method(){
    int pil;
        do {
            System.out.println("1. Tambah data sepatu");
            System.out.println("2. Tampilkan data sepatu");
            System.out.println("3. Perbarui data sepatu");
            System.out.println("4. Hapus data sepatu");
            System.out.println("0. Log Out");
            System.out.println("Masukan Pilihan Anda : ");
            pil = scan.nextInt();
            switch(pil){
                case 1 :
                    PilihanMethod_07342.create();
                    break;
                case 2 :
                    PilihanMethod_07342.read();
                    break;
                case 3 :
                    PilihanMethod_07342.update();
                    break;
                case 4 : 
                    PilihanMethod_07342.delete();
                    break;
            }
        }while(pil!=0);
    }
}