package MINGGU5;
import java.util.Scanner;
public class MainPangkat08 {
    
    public static void main(String[] args) {
       
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();

        Pangkat08[] pangkat = new Pangkat08[elemen];
        for(int i= 0; i<elemen;i++){
            System.out.print("Masukkan nilai basis elemen ke-" + (i+1) + ": ");
            int basis = input.nextInt();
            System.out.print("Masukkan nilai pangkat elemen ke-" + (i+1) + ": ");
            int pangkat1 = input.nextInt();
            pangkat[i] = new Pangkat08();
            pangkat[i].pangkat(basis, pangkat1);
        }
        System.out.println("\nHasil pangkat dengan Brute Force: ");
        for(Pangkat08 p : pangkat){
            System.out.println(p.nilai+"^"+p.pangkat+" : " + p.pangkatBF(p.nilai, p.pangkat));
        }
        System.out.println("\nHasil pangkat dengan Divide and Conquer: ");
        for(Pangkat08 p : pangkat){
            System.out.println(p.nilai+"^"+p.pangkat+" : " + p.pangkatDC(p.nilai, p.pangkat));
        }
    }
}
