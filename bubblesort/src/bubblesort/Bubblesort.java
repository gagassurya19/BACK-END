/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bubblesort;

import java.util.Arrays;

/**
 *
 * @author miamia
 */
public class Bubblesort {

    /**
     * @param args the command line arguments
     */
    
    
        /*
    public void bubblesort(){
        for (int i = 1; i < n; i++) {
            for (int j = n - 1; j >= 1; j++) {
                if (data[j] > data[j-1]) {
                    tukar(j, j-1); //desending
                }
            }
        }
    }
    */

    static void BubbleSort(int[]data){
        
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[] data ={1,5,7,3,4,2,8,20,17,15};
        
        System.out.println("Bilangan sebelum disorting: " + Arrays.toString(data));
        
        BubbleSort(data);
        
        System.out.print("Data Ascending : ");
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length-1; j++) {
                if (data[j]>data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                    for (int k = 0; k < data.length; k++) {
                        System.out.println(data[k]);
                    }
                }
            }
        }
        
        /*
        for (int i = 0; i < data.length; i++) {
           System.out.print(data[i]+" ");
        }
        */
        
        System.out.print("\nData Descending : ");
            for (int i = 0; i < data.length; i++) {
                StringBuffer str;
                str = new StringBuffer(data[i]);
                System.out.println(str.reverse());
        }
      }
    }
    
