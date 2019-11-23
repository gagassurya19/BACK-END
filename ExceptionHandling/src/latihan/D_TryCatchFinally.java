package latihan; //latihan4
//Github.com/Gagassurya19
public class D_TryCatchFinally {
    public static void main(String[] args) {
        int nol=0;
        int angka=10;
        try {
            int hasil = angka/nol;
            System.out.println("Hasil : "+hasil);
        } 
        catch (ArithmeticException e) {
            System.out.println("Terjadi Pembagian Nol || "+e);
        }
        
        /*
        Finally digunakan untuk menampilkan suatu data ketika try-catch berhasil
        maupun error.
        */
        finally {
            System.out.println("Kalimat dalam Finally");
        }
        System.out.println("Kalimat luar Finally");
    }
}