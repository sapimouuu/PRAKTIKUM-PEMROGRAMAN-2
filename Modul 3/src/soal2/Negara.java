package soal2;

import java.util.HashMap;

public class Negara {
    HashMap<Integer, String> daftarBulan = new HashMap<>();

    private String nama;
    private String jenisKepemimpinan;
    private String namaPemimpin;
    private int tanggal;
    private int bulan;
    private int tahun;

    Negara(String nama, String jenisKepemimpinan, String namaPemimpin, int tanggal, int bulan, int tahun){
        this.nama=nama;
        this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
        this.tanggal=tanggal;
        this.bulan=bulan;
        namaBulan();
        this.tahun=tahun;
    }

    Negara(String nama, String jenisKepemimpinan, String namaPemimpin){
        this.nama=nama;
        this.jenisKepemimpinan=jenisKepemimpinan;
        this.namaPemimpin=namaPemimpin;
    }

    public String getNama(){
        return nama;
    }

    public void setNama(String nama){
        this.nama=nama;
    }

    public String getJenisKepemimpinan() {
        return jenisKepemimpinan;
    }

    public void setJenisKepemimpinan(String jenisKepemimpinan) {
            this.jenisKepemimpinan = jenisKepemimpinan;
    }

    public String getNamaPemimpin() {
        return namaPemimpin;
    }

    public void setNamaPemimpin(String namaPemimpin) {
        this.namaPemimpin = namaPemimpin;
    }

    public int getTanggal() {
        return tanggal;
    }

    public void setTanggal(int tanggal) {
        this.tanggal = tanggal;
    }

    public int getBulan() {
        return bulan;
    }

    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    private void namaBulan(){
        daftarBulan.put(1, "Januari");
        daftarBulan.put(2, "Februari");
        daftarBulan.put(3, "Maret");
        daftarBulan.put(4, "April");
        daftarBulan.put(5, "Mei");
        daftarBulan.put(6, "Juni");
        daftarBulan.put(7, "Juli");
        daftarBulan.put(8, "Agustus");
        daftarBulan.put(9, "September");
        daftarBulan.put(10, "Oktober");
        daftarBulan.put(11, "November");
        daftarBulan.put(12, "Desember");
    }

    public String getNamaBulan() {
        return daftarBulan.get(bulan);
    }
}