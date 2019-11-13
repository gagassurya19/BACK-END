package tugas.tugas2;
import java.util.Scanner;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan jari-jari : ");
        double jarijari = in.nextInt();
        bola b = new bola(jarijari);
        b.print();
    }
}