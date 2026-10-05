package PRAK201_2510817220023_NurfitriaRamadhani;

public class Buah {
    private String nama;
    private double berat;
    private double harga;
    private double jumlah;
    private double total;
    private double diskon;

    Buah(String nama, double berat, double harga, double jumlah){
        this.nama=nama;
        this.berat=berat;
        this.harga=harga;
        this.jumlah=jumlah;
        this.total=harga*(jumlah/berat);
    }

    public double getDiskon(){
        double diskon=0;
        double total=0;
        for(int i=0;i<jumlah/4;i++){
            total+=harga * (4/berat);
            diskon+=total*0.02;
        }
        return diskon;
    }

    public void info(){
        this.diskon=getDiskon();

        System.out.printf("" +
                "Nama Buah: %s\n" +
                "Berat: %.2f\n" +
                "Harga: %.2f\n" +
                "Jumlah Beli: %.2f kg\n" +
                "Harga Sebelum Diskon: Rp%.2f\n" +
                "Total Diskon: Rp%.2f\n" +
                "Harga Setelah Diskon: Rp%.2f\n\n",
                this.nama, this.berat, this.harga, this.jumlah, this.total, this.diskon, (this.total - this.diskon));
    }
}