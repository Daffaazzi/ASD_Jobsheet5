package MINGGU5;

import java.util.Scanner;

public class MainSum08 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen: ");
        int elemen = input.nextInt();
        
        Sum08 sm= new Sum08(elemen);
        for(int i=0; i<elemen; i++){
            System.out.print("Masukkan nilai elemen ke-" + (i+1) + ": ");
            sm.keuntungan[i] = input.nextDouble();
        }

        System.out.println("\nTotal keuntungan dengan Brute Force: " + sm.totalBF());
        System.out.println("Total keuntungan dengan Divide and Conquer: " + sm.totalDC(sm.keuntungan, 0, sm.keuntungan.length - 1));
    }

}
