/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulator;

import java.util.Scanner;

/**
 *
 * @author miamia
 */
public class Kalkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Kalkulator
        
        //tombol balik
        String balik="y";
        while (balik.equals("y"))
        {
        //deklarasi
        double var_a, var_b, var_c;
        
        //scanner
        Scanner input = new Scanner(System.in);
        
        //input text
        System.out.println("=========]Kalkulator[=========");
        System.out.println("======]Pilih Kalkulator[======");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("======] Pilih [1/2/3/4] [=====");
        System.out.print("Pilih: ");
        //Switch Pilihan
        int pilih = input.nextInt();
        System.out.println("==============================");
        
        switch (pilih){
            case 1: {
                //input
                System.out.println("");
                System.out.println("=========]Kalkulator[=========");
                System.out.println("========]Penjumlahan[=========");
                System.out.print("masukan angka I: ");
                var_a = input.nextDouble();
                System.out.print("masukan angka II:");
                var_b = input.nextDouble();
                //proses
                var_c = var_a + var_b;
                //outpu
                System.out.println("hasil: " + var_c);
            }
             break;
            case 2:{
                //input
                System.out.println("");
                System.out.println("=========]Kalkulator[=========");
                System.out.println("========]Pengurangan[=========");
                System.out.print("masukan angka I: ");
                var_a = input.nextDouble();
                System.out.print("masukan angka II:");
                var_b = input.nextDouble();
                //proses
                var_c = var_a - var_b;
                //outpu
                System.out.println("hasil: " + var_c);
            }
            break;
            case 3:{
                //input
                System.out.println("");
                System.out.println("=========]Kalkulator[=========");
                System.out.println("=========]Perkalian[==========");
                System.out.print("masukan angka I: ");
                var_a = input.nextDouble();
                System.out.print("masukan angka II:");
                var_b = input.nextDouble();
                //proses
                var_c = var_a * var_b;
                //outpu
                System.out.println("hasil: " + var_c);
            }
            break;
                case 4:{
                //input
                System.out.println("");
                System.out.println("=========]Kalkulator[=========");
                System.out.println("=========]Pembagian[==========");
                System.out.print("masukan angka I: ");
                var_a = input.nextDouble();
                System.out.print("masukan angka II:");
                var_b = input.nextDouble();
                //proses
                var_c = var_a / var_b;
                //outpu
                System.out.println("hasil: " + var_c);
            }
            break;
            }
            System.out.println("=====================");
            System.out.println("Apakah ingin kembali ? (y/t)");
            balik = input.next();
        }
    }
    
}
