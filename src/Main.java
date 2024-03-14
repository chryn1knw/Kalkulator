import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello, My name is Hendy Sukandi");

        System.out.println("Kalkulator :");
        System.out.println("Pilih:\n1.Penjumlahan\n2.Pengurangan\n3.Perkalian\n4.Pembagian\n5.Untuk selesai");
        System.out.println("Masukan pilihan : ");

        int pilihan = scanner.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        double hasil = 0;

        switch (pilihan) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                hasil = angka1 / angka2;
            default:
                System.out.println("Pilihan operator tidak valid.");
        }

        System.out.println("Hasil: " + hasil);
    }
}