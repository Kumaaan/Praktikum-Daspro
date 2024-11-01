import java.util.Scanner;
public class SearchNilai01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa yang akan diinput : ");
        int jumlah = sc.nextInt();
        int [] nilaiMhs = new int[jumlah];
        int hasil = 0, key;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        System.out.print("Masukkan nilai yang dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                hasil = i + 1;
                break;
            }
        }
        if (hasil == 0) {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }else {
            System.out.println("Nilai " + key + " merupakan nilai mahasiswa ke-" + hasil);
        }
        sc.close();
    }
}
