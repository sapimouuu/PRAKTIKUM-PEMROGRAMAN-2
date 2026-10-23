package soal2;

public class Anjing extends HewanPeliharaan {
    private String warnaBulu;
    private String[] kemampuan;

    public Anjing(String nama, String ras, String warnaBulu, String[] kemampuan){
        super(ras, nama);
        this.warnaBulu=warnaBulu;
        this.kemampuan=kemampuan;
    }

    void displayDetailAnjing(){
        super.display();
        System.out.println("Memiliki warna bulu : " + warnaBulu);
        System.out.print("Memiliki kemampuan : ");
        for (int i = 0; i < kemampuan.length; i++) {
            System.out.print(kemampuan[i] + " ");
        }
    }
}