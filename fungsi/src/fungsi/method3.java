package fungsi;
import java.util.Scanner;
public class method3 {
    //@Gagassurya19
    //TUGAS 5
    public static double hitung(double a,double b,double c){
        double t;
        if (a > b && a > c) {
            t = a;
        } else {
            if (b > c) {
                t = b;
            } else {
                t = c;
            }
        }
        return t;
    }
    static void i(String p){
        System.out.print(p);
    }
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double a,b,c,d;
        i("Masukkan nilai ke I : ");
        a = i.nextDouble();
        i("Masukkan nilai ke II : ");
        b = i.nextDouble();
        i("Masukkan nilai ke III : ");
        c = i.nextDouble();
        System.out.println("terbesar : " + hitung(a,b,c));
    }
}