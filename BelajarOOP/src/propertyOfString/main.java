package propertyOfString;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("masukkan kalimat : ");
        String inputan = input.next();
        //kata dibalik
        proses olah = new proses(inputan);
        System.out.println("kalimat dibalik : "+olah.balik());
        System.out.println("huruf vokal ada : "+olah.vokal());
        System.out.println("huruf konsonan ada : "+olah.konsonan());
        System.out.println("Upper Case : "+olah.upper());
        System.out.println("Lower Case : "+olah.lower());
        //System.out.println("Stripped : "+olah.striped());
    }
}
