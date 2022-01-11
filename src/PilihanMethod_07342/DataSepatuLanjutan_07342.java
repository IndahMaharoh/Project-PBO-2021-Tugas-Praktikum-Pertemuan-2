package PilihanMethod_07342;

public abstract class DataSepatuLanjutan_07342 extends DataSepatu_07342{
    private String harga07342, kode07342;

    public DataSepatuLanjutan_07342(String harga07342, String kode07342, String ukuran07342, String warna07342) {
        super(ukuran07342, warna07342);
        this.harga07342 = harga07342;
        this.kode07342 = kode07342;
    }

    public String getHarga07342() {
        return harga07342;
    }
    
    public void setHarga07342(String harga07342) {
        this.harga07342 = harga07342;
    }

    public String getKode07342() {
        return kode07342;
    }

    public void setKode07342(String kode07342) {
        this.kode07342 = kode07342;
    }

}
