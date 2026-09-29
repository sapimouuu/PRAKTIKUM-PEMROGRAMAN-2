import java.util.Scanner;

public class PRAK105_NurfitriaRamadhani_2510817220023 {
    public static final double PI = 3.14;
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Masukkan jari-jari: ");
        double r = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double t = input.nextDouble();

        double v = PI * r * r * t;

        System.out.println("Volume tabung dengan jari-jari " + r + " cm dan tinggi " + t + " cm adalah " + String.format("%.3f", v) + " m3");

        input.close();
    }
}