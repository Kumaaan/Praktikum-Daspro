import java.util.Scanner;
public class Tugas1Array01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa : ");
        int jumlah = sc.nextInt();
        int [] nilaiMhs = new int[jumlah];
        double rata, nilaiTertinggi = 0, nilaiTerandah =100;
        double totalNilai= 0;
     
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.err.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilaiMhs[i]);
            if (nilaiMhs[i] > nilaiTertinggi) {
                nilaiTertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < nilaiTerandah) {
                nilaiTerandah = nilaiMhs[i];
            }
            totalNilai += nilaiMhs[i];
        }
        rata = totalNilai/nilaiMhs.length;
        System.out.println("Rata-rata nilai mahasiswa = "+rata);
        System.out.println("Nilai mahasiswa tertinggi = "+nilaiTertinggi);
        System.out.println("Nilai mahasiswa terendah = "+nilaiTerandah);
        sc.close();
    }
}
