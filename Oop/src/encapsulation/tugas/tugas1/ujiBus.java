package tugas.tugas1;
import java.util.Scanner;
public class ujiBus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("---------------------------");
        System.out.print("Masukkan jumlah kuota : ");
        int kuota = in.nextInt();
        bus ujiBus = new bus(kuota);
        System.out.print("Masukkan password : ");
        int pass = in.nextInt();
        ujiBus.getPenumpang(pass);
        System.out.println("---------------------------");
        if (pass == ujiBus.setPassword()) {
            ujiBus.addPenumpang(5);
            ujiBus.cetak();
            System.out.println("-----------");
            ujiBus.addPenumpang(6);
            ujiBus.cetak();
            System.out.println("-----------");
            ujiBus.addPenumpang(2);
            ujiBus.cetak();   
            System.out.println("-----------");
            System.out.println("rata - rata berat penumpang : "+ujiBus.getAverage());
            System.out.println("---------------------------");
        }        
    }
}