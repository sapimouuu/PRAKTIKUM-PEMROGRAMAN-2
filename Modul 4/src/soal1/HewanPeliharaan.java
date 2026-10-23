package soal1;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String ras, String nama){
        this.ras=ras;
        this.nama=nama;
    }

    public String getNama() {
        return nama;
    }

    public String getRas() {
        return ras;
    }

    void display(){
        System.out.println("Detail Hewan Peliharaan:\nNama hewan peliharaanku adalah : " + nama + "\nDengan ras : " + ras);
    }
}