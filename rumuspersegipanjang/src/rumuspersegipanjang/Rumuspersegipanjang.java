/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rumuspersegipanjang;

import java.util.Scanner;
/**
 *
 * @author miamia
 */
public class Rumuspersegipanjang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Deklarasi
        double luas;
        int panjang, lebar;
        
        //scanner
        Scanner rangga = new Scanner(System.in);
        
        //input
        System.out.println("== Kalkulator Luas Persegi Panjang ==");
        System.out.print("Input panjang: ");
        panjang = rangga.nextInt();
        System.out.print("Input lebar: ");
        lebar = rangga.nextInt();
        
        luas = (double) (panjang * lebar);
        
        //output
        System.out.println("Luas = " + luas);
        
    }
    
}
