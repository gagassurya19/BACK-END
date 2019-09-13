package cobapercabangan;
import java.util.Scanner;

public class TagihanListrik {
    public static void main(String[] args) {
        
        //Scanner
        Scanner input = new Scanner(System.in);
        
        //Tipe data
        double biaya, total_pajak, persen, abonemen, harga_kwh, pemakaian, total, pajak;
        
        //data
        persen = 100;
        
        //Input
        System.out.println("-=Biaya pemakaian listrik=-");
        System.out.print("input kwh: ");
        pemakaian = input.nextInt();
        
        //If else
        if (pemakaian>=0 && pemakaian<=100){ //GOLONGAN C
            System.out.println("Golongan c");
            
            //Data
            abonemen = 20000;
            harga_kwh = 1500;
            pajak = 5;
                        
            //Proses
            biaya = abonemen + (harga_kwh*pemakaian);
            total_pajak = biaya/persen * pajak;
            total = biaya + total_pajak;
            
            //Output
            System.out.println("Total anggaran: " + total );
            
        } else if (pemakaian>=101 && pemakaian<=200){ //GOLONGAN B
            System.out.println("Golongan b");
                       
            //Data
            abonemen = 35000;
            harga_kwh = 1750;
            pajak = 10;
                        
            //Proses
            biaya = abonemen + (harga_kwh*pemakaian);
            total_pajak = biaya/persen * pajak;
            total = biaya + total_pajak;
            
            //Output
            System.out.println("Total anggaran: " + total );
            
        } else if (pemakaian>=201 && pemakaian<=300){ //GOLONGAN A
            System.out.println("Golongan a");
            
            //Data
            abonemen = 50000;
            harga_kwh = 2250;
            pajak = 15;
                        
            //Proses
            biaya = abonemen + (harga_kwh*pemakaian);
            total_pajak = biaya/persen * pajak;
            total = biaya + total_pajak;
            
            //Output
            System.out.println("Total anggaran: " + total );
            
        } else { //JIKA TIDAK MENCUKUPI
            System.out.println("Maaf untuk pemakaian " + pemakaian + "/kwh tidak mencukupi.");
        }
            System.out.println("By : MonsterINC(RPL6)");
    }
}
