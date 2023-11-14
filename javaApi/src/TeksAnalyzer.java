import java.util.Scanner;

public class TeksAnalyzer {
    private static String teks = "";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU TEKS ANALYZER ===");
            System.out.println("1. Masukkan Teks");
            System.out.println("2. Hitung Jumlah Karakter");
            System.out.println("3. Hitung Jumlah Kata");
            System.out.println("4. Cari Kata dalam Teks");
            System.out.println("5. Keluar");
            System.out.print("Pilihan Anda: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    masukkanTeks(scanner);
                    break;
                case 2:
                    hitungJumlahKarakter();
                    break;
                case 3:
                    hitungJumlahKata();
                    break;
                case 4:
                    cariKataDalamTeks(scanner);
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan program Teks Analisis!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
            }
        }
    }

    private static void masukkanTeks(Scanner scanner) {
        System.out.print("Masukkan teks: ");
        teks = scanner.nextLine();
        if (!teks.isEmpty()) {
            System.out.println("Teks telah dimasukkan!");
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks kembali.");
        }
    }

    private static void hitungJumlahKarakter() {
        int jumlahKarakter = teks.length();
        System.out.println("Jumlah karakter dalam teks: " + jumlahKarakter);
    }

    private static void hitungJumlahKata() {
        if (!teks.isEmpty()) {
            String[] kataArray = teks.split("\\s+");
            int jumlahKata = kataArray.length;
            System.out.println("Jumlah kata dalam teks: " + jumlahKata);
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.");
        }
    }

    private static void cariKataDalamTeks(Scanner scanner) {
        if (!teks.isEmpty()) {
            System.out.print("Masukkan kata yang ingin dicari: ");
            String kataDicari = scanner.nextLine();
            int count = 0;

            if (!kataDicari.isEmpty()) {
                String[] kataArray = teks.split("\\s+");
                for (String kata : kataArray) {
                    if (kata.equalsIgnoreCase(kataDicari)) {
                        count++;
                    }
                }

                System.out.printf("Kata '%s' ditemukan sebanyak %d kali dalam teks.%n", kataDicari, count);
            } else {
                System.out.println("Kata yang dicari kosong. Silakan masukkan kata kembali.");
            }
        } else {
            System.out.println("Teks kosong. Silakan masukkan teks terlebih dahulu.");
        }
    }
}