package propertyOfString;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        String balik = "y";
        while(balik.equals("y")){
            Scanner input = new Scanner(System.in);
            System.out.print("masukkan kalimat : ");
            String inputan = input.nextLine();
            proses olah = new proses(inputan); //membuat objek baru dan menghubungkan class
            olah.balik();
            olah.vokal();
            olah.konsonan();
            olah.upper();
            olah.lower();
            olah.printstrip();
            System.out.println("ingin mengulang ? (y/t)");
            balik = input.next();
            System.out.println("Sedang memuat...");
        } 
        System.out.println("Terimakasih :D");
    }
}