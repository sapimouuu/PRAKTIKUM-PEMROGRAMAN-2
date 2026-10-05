package PRAK203_2510817220023_NurfitriaRamadhani;

//Pada public class Employee berdasar nama file yang diminta, nama class yang dituliskan kurang tepat
//public class Employee
public class Pegawai {
    public String nama;
    //Pada public char asal; merujuk pada output, tipe data yang digunakan salah
    //public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

    //Pada public void setJabatan() terdapat kesalahan dikarenakan tidak mendeklarasikan parameter
    //public void setJabatan()
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}