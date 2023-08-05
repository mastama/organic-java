package teatech.organicjava.scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        // buat sebuah object dari scanner
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");

        // input dari keyboard
        String name = input.nextLine();

        // print input
        System.out.println("Nama saya adalah: " + name);

        // close scanner
        input.close();
    }
}
