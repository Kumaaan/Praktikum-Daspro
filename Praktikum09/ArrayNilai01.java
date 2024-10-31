import java.util.Scanner;
public class ArrayNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] nilaiAkir = new int[10];

        for (int i = 0; i < 10; i++){
            System.out.print("Masukkan nilai akhir ke-" + i+ ": ");
            nilaiAkir[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++){
            System.out.println("Nilai akkhir ke-"+i+" adalah "+nilaiAkir[i]);
        }
        sc.close();
    }
}
