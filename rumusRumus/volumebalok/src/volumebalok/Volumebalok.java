/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumebalok;
import java.util.Scanner;
/**
 *
 * @author miamia
 */
public class Volumebalok {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //deklarasi
        double volume;
        int panjang, lebar, tinggi;
        
        //scanner data user
        Scanner read = new Scanner(System.in);
        
        //input data
        System.out.println("== Volume Balok ==");
        System.out.println("Panjang: ");
        panjang = read.nextInt();
        System.out.println("Lebar : ");
        lebar = read.nextInt();
        System.out.println("Tinggi: ");
        tinggi = read.nextInt();
        
        //Proses
        volume = panjang*lebar*tinggi;
        
        //output
        System.out.println("Volume Balok : "+volume);
    }
    
}
