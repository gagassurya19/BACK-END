package pengulangan;
import java.util.Scanner;

public class looping2 {
    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Tipe data
        int angka1, angka2;
        
        //input
        System.out.print("Input angka : ");
        angka1 = input.nextInt();
        System.out.print("input angka perulangan : ");
        angka2 = input.nextInt();
        
        //proses
        int a = angka1, b = angka2;
        for (int i = 1; i<=b; i++){
            System.out.println(a + "x" + i + "=" + (a*i));
        }
    }
}
