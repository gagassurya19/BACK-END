package selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] data = {9,3,10,345,547,2,34};
        System.out.println("data sebeum disorting: "+Arrays.toString(data));
        
        for (int i = 0; i < data.length-1; i++) {
            System.out.println("iterasi ke-"+(i+1));
            for (int j = i+1; j < data.length; j++) {
                if (data[i] > data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
                System.out.println(Arrays.toString(data));
            }
            System.out.println("");
        }
        System.out.println("Hasil sorting Ascending : "+Arrays.toString(data));
        
        for (int i = 0; i < data.length-1; i++) {
            for (int j = i+1; j < data.length; j++) {
                if (data[i] < data[j]) {
                    int temp = data[i];
                    data[i] = data[j];
                    data[j] = temp;
                }
                //System.out.println(Arrays.toString(data));
            }
            //System.out.println("");
        }
        System.out.println("Hasil sorting Descending : "+Arrays.toString(data));
    }
    
}
