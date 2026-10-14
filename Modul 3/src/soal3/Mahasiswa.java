package soal3;

public class Mahasiswa {

    private String nama;
    private String nim;

    Mahasiswa(String nama, String nim){
        this.nama=nama;
        this.nim=nim;
    }

    public String getNama() {
        return nama;
    }
    public String getNim() {
        return nim;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public String toString() {
        return "NIM: " + nim + ", Nama: " + nama;
    }
}