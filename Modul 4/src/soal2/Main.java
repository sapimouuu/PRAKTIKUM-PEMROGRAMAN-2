package soal2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Pilih jenis hewan yang ingin diinputkan:\n1 = Kucing\n2 = Anjing");
        System.out.print("Masukkan pilihan: ");
        int pilihan = input.nextInt();
        input.nextLine();

        HewanPeliharaan hewan;

        switch(pilihan){
            case 1:
                System.out.print("Nama hewan peliharaan: ");
                String nama = input.nextLine();
                System.out.print("Ras: ");
                String ras = input.nextLine();
                System.out.print("Warna Bulu: ");
                String warnaBulu = input.nextLine();
                Kucing cat = new Kucing(ras, nama, warnaBulu);
                cat.displayDetailKucing();
                break;

            case 2:
                System.out.print("Nama hewan peliharaan: ");
                nama = input.nextLine();
                System.out.print("Ras: ");
                ras = input.nextLine();
                System.out.print("Warna Bulu: ");
                warnaBulu = input.nextLine();
                System.out.print("Kemampuan: ");
                String[] kemampuan = input.nextLine().split(",");
                Anjing dog = new Anjing(nama, ras, warnaBulu, kemampuan);
                dog.displayDetailAnjing();
                break;

            default:
                System.out.println("Pilihan tidak valid");
        }
        input.close();
    }
}