import java.util.Scanner;

public class PRAK104_NurfitriaRamadhani_2510817220023 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        char[] abu=new char[3];
        char[] bagas=new char[3];

        System.out.print("Tangan Abu: ");
        for(int i=0;i<3;i++){
            abu[i] = input.next().charAt(0);
        }

        System.out.print("Tangan Bagas: ");
        for(int i=0;i<3;i++){
            bagas[i] = input.next().charAt(0);
        }

        int poinAbu=0;
        int poinBagas=0;

        for(int i=0;i<3;i++){
            char p1=abu[i];
            char p2=bagas[i];

            if(p1==p2){
            }else if((p1=='B' && p2=='G')||
                     (p1=='G' && p2=='K')||
                     (p1=='K' && p2=='B')){
                poinAbu++;
            }else{
                poinBagas++;
            }
        }

        if(poinAbu>poinBagas){
            System.out.println("Abu");
        }else if(poinBagas>poinAbu){
            System.out.println("Bagas");
        }else{
            System.out.println("Seri");
        }

        input.close();
    }
}