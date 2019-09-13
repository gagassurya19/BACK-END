/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobapercabangan;
import java.util.Scanner;
/**
 *
 * @author miamia
 */
public class KonversiNilai {
    public static void main(String[] args) {
        
        //scanner
        Scanner input = new Scanner(System.in);
        
        //tipe data
        double nilai;
        
        //input
        System.out.println("-=]Program Konversi Nilai]=-");
        System.out.print("Masukkan Nilai Anda: ");
        nilai = input.nextInt();
        
        //else if
        if (nilai>=90 && nilai<100){
            System.out.println("Anda Itu Legend");
        } else if (nilai>=80 && nilai<=89){
            System.out.println("Anda itu Pro");
        } else if (nilai>=70 && nilai<=79){
            System.out.println("Anda itu beginner");
        } else{
            System.out.println("Anda itu nuub");
        }
    }
}
