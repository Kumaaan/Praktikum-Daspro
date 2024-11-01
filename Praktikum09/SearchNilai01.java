public class SearchNilai01 {
    public static void main(String[] args) {

        int [] arrNilai = {80, 85, 78, 96, 90, 82, 86};
        int key = 78;
        int hasil = 0;

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i;
                break;
            }
        }
        System.out.println("Nilai " + key + " ditemukan pada indeks ke-" + hasil);
    }
}
