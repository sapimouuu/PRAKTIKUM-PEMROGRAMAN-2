package soal1;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        LinkedList<Dadu> listDadu = new LinkedList<>();
        int n = input.nextInt();
        int total = 0;
        int no = 1;

        if (n <= 0) {
            System.out.println("Tidak valid");
            return;
        }

        for (int i = 0; i < n; i++) {
            Dadu dadu = new Dadu();
            dadu.acakNilai();
            listDadu.add(dadu);
        }

        for (Dadu dadu : listDadu) {
            System.out.println("Dadu ke-" + no + " bernilai " + dadu.getNilai());
            total += dadu.getNilai();
            no++;
        }

        System.out.print("Total nilai dadu keseluruhan " + total);
    }
}