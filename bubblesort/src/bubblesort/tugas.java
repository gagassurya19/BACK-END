/*
unsolved : index string 0 tidak terbaca
13/9/19
*/
package bubblesort;
import java.util.Arrays;
import java.util.Scanner;
public class tugas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //input jumlah
        System.out.print("jumlah : ");
        int j = input.nextInt();
        String[] nama = new String[j+1]; //data nama disimpan
        
        //input data nama + nilai
        System.out.println("input "+j+" nama :");
        for (int i = 0; i < nama.length; i++) {
            nama[i] = input.nextLine();
        }
        System.out.println("input "+j+" nilai :");
        int[] nilai = new int[j]; //data nilai disimpan
        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = input.nextInt();
        }
        
        //output nama+nilai
        System.out.println("Nama  : "+Arrays.toString(nama));
        System.out.println("Nilai : "+Arrays.toString(nilai));
        
        //sorting descending
        for (int i = 0; i < nilai.length; i++) {
            for (int k = 0; k < nilai.length-i-1; k++) {
                if (nilai[k] < nilai[k+1]) {
                    int temp = nilai[k];
                    nilai[k] = nilai[k+1];
                    nilai[k+1] = temp;
                    
                    String temp_nama = nama[k];
                    nama[k] = nama[k+1];
                    nama[k+1] = temp_nama;
                }
            }
        }
        
        //output descending
        System.out.println("Ranking Nilai: ");
        for (int i = 0; i < nilai.length; i++) {
            System.out.println((i+1)+" "+nama[i]+" : "+nilai[i]);
        }
    }
}