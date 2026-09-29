import java.util.Scanner;

public class PRAK102_NurfitriaRamadhani_2510817220023 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        int n=input.nextInt();
        int i=0;
        int hasil;

        while(i<10){
            if(n % 5 == 0){
                hasil=n/5-1;
            }else{
                hasil=n;
            }

            if(i<9){
                System.out.print(hasil + ",");
            }else{
                System.out.print(hasil);
            }
            n++;
            i++;
        }
        input.close();
    }
}