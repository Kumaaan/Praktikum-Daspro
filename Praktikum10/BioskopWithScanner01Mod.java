package Praktikum10;
import java.util.Scanner;
public class BioskopWithScanner01Mod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next;
        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1-3): ");
            int menu = sc.nextInt();
            sc.nextLine(); 

            switch (menu) {
                case 1: 
                    while (true) {
                        System.out.print("\nMasukkan nama: ");
                        nama = sc.nextLine();
                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Tempat duduk tidak tersedia!");
                            System.out.println("Masukkan kembali baris dan kolom.");
                            continue; 
                        } else if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Tempat duduk telah terisi!");
                            System.out.println("Silakan masukkan baris dan kolom kembali.");
                        } else {
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Tempat duduk berhasil dipesan untuk " + nama);
                        }
                        System.out.print("Input penonton lainnya (y/n) : ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                        
                    }break; 

                case 2: 
                    System.out.println("\nDaftar Penonton:");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                            if (penonton[i][j] == null) {
                                System.out.print("***\t"); 
                            } else {
                                System.out.printf("%s ", penonton[i][j]);
                            }
                        }
                        System.out.println(); 
                    }
                    break;

                case 3: 
                    System.out.println("Terima kasih!");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}