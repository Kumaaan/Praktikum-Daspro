import java.util.Scanner;
public class frekuensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kelas1=0, kelas2=0, kelas3=0, kelas4=0, kelas5=0, kelas6=0, kelas7=0;
        for (int i = 1; i <= 80; i++) {
            System.out.print("Masukkan angka ke-" + i + ":");
            int angka = sc.nextInt();
            if (angka >= 35 && angka <= 44) {
                kelas1++;
            } else if (angka >= 45 && angka <= 54) {
                kelas2++;
            } else if (angka >= 55 && angka <= 64) {
                kelas3++;
            } else if (angka >= 65 && angka <= 74) {
                kelas4++;
            } else if (angka >= 75 && angka <= 84) {
                kelas5++;
            } else if (angka >= 85 && angka <= 94) {
                kelas6++;
            } else if (angka >= 95 && angka <= 104) {
                kelas7++;
            }
        }
        System.out.println("jummlah kelas 1: " + kelas1);
        System.out.println("jummlah kelas 2: " + kelas2);
        System.out.println("jummlah kelas 3: " + kelas3);
        System.out.println("jummlah kelas 4: " + kelas4);
        System.out.println("jummlah kelas 5: " + kelas5);
        System.out.println("jummlah kelas 6: " + kelas6);
        System.out.println("jummlah kelas 7: " + kelas7);
        sc.close();
        
    }
}
