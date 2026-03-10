package MINGGU5;

import java.util.Scanner;

public class MainFaktorial08 {
    
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan nilai n: ");
        int nilai = input.nextInt();

        Faktorial08 faktorial = new Faktorial08();
        System.out.println("Nilai faktorial " + nilai );
        System.out.println(" menggunakan BF : " + faktorial.faktorialBF(nilai));
        System.out.println("Nilai faktorial " + nilai);
        System.out.println(" menggunakan DC : " + faktorial.faktorialDC(nilai));
    }
}
