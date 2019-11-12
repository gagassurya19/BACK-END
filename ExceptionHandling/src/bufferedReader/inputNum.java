package bufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class inputNum {
    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan bilangan bulat : ");
        String temp;
        int bilangan = 0;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //input String
        temp = br.readLine();
        try {
            bilangan = Integer.parseInt(temp);
        } catch (NumberFormatException e) {
            System.out.println("Data bukan bilangan bulat");
            System.exit(1);
        }
        System.out.println("Bilangan yang dimasukkan adalah : "+temp);
    }
}
