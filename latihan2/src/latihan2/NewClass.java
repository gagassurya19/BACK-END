package latihan2;
import java.util.Scanner;
 
import java.text.DecimalFormat;
 
public class NewClass {
 
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        DecimalFormat koma = new DecimalFormat("#.##");
        float tinggi, berat, IMT, O;
        System.out.println("SEPTIAN MAULANA");
        System.out.println("1141177004039");
        System.out.print("Masukan Tinggi Badan Anda (M) = ");
        tinggi = masukan.nextFloat();
        String X = koma.format(tinggi).replace(',','.');
        float Z = Float.parseFloat(X);
        System.out.print("Masukan Berat Badan Anda (Kg) = ");
        berat = masukan.nextFloat();
        O = (float) (Z*Z);
        IMT = (float) (berat/O);
        System.out.println();
        System.out.println("Berat Badan Anda Sesuai IMT = "+ IMT);
        System.out.println();
        if(IMT > 30)
        System.out.println("Berat Badan Anda = Kegemukan (Obesitas) ");    
        else if(IMT > 25)
        System.out.println("Berat Badan Anda = Gemuk");      
        else if(IMT > 18.5)
        System.out.println("Berat Badan Anda = Normal");     
        else
        System.out.println("Berat Badan Anda = Kurus");
        
        System.out.println();
        System.out.println("***Tian~Chan***");
    }
}
