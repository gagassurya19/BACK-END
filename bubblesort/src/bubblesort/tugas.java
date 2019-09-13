package bubblesort;
import java.util.Arrays;
import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Jumlah Siswa : ");
        int j = input.nextInt();
        int[] nil = new int[j];
        System.out.println("masukkan data : ");
        
        String s = "";
        int n = 0;
        int [] ni = new int[n];
        for (int i = 0; i < j; i++) {
            System.out.print("Nama : ");
            s = input.next();
            
            System.out.print(" --> ");
            n = input.nextInt();
        }
        System.out.println(s);
        System.out.println(ni[n]);
        */
        
        System.out.println("jumlah : ");
        int j = input.nextInt();
        String[] nama = new String[j+1];
        nama[0]=nama[1];
        
        System.out.println("Please enter "+j+" names to sort");
        for (int i = 0; i < nama.length; i++) {
            nama[i] = input.nextLine();
        }
        
        System.out.println("Please enter "+j+" names to sort");
        int[] nilai = new int[j];
        nilai[0] = nilai[1];
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = input.nextInt();
        }
        
        System.out.println(Arrays.toString(nama));
        System.out.println(Arrays.toString(nilai));
    }
}