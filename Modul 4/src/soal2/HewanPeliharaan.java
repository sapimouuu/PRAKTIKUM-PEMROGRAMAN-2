package soal2;

public class HewanPeliharaan {
    private String nama;
    private String ras;

    public HewanPeliharaan(String ras, String nama){
        this.ras=ras;
        this.nama=nama;
    }

    public String getRas(){
        return ras;
    }

    public String getNama(){
        return nama;
    }

    public void display(){
        System.out.println("Detail Hewan Peliharaan:");
        System.out.println("Nama hewan peliharaanku adalah : " + nama);
        System.out.println("Dengan ras : " + ras);
    }
}