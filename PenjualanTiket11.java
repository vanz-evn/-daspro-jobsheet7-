import java.util.Scanner;
public class PenjualanTiket11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int jumlahTiket, totalTiket = 0;
        double hargaTiket = 50000;
        double totalHarga = 0;
        double diskon, totalBayar;

        while (true) {
            System.out.print("Masukkan jumlah tiket (0 untuk selesai): ");
            jumlahTiket = sc.nextInt();
            if (jumlahTiket == 0) {
                break;
            }
            if (jumlahTiket < 0) {
                System.out.println("Jumlah tiket tidak valid. Masukkan lagi!");
                continue;
            }
            double subtotal = jumlahTiket * hargaTiket;
            if (jumlahTiket > 10) {
                diskon = 0.15;
            } else if (jumlahTiket > 4) {
                diskon = 0.10;
            } else {
                diskon = 0;
            }
            totalBayar = subtotal - (subtotal * diskon);
            totalTiket += jumlahTiket;
            totalHarga += totalBayar;
            System.out.println("Jumlah tiket: " + jumlahTiket);
            System.out.println("Subtotal: Rp " + subtotal);
            System.out.println("Diskon: " + (diskon * 100) + "%");
            System.out.println("Total bayar: Rp " + totalBayar);
        }
        System.out.println("Total tiket terjual: " + totalTiket);
        System.out.println("Total penjualan: Rp " + totalHarga);
        sc.close();
    }
}