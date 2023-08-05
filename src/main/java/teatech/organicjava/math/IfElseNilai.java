package teatech.organicjava.math;

import java.util.Scanner;

public class IfElseNilai {
    public static void main(String[] args) {

        //deklarasi Scanner
        Scanner input = new Scanner(System.in);

        // deklarasi variable
        float nilai;

        System.out.print("Masukkan nilai: ");
        nilai = input.nextFloat();

        if (nilai >= 85) {
            System.out.println("Selamat Anda Lulus dengan nilai A");
        } else if (nilai >= 65 && nilai < 85) {
            System.out.println("Selamat Anda Lulus dengan nilai B");
        } else if (nilai >= 50 && nilai < 65) {
            System.out.println("Selamat Anda Lulus dengan nilai C");
        } else {
            System.out.println("Anda tidak Lulus, remed sana cok!");
        }
    }
}
