package array;
/**
 *
 * @author miamia
 *
 */
public class pakZakariaNgulang {
    public static void main(String[] args) {
        //program untuk mencari nilai terbesar dari
        // element array
        /*
        Algorithma:
        1. menentukan isi array
        2. membuat variable "max" untuk menyimpan nilai terbesar
        3. Scanning setaip element array
        4. mengecek satu persatu nilai array,
            jika nilai array lebih besar dari max,
            maka nilai array diisi dengan nilai array tsb.
        5. ditampilkan nilai maxa (Nilai terbesar)
        */
        
        int[] data = new int[]{9,7,51,93,103};
        
        int max = 0;
        int min = data[0];
        
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i]+" ");
            if (data[i] > max){
                max = data[i];
            } if (data[i] < min){
                min = data[i];
            }
        } System.out.println("\n"+max+" > "+min);
    }
}