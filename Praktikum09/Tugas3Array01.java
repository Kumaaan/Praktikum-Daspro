import java.util.Scanner;
public class Tugas3Array01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar",
                         "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        for (int b = 0; b < menu.length; b++) {
            System.out.println("Menu ke-" + (b + 1) + ": " + menu[b]);
        }
        System.out.print("Masukkan nama makanan yang ingin dicari: ");
        String makananDicari = scanner.nextLine();
        int hasil = 0;

        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(makananDicari)) {
                hasil++;
                break;
            }
        }
        if (hasil == 0) {
            System.out.println(makananDicari + " tidak ada di menu.");
        } else {
            System.out.println(makananDicari + " tersedia di menu.");
        }
        scanner.close();
    }
}