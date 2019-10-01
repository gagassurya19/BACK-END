package fungsi;
import java.util.Scanner;
public class voidnonvoid {
    //membuat fungsi untuk menghitung
    //luas segitiga
    //non void pasti ada tipe data [fungsinya untuk mengembalikan data] dan harus ada reutrn
    //NonVoid
    public static double luasSegitiga(double a, double t){ //void digaanti dengan tipedata
        double luas = a * t * 0.5;
        return luas; // tipe non void [melaporkan nilai ke pemanggil] kemudian nilai dikembalikan
    }
    //Void
    public static void Luassegitiga(double a, double t){
        double luas = a * t * 0.5;
            System.out.println("Luas Segitiga [void] = " + luas);
    }   
    //String
    static void katakan(String print){
        System.out.print(print);
    }
    static void TampilNama(String namaDepan, int a){
        for (int i = 0; i < a; i++) {
            System.out.println(namaDepan);
        }
    }   
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);
        katakan("Program menghitung luas segitiga");
        katakan("\nmasukkan nilai alas = ");
        double alas = input.nextInt();
        katakan("Masukkan nilai tinggi = ");
        double tinggi = input.nextInt();
        //nonvoid
        katakan("\nLuas Segitiga [nonvoid] = " + luasSegitiga(alas, tinggi) + "\n"); // pemanggilnya
        //void
        Luassegitiga(alas,tinggi);
        //tampil nama edi 5x
        TampilNama("edi",5);
    }
}