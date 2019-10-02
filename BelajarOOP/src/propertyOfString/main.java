package propertyOfString;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String balik = "y";
        while(balik.equals("y")){
            System.out.println("Sedang memuat...");
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan kalimat : ");
        String inputan = input.next();
        proses olah = new proses(inputan);
        olah.balik();
        olah.vokal();
        olah.konsonan();
        olah.upper();
        olah.lower();
        olah.striped();
            System.out.println("ingin mengulang ? (y/t)");
            balik = input.next();
        } 
        System.out.println("Terimakasih :D");
    }
}