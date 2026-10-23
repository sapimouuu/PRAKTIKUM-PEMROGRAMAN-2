package soal2;

public class Kucing extends HewanPeliharaan{
    private String warnaBulu;

    public Kucing(String ras, String nama, String warnaBulu){
        super(ras, nama);
        this.warnaBulu=warnaBulu;
    }

    void displayDetailKucing(){
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
    }
}