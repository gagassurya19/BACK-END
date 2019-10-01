package fungsi;
import java.util.Scanner;
    //@Gagassurya19
    //LATIHAN 1
public class latihan1 {
    public static int hitung(int a, int b){
        int c = a + b;
        return c;
    }
    static void p(String print){
            System.out.print(print);
    }
    public static void main(String[] args) {
        Scanner lebokne = new Scanner(System.in);
        p("masukkan bilangan ke I : ");
        int o = lebokne.nextInt();
        p("masukkan bilangan ke II : ");
        int e = lebokne.nextInt();
        p("hasil : " + hitung(o,e));
        p("\nSUWOON!!\n");
    }
}