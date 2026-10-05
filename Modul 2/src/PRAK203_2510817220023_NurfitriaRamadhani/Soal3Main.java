package PRAK203_2510817220023_NurfitriaRamadhani;

public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();
        //Pada p1.nama="Roi" tidak terdapat titik koma di akhir
        //p1.nama="Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin");
        //Pada Soal3Main tidak mendeklarasikan objek umur, sedangkan pada output yang diminta terdapat umur
        //Perbaikan: ditambahkan p1.umur = 17;
        p1.umur = 17;
        //Pada System.out.println("Nama Pegawai: " + p1.getNama()); terdapat kata Pegawai hal tersebut tidak sama dengan output yang diminta
        //System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        //Pada System.out.println("Umur: " + p1.umur); di akhir tidak terdapat kata tahun seperti output yang diminta
        //System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}