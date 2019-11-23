package bufferedReader;
//Github.com/Gagassurya19

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DemoInNumerik {
    public static void main(String[] args) throws IOException {
        System.out.print("Masukkan Sebuah Bilangan Riil : ");
        
        String temp;
        double bilangan = 0;
        
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        //input data dianggap sebagai string
        temp = br.readLine();
        
        try {
            //konversi dari String ke Floating-point
            bilangan = Double.parseDouble(temp);
        } catch (NumberFormatException e) {
            System.out.println("Data yang dimasukkan bukan bilangan");
            System.exit(1);
        }
        System.out.println("Bilangan yang dimasukkan "+"adalah "+bilangan);
    }
}
