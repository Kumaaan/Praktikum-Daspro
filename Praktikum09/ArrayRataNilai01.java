import java.util.Scanner;
public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        int [] nilaiMhs = new int[jumlah];
        double rata1, rata2, mhsLulus = 0, mhsTdkLulus = 0;
        double totalNilaiLulus = 0, totalNilaiTdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.err.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70){
                mhsLulus++;
                totalNilaiLulus += nilaiMhs[i];
            }else {
                mhsTdkLulus++;
                totalNilaiTdkLulus += nilaiMhs[i];
            }
        }
        rata1 = totalNilaiLulus/mhsLulus;
        System.out.println("Rata-rata nila mahasiswa lulus = "+rata1);
        rata2 = totalNilaiTdkLulus/mhsTdkLulus;
        System.out.println("Rata-rata nila mahasiswa tidak lulus = "+rata2);
        sc.close();
    }
}
