package teatech.organicjava.scanner;

import java.util.Scanner;

public class ScannerNextLine {

    public static void main(String[] args) {

        // deklarasi variable
        String name, address;
        int age;

        Scanner input = new Scanner(System.in);

        String judul = "Belajar menggunakan scaner nextLine";
        System.out.println(judul.toUpperCase());
        System.out.println("============================================");

        System.out.print("Enter your name: ");
        name = input.nextLine();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter your address: ");
        address = input.next();

        //close
        input.close();

        // menampilkan apa yang sudah di simpan di variable
        System.out.println("============================================");
        System.out.println("Nama saya adalah: " + name);
        System.out.println("Saat ini saya berusia: " + age);
        System.out.println("Saat ini saya tinggal di: " + address);


    }
}
