package fungsi;
import java.util.Scanner;
public class method1 {
    public static int hitung(int a, int b){
        int c = a + b;
        return c;
    }
    static void sianjir(String printCuk){
            System.out.print(printCuk);
    }
    public static void main(String[] args) {
        Scanner lebokneCuk = new Scanner(System.in);
        sianjir("Lebokno ongko sak karepmu : ");
        int o = lebokneCuk.nextInt();
        sianjir("Lebokno ongko opo ae : ");
        int e = lebokneCuk.nextInt();
        sianjir("hasil : " + hitung(o,e));
        sianjir("\nSUWOON CUUUK!!\n");
    }
}