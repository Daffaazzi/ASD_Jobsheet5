package TUGAS;

public class MainNilaiMHS08 {
    
    Mahasiswa08[] dataMahasiswa;

    void Nilai(Mahasiswa08[] dataMahasiswa) {
        this.dataMahasiswa = dataMahasiswa;
    }

    int maxUTSDC(int l, int r) {

        if (l == r) {
            return dataMahasiswa[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int leftMax  = maxUTSDC(l, mid);
        int rightMax = maxUTSDC(mid + 1, r);

        if (leftMax > rightMax) {
            return leftMax;
        } else {
            return rightMax;
        }
    }

    int minUTSDC(int l, int r) {

        if (l == r) {
            return dataMahasiswa[l].nilaiUTS;
        }

        int mid = (l + r) / 2;
        int leftMin  = minUTSDC(l, mid);
        int rightMin = minUTSDC(mid + 1, r);

        if (leftMin < rightMin) {
            return leftMin;
        } else {
            return rightMin;
        }
    }
    double rataRataUASBF() {
        double total = 0;
        for (int i = 0; i < dataMahasiswa.length; i++) {
            total = total + dataMahasiswa[i].nilaiUAS;
        }
        return total / dataMahasiswa.length;
    }
}