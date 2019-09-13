package bubblesort;
import java.util.Arrays;
public class prak1 {
    public static void main(String[] args) {      
        int[] data = new int[]{20,3,6,1,4,5,9,2,6,10};
        System.out.print("Data pada array: "+Arrays.toString(data));
        System.out.println("\n\nSORT ASCENDING : ");
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nIterasi Ascending ke-"+(i+1));
            for (int j = 0; j < data.length-1-i; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
                System.out.println(Arrays.toString(data));
            }
        }
        System.out.println("\nHASIL ASCENDING : "+Arrays.toString(data));
        System.out.println("\n\nSORT DESCENDING : ");
        for (int i = 0; i < data.length; i++) {
            System.out.println("\nIterasi Descending ke-"+(i+1));
            for (int j = 0; j < data.length-1-i; j++) {
                if (data[j] < data[j+1]) {
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
                System.out.println(Arrays.toString(data));
            }
        }
        System.out.println("\nHASIL DESCENDING : "+Arrays.toString(data));
    }
}