package teatech.organicjava.scanner;

import java.util.Scanner;

public class ScannerBangunRuang {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=================MENGHITUNG KUBUS DIMULAI=================");

        float sisi ;

        // Masukan nilai sisi
        System.out.print("masukan nilai sisi: ");
        sisi = input.nextFloat();
        System.out.println("kubus memiliki sisi: " + sisi);

        // rumus bangun ruang kubus
        double volumeKubus = sisi * sisi * sisi;
        double luasPermukaanKubus = 6 * (sisi * sisi);
        double kelilingKubus = 12 * sisi;
        double luasSalahSatuSisiKubus = sisi * sisi;


        System.out.println("Volume kubus dengan sisi " + sisi + " adalah: = " + volumeKubus);
        System.out.println("Luas Permukaan kubus dengan sisi " + sisi + " adalah: = " + luasPermukaanKubus);
        System.out.println("Keliling kubus dengan sisi " + sisi + " adalah: = " + kelilingKubus);
        System.out.println("Luas Salah Satu Sisi kubus dengan sisi " + sisi + " adalah: = " + luasSalahSatuSisiKubus);

        System.out.println("=================MENGHITUNG KUBUS SELESAI=================");

        System.out.println("=================MENGHITUNG BALOK DIMULAI=================");
        /**
         * Bangun ruang Balok
         */

        int panjang;
        int lebar;
        int tinggi;

        // masukan nilai p, l, t
        System.out.print("Masukkan nilai p: ");
        panjang = input.nextInt();
        System.out.println("Balok dengan panjang: " + panjang);

        System.out.print("Masukkan nilai l: ");
        lebar = input.nextInt();
        System.out.println("Balok dengan lebar: " + lebar);

        System.out.print("Masukkan nilai t: ");
        tinggi = input.nextInt();
        System.out.println("Balok dengan tinggi: " + tinggi);

        //rumus Balok
        double volumeBalok = panjang * lebar * tinggi;
        double luasPermukaanBalok = 2 * (panjang*lebar + lebar*tinggi + panjang*tinggi);
        double kelilingBalok = 4 * (panjang + lebar + tinggi);
        double diagonalRuang = Math.sqrt(panjang^2 + lebar^2 + tinggi^2);

        System.out.println("Volume Balok" + " adalah: = " + volumeBalok);
        System.out.println("Luas Permukaan Balok" + " adalah: = " + luasPermukaanBalok);
        System.out.println("Keliling Balok" + " adalah: = " + kelilingBalok);
        System.out.println("Diagonal Ruang Balok" + " adalah: = " + diagonalRuang);

        //close
        input.close();

        System.out.println("=================MENGHITUNG BALOK SELESAI=================");
    }
}
