package bufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class inputString {
    public static void main(String[] args) throws IOException{
        System.out.print("Masukkan Kalimat : ");
        String kalimat;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        kalimat = br.readLine();
        System.out.println("Kalimat yang anda inpout : "+kalimat);
    }
}