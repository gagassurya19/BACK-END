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
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here74        
        
        String identitas = "Gagas Surya Laksana / X-RPL6 / 24";
        System.out.println("Identitas : " + identitas);
        
        Scanner input = new Scanner(System.in);
        System.out.print("Nilai a ? ");
        int a = input.nextInt();
        
        //IF (SATU PERCABANGAN)
        System.out.println("\nIF... 1");
        if (a < 5) System.out.println("Nilai a kurang dari 5");   
        
        System.out.println("\nIF... 2");
        if (a == 5) System.out.println("Nilai a sama dengan 5");
        
        System.out.println("\nIF... 3");
        if (a > 5) System.out.println("Nilai a lebih dari 5");
        {
            System.out.println("Isi variable a: " + a);
                            
        }        
        
        //IF ELSE (DUA PERCABANGAN)
        System.out.println("\nIF..ELSES..");
        if (a < 5){
            System.out.println("Isi variable : " + a);
            System.out.println("Nilai a kurang dari 5");
        } else System.out.println("nilai a lebih dari atau sama dengan 5");
        
        
    }
    
}
