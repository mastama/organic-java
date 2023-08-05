package teatech.organicjava.operatorternary;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OperatorTernary {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Masukkan nilai suka: ");
        String suka = br.readLine();
        System.out.print("Masukkan nilai tidakSuka: ");
        String tidakSuka = br.readLine();

        int totalSuka = Integer.parseInt(suka);
        int totalTidakSuka = Integer.parseInt(tidakSuka);

        String jawaban = (totalSuka > totalTidakSuka) ? "Fans" : "Hatters";
        System.out.println(jawaban);
    }
}
