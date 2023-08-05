package teatech.organicjava.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BangunDatar {

    public static void main(String[] args) throws IOException {

        //instance object BufferReader dengan parameter InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /**
         * Hitung Luas dan Keliling Persegi
         * S x S atau S^2
         */

        System.out.println("Start Menghitung Persegi: ");
        System.out.println();

        System.out.print("Masukkan nilai sisi: ");
        int sisi = Integer.parseInt(br.readLine());

        int luasPersegi = sisi * sisi;
        int kelilingPersegi = 4 * sisi;

        System.out.println("Luas Persegi dengan sisi " + sisi + " adalah = " + luasPersegi);
        System.out.println("Keliling Persegi dengan sisi " + sisi + " adalah = " + kelilingPersegi);

        System.out.println("End Menghitung Persegi: ");

        /**
         * Hitung Luas dan Keliling Lingkaran
         */

        System.out.println("Start Menghitung Lingkaran: ");

        System.out.print("Masukkan nilai R: ");
        int rasio = Integer.parseInt(br.readLine());

//        System.out.print("Masukkan nilai eksponen: ");
//        int exponent = Integer.parseInt(br.readLine());
        double piValue = Math.PI;

        float luasLingkaran = (float) (piValue * rasio * rasio);

        System.out.println("Luas Lingkaran " + " adalah = " + luasLingkaran);

        System.out.println("End Menghitung Lingkaran: ");

    }
}
