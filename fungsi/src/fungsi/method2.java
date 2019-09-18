package fungsi;
import java.util.Scanner;
public class method2 {
    public static void hitung(double a,double b){
        double oek = a / b;
        System.out.println("hasil nya : " + oek + " km/h");
    }
    static void t(String p){
        System.out.print(p);
    }
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double j,w;
        t("Masukkan Jarak : ");
        j = i.nextInt();
        t("Masukkan waktu tempuh : ");
        w = i.nextInt();
        hitung(j,w);
    }
}