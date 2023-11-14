import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("=== Calculator ===");
            System.out.println("1. Akar Kuadrat");
            System.out.println("2. Pangkat");
            System.out.println("3. Logaritma");
            System.out.println("4. Faktorial");
            System.out.println("5. Keluar");

            System.out.print("Pilih operasi (1/2/3/4/5): ");
            int choice = scanner.nextInt();

            if (choice == 5) {
                System.out.println("Terima kasih telah menggunakan kalkulator ini.");
                break;
            }

            try {
                System.out.print("Masukkan angka: ");
                double number = scanner.nextDouble();

                switch (choice) {
                    case 1:
                        double squareRoot = Math.sqrt(number);
                        System.out.printf("Hasil akar kuadrat dari %.1f adalah %.1f%n", number, squareRoot);
                        break;
                    case 2:
                        System.out.print("Masukkan pangkat: ");
                        double exponent = scanner.nextDouble();
                        double power = Math.pow(number, exponent);
                        System.out.printf("%.1f pangkat %.1f adalah %.1f%n", number, exponent, power);
                        break;
                    case 3:
                        double logResult = Math.log(number);
                        System.out.printf("Logaritma natural dari %.1f adalah %.15f%n", number, logResult);
                        break;
                    case 4:
                        long factorialResult = calculateFactorial((int) number);
                        System.out.printf("Faktorial dari %.0f adalah %d%n", number, factorialResult);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid. Silakan pilih kembali.");
                }
            } catch (Exception e) {
                System.out.println("Masukkan yang dimasukkan tidak valid. Silakan coba lagi.");
                scanner.nextLine(); // Membersihkan buffer input
            }
        }

        scanner.close();
    }

    private static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }
}
