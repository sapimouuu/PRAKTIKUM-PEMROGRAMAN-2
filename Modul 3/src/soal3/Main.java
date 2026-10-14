package soal3;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Mahasiswa> listMhs = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa berdasarkan NIM");
            System.out.println("3. Cari Mahasiswa berdasarkan NIM");
            System.out.println("4. Tampilkan Daftar Mahasiswa");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan){
                case 1:
                    System.out.print("Masukkan Nama Mahasiswa: ");
                    String nama = input.nextLine();
                    System.out.print("Masukkan NIM Mahasiswa (harus unik): ");
                    String nim = input.nextLine();
                    listMhs.add(new Mahasiswa(nama, nim));
                    System.out.println("Mahasiswa " + nama + " ditambahkan");
                    break;

                case 2:
                    System.out.print("Masukkan NIM Mahasiswa yang akan dihapus: ");
                    String delMhs = input.nextLine();

                    boolean mhsHapus = false;
                    for(int i=0; i<listMhs.size(); i++){
                        if(listMhs.get(i).getNim().equals(delMhs)){
                            listMhs.remove(i);
                            System.out.println("Mahasiswa dengan NIM " + delMhs + " dihapus");
                            mhsHapus = true;
                            break;
                        }
                    }
                    if(!mhsHapus){
                        System.out.println("Mahasiswa dengan NIM " + delMhs + " tidak ditemukan");
                    }
                    break;

                case 3:
                    System.out.print("Masukkan NIM mahasiswa yang dicari: ");
                    String cariMhs = input.nextLine();
                    boolean mhsKetemu = false;
                    for(Mahasiswa mhs : listMhs) {
                        if (mhs.getNim().equals(cariMhs)) {
                            System.out.println(mhs);
                            mhsKetemu = true;
                            break;
                        }
                    }
                    if(!mhsKetemu){
                        System.out.println("Belum ada mahasiswa dengan NIM " + cariMhs);
                    }
                    break;

                case 4:
                    System.out.println("Daftar Mahasiswa: ");
                    if (listMhs.isEmpty()){
                        System.out.println("Belum ada daftar mahasiswa");
                    }else{
                        for(Mahasiswa mhs : listMhs){
                            System.out.println(mhs);
                        }
                        break;
                    }
                    break;

                case 0:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilihan != 0);
        input.close();
    }
}