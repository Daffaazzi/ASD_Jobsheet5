package TUGAS;
public class DATAMahasiswa08 {
    
    public static void main(String[] args) {

        Mahasiswa08[] data = new Mahasiswa08[8];
        data[0] = new Mahasiswa08("Ahmad", "220101001", 2022, 78, 82);
        data[1] = new Mahasiswa08("Budi",  "220101002", 2022, 85, 88);
        data[2] = new Mahasiswa08("Cindy", "220101003", 2021, 90, 87);
        data[3] = new Mahasiswa08("Dian",  "220101004", 2021, 76, 79);
        data[4] = new Mahasiswa08("Eko",   "220101005", 2023, 92, 95);
        data[5] = new Mahasiswa08("Fajar", "220101006", 2020, 88, 85);
        data[6] = new Mahasiswa08("Gina",  "220101007", 2023, 80, 83);
        data[7] = new Mahasiswa08("Hadi",  "220101008", 2020, 82, 84);

        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.printf("%-8s %-12s %-12s %-10s %-10s%n",
                "Nama", "NIM", "Thn Masuk", "Nilai UTS", "Nilai UAS");
        System.out.println("-------------------------------------------------");
        for (Mahasiswa08 m : data) {
            System.out.printf("%-8s %-12s %-12d %-10d %-10d%n",
                    m.nama, m.nim, m.tahunMasuk, m.nilaiUTS, m.nilaiUAS);
        }
        System.out.println("=================================================");

        MainNilaiMHS08 nilai = new MainNilaiMHS08();
        nilai.Nilai(data);
        int n = data.length;

        int    maxUTS  = nilai.maxUTSDC(0, n - 1);
        int    minUTS  = nilai.minUTSDC(0, n - 1);
        double rataUAS = nilai.rataRataUASBF();

        System.out.println("\n=== HASIL ===");
        System.out.println("a) Nilai UTS Tertinggi (Divide and Conquer) : " + maxUTS);
        System.out.println("b) Nilai UTS Terendah  (Divide and Conquer) : " + minUTS);
        System.out.printf( "c) Rata-rata Nilai UAS (Brute Force)        : %.2f%n", rataUAS);
        System.out.println("=================================================");
    }
}