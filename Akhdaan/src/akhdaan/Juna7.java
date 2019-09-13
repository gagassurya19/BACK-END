/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akhdaan;

/**
 *
 * @author miamia
 */
public class Juna7 {
    public static void main (String[] args) {
        // Deklarasi //
        int x = 12; // dikonversikan ke biner = 0000 1100
        int y = 20; // dikonversikan ke biner = 0001 0100
        int z;
        
        z = x | y;
        System.out.println("Hasil Operasi Bitwise OR: " + z);
        
        z = x & y;
        System.out.println("Hasil Operasi Bitwise AND: " + z);
        
        z = x ^ y;
        System.out.println("Hasil Operasi Bitwise XOR: " + z);
        
        z = ~x;
        System.out.println("Hasil Operasi Bitwise NOT:" + z);
        
        z = x << 3;
        System.out.println("Hasil Operasi Bitwise Shift Left:" + z);
        
        z = x >> 2;
        System.out.println("Hasil Operasi Bitwise Shift Right:" + z);
         
    }
    
}
