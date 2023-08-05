package teatech.organicjava.percabangan;

import java.util.Scanner;

public class Hadiah {
    public static void main(String[] args) {
        // instance object Scanner
        Scanner input = new Scanner(System.in);

        // deklrasi variable
        int belanja = 0;
        double diskon10 = 0.1;
        double diskon5 = 0.05;

        // input total belanja
        System.out.print("Masukkan total belanja Anda: ");
        belanja = input.nextInt();

        //buat validasi dan hitung diskon
        double diskon = 0.0;
        if (belanja >= 100000) {
            diskon = belanja * diskon10;
            System.out.println("Selamat Anda mendapatkan diskon 10% yaitu: " + diskon);
        } else if (belanja < 100000 && belanja >= 50000) {
            diskon = belanja * diskon5;
            System.out.println("Selamat Anda mendapatkan diskon 5% yaitu: " + diskon);
        } else {
            System.out.println("Anda tidak mendapatkan diskon");
        }

        // Hitung total bayar setelah diskon

        double totalBelanja = belanja - diskon;
        System.out.println("Total yang harus Anda bayar adalah = " + totalBelanja);
    }
}
