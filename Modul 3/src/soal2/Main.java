package soal2;

import java.util.Scanner;
import java.util.LinkedList;

public class Main {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        LinkedList<Negara> listNegara = new LinkedList<>();

        int n = input.nextInt();
        input.nextLine();

        for(int i=0;i<n;i++){
            String nama = input.nextLine();
            String jenisKepemimpinan = input.nextLine();
            String namaPemimpin = input.nextLine();

            if(jenisKepemimpinan.equals("monarki")){
                Negara negara = new Negara(nama, jenisKepemimpinan, namaPemimpin);
                listNegara.add(negara);
            }
            else{
                int tanggal = input.nextInt();
                int bulan = input.nextInt();
                int tahun = input.nextInt();
                input.nextLine();

                Negara negara = new Negara(
                        nama,
                        jenisKepemimpinan,
                        namaPemimpin,
                        tanggal,
                        bulan,
                        tahun
                );
                listNegara.add(negara);
            }
        }
        for(Negara negara : listNegara){
            if(negara.getJenisKepemimpinan().equals("monarki")){
                System.out.println("Negara " + negara.getNama() + " mempunyai Raja bernama " + negara.getNamaPemimpin() + "\n");
            }else{
                String jabatan = negara.getJenisKepemimpinan();

                if(jabatan.equals("presiden")){
                    jabatan = "Presiden";
                } else if(jabatan.equals("perdana menteri")){
                    jabatan = "Perdana Menteri";
                }

                System.out.println("Negara " + negara.getNama() + " mempunyai " + jabatan + " bernama " + negara.getNamaPemimpin());
                System.out.println("Deklarasi Kemerdekaan pada Tanggal " + negara.getTanggal() + " " + negara.getNamaBulan() + " " + negara.getTahun() + "\n");
            }
        }
    }
}