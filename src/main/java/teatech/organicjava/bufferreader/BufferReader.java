package teatech.organicjava.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

    public static void main(String[] args) throws IOException {

        //deklarasikan variable
        String nama;

        //membuat instance objek InputStreamReader
        InputStreamReader isr = new InputStreamReader(System.in);

        //membuat instance object BufferReader
        BufferedReader br = new BufferedReader(isr);

        //mengisi variable nama dengan bufferReader
        System.out.print("Inputkan nama: ");
        nama = br.readLine();

        // tampilkan outpul variable nama
        System.out.println("Nama ku adalah: " + nama);

    }
}
