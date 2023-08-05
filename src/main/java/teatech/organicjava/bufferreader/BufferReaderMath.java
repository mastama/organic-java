package teatech.organicjava.bufferreader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderMath {

    public static void main(String[] args) throws IOException {

        // membuat instance object BufferReader dengan parameter InputStreamReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Input nilai a: ");
        String a = br.readLine();

        System.out.print("Input nilai b: ");
        String b = br.readLine();

        System.out.print("Input nilai c: ");
        String c = br.readLine();

        System.out.print("Input nilai d: ");
        String d = br.readLine();
        System.out.println();

        // konversi data
        int nilaia = Integer.parseInt(a);
        int nilaib = Integer.parseInt(b);
        int nilaic = Integer.parseInt(c);
        int nilaid = Integer.parseInt(d);

        int x = nilaia + (nilaib * nilaic) - nilaid;
        System.out.println("Jadi nilai x = " + x);
    }

}
