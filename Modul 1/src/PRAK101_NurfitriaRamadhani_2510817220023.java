import java.util.Scanner;

public class PRAK101_NurfitriaRamadhani_2510817220023 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Masukkan Nama Lengkap: ");
    String nama = input.nextLine();

    System.out.print("Masukkan Tempat Lahir: ");
    String tempat = input.nextLine();

    System.out.print("Masukkan Tanggal Lahir: ");
    int tanggal = input.nextInt();

    System.out.print("Masukkan Bulan Lahir: ");
    int bulan = input.nextInt();

    System.out.print("Masukkan Tahun Lahir: ");
    int tahun = input.nextInt();

    System.out.print("Masukkan Tinggi Badan: ");
    int tb = input.nextInt();

    System.out.print("Masukkan Berat Badan: ");
    double bb = input.nextDouble();

    String namaBulan = "";
    switch(bulan){
      case 1:
        namaBulan="Januari";
        break;
      case 2:
        namaBulan="Februari";
        break;
      case 3:
        namaBulan="Maret";
        break;
      case 4:
        namaBulan="April";
        break;
      case 5:
        namaBulan="Mei";
        break;
      case 6:
        namaBulan="Juni";
        break;
      case 7:
        namaBulan="Juli";
        break;
      case 8:
        namaBulan="Agustus";
        break;
      case 9:
        namaBulan="September";
        break;
      case 10:
        namaBulan="Oktober";
        break;
      case 11:
        namaBulan="November";
        break;
      case 12:
        namaBulan="Desember";
        break;
      default:
        namaBulan="Tidak valid";
    }
    if (((tahun % 4 != 0) || (tahun % 100 == 0 && tahun % 400 != 0)) && tanggal > 28 && bulan == 2) {
      System.out.println("Tanggal tidak valid");
    }
    System.out.println("Nama Lengkap " + nama + ", Lahir di " + tempat + " pada Tanggal " + tanggal + " " + namaBulan + " " + tahun + "\nTinggi Badan " + tb + " cm dan Berat Badan " + bb + " kilogram");

    input.close();
  }
}