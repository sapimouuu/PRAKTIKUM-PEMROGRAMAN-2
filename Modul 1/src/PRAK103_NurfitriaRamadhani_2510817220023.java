import java.util.Scanner;

public class PRAK103_NurfitriaRamadhani_2510817220023 {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);

        int n=input.nextInt();
        int start=input.nextInt();
        int i=1;

        do{
            if(start%2!=0){
                if(i<n){
                    System.out.print(start + ",");
                }else{
                    System.out.print(start);
                }
                i++;
            }
            start++;
        } while(i<=n);
        input.close();
    }
}