package pengulangan;
/**
 *
 * @author miamia
 */
public class pakZakariaNgulang {
    public static void main(String[] args) {
        // program untuk menentukan total jumlah
        // bilangan kelipatan 4 antara 20 - 100
        System.out.println("Bilangan kelipatan 4 20 - 100:");
        
        //perulangan for
        int total = 0; //memberi nilai awal variable
        for (int i = 24; i < 100; i+=4) { //perlangan dengan for
            System.out.print(i+" ");  //output
            total += i;  //penjumlahan dari semua data perulangan
        }
        System.out.println("\n"+total); //output
        
        //tahun kabisat 1900 - 2019
        //perulangan do/while
        System.out.println("\nTahun kabisat 1900 - 2019:");
        int a = 1900, ak = 2019; //variable data a = awal // ak = akhir
        do{
            if (a % 4 == 0){ //jika a habis dibagi dengan 4
                System.out.print(a+" "); //maka outputnya
            }
                a++; // a ditambah 1 setiap perulangan
        } while (a <= ak); // perulangan harus lebih dari a kurang dari ak
        System.out.println(""); // sebagai jeda atau "ENTER"
    }
}
