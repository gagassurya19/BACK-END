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
public class TahunKabisat {
    public static void main(String[] args) {
        //scanner
        Scanner input = new Scanner(System.in);
        
        //Tipe data
        double input_tahun;
        
        //input 
        System.out.println("-=] Hitung Kabisat [=-");
        System.out.println("Input Tahun: ");
        input_tahun = input.nextInt();
        
        //if else
        if (input_tahun%4 == 0){
            System.out.println(input_tahun + " Tahun Kabisat");
        } else{
            System.out.println(input_tahun + " Bukan tahun kabisat");
        }
        
    }
}
