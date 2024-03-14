import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean Continue = true;
        double hasil = 0;
        System.out.println("Hello, My name is Hendy Sukandi");

        while (Continue) {
            System.out.println("Pilih operator:");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");

            int pilihan = scanner.nextInt();

            if (pilihan >= 1 && pilihan <= 4) {
                System.out.print("Masukkan angka: ");
                double angka = scanner.nextDouble();

                switch (pilihan) {
                    case 1:
                        hasil += angka;
                        break;
                    case 2:
                        hasil -= angka;
                        break;
                    case 3:
                        hasil *= angka;
                        break;
                    case 4:
                        hasil /= angka;
                        break;
                }
                System.out.println("Hasil: " + hasil);
            } else if (pilihan == 5) {
                Continue = false;
            } else {
                System.out.println("Operator tidak ada dalam pilihan.");
            }
        }
    }
}