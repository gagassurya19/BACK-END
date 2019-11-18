    package bufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class inputChar {
    public static void main(String[] args) throws IOException {
        System.out.print("masukkan karakter : ");
        char ch;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        ch = (char) br.read();
        System.out.println("Karakter yang dimasukkan : "+ch);        
    }
}