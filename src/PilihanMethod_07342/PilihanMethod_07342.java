package PilihanMethod_07342;
import java.util.Scanner;

public class PilihanMethod_07342 {
    public static Scanner scan = new Scanner(System.in);
    public static DataSepatuLanjutan_07342 [] data = new DataSepatuLanjutan_07342 [100];
    public static int jumlah=0;
    
    public static void create() {
        String ukuran, warna, harga, kode; 
        System.out.println("Masukan Kode Sepatu ");
        kode = scan.next();
        System.out.println("Masukan Ukuran Sepatu");
        ukuran = scan.next();
        System.out.println("Masukan Warna Sepatu");
        warna = scan.next();
        System.out.println("Masukan Harga Sepatu");
        harga = scan.next();
        data [jumlah]= new DataSepatuLanjutan_07342(harga, kode, ukuran, warna) {};
        jumlah++;
    }
    
    public static void read(){
    if(jumlah==0){
        System.out.println("Tidak Ada Data");
    }
    else{ 
        for(int i=0; i<jumlah; i++){
        System.out.println("==================");
        System.out.println("Kode Sepatu "+ data[i].getKode07342());
        System.out.println("Ukuran Sepatu "+ data[i].getUkuran07342());
        System.out.println("Warna Sepatu "+ data[i].getWarna07342());
        System.out.println("Harga Sepatu "+ data[i].getHarga07342());
        System.out.println("==================");
        }
    }
}
    public static void update(){
        String search; int cari=0;
        int edit;
        System.out.print("Masukan Kode Sepatu yang mau di Edit : ");
        search = scan.next();
        do{
            if(cari==jumlah){
                System.out.println("Tidak Ada Data");
                break;
            }
            else if (data[cari].getKode07342().equals(search) ){
                System.out.println("1. Kode Sepatu ");
                System.out.println("2. Ukuran Sepatu ");
                System.out.println("3. Warna Sepatu ");
                System.out.println("4. Harga Sepatu ");
                System.out.print("Pilih data yang ingin diubah : ");
                edit=scan.nextInt();
                switch(edit){
                    case 1 :
                        System.out.print("Ubah Kode Sepatu : ");
                        String newKode = scan.next();
                        data[cari].setKode07342(newKode); 
                        break;
                    case 2 :
                        System.out.print("Ubah Ukuran Sepatu : ");
                        String newUkuran = scan.next();
                        data[cari].setUkuran07342(newUkuran); 
                        break;
                    case 3 :
                        System.out.print("Ubah Warna Sepatu : ");
                        String newWarna = scan.next();
                        data[cari].setWarna07342(newWarna); 
                        break;
                    case 4 :
                        System.out.print("Ubah Harga Sepatu : ");
                        String newHarga = scan.next();
                        data[cari].setHarga07342(newHarga); 
                        break;
                    default :
                        System.out.println("Pilihan Tidak Ada ");
                        break;
                }
                break;
            }   
            else{
                cari++;
            }
        }while(true);
}
    
    public static void delete(){
        int cari = 0;
        System.out.println("Masukkan Kode Sepatu yang akan di Hapus : ");
        String search= scan.next();
        scan.nextLine();
        do{
            if(cari==jumlah){
                System.out.println("Tidak Ada Data !");
                break;
            }
            else if (data[cari].getKode07342().equals(search) ){
                if(cari==jumlah-1){
                    jumlah--;
                }
                else {
                    for(int i = cari; i<jumlah; i++){
                        data[i]=data[i+1];
                    }
                    jumlah--;
                }
                break;
            }
            else {
                cari=cari+1;
            }
        }while(true);
    }
}