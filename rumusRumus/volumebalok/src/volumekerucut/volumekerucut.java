/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volumekerucut;
import java.util.Scanner;
/**
 *
 * @author miamia
 */
public class volumekerucut {
    private static Object input;
    public static void main(String[] args) {
        
        //kontrol balik
        String balik ="y";
        while (balik.equals("y"))
            {
        
        //deklarasi
        double volume;
        float r, t;
                
        //scanner
        Scanner read = new Scanner(System.in);
        
        //input data
        System.out.println("====================");
        System.out.println("== Volume Kerucut ==");
        System.out.println("= Pilih PI =");
        System.out.println("1. PI = 22/7");
        System.out.println("2. PI = 3.14");
        System.out.println("=====================");
        System.out.println("Pilihan = 1/2");
        System.out.println("=====================");
        
        //Switch Pilihan
        System.out.print("Pilih: ");
        int pilih = read.nextInt();
        System.out.println("=====================");
        
        switch (pilih){
            case 1:{
                //input data 22/7
                System.out.println("====== PI 22/7 ======");
                System.out.print("Jari - jari: ");
                r = read.nextInt();
                System.out.print("Tinggi: ");
                t = read.nextInt();
                
            //proses
            volume = 22/7*r*r*t/3;
                
                //printout
                System.out.println("Volume Kerucut 22/7: "+volume);
            
                break;
            }
            case 2:{
                //input data 3.14
                System.out.println("====== PI 3.14 ======");
                System.out.println("Jari - jari: ");
                r = read.nextInt();
                System.out.println("Tinggi: ");
                t = read.nextInt();
                
            //proses
            volume = 3.14*r*r*t/3;
                
                //printout
                System.out.println("Volume Kerucut 3.14: "+volume);
            }
                break;
            }
            System.out.println("=====================");
            System.out.println("Apakah ingin kembali ? (y/t)");
            balik = read.next();
        }
    }
}


        