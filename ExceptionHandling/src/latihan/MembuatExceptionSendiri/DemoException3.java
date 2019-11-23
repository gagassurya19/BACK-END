package latihan.MembuatExceptionSendiri; //latihan6
//Github.com/Gagassurya19

//Membuat Eksepsi Sendiri
public class DemoException3 {
    //method hitungFaktorial dengan parameter n
    public static int hitungFaktorial(int n) throws NegativeNumberException{
        /*
        Decision, Jika n KurangDari 0 makas eksepsi dilempar pada
        NegativeNumberException
        */
        if (n < 0) {
            throw new NegativeNumberException("Bilangan Tidak Boleh negative");
        }
        int hasil = 1;
        for (int i = n; i>=1; i--) {
        hasil *= i;
        }
        return hasil;
    }
    
    //Method main
    public static void main(String[] args) {
        System.out.println("Pada saat menghitung 5!");
        //blok yang memungkinkan untuk eksepsi
        try {
            System.out.println("Hasil = "+hitungFaktorial(5));
        } 
        
        //blok yang dijalankan ketika terjadi eksepsi
        catch (NegativeNumberException e) {
            System.out.println("Bilangan : "+e.getBilangan());
            //e.printStackTrace();
        }
        System.out.println("\nPada saat menghitung -5!");
        try {
            System.out.println("Hasil = "+hitungFaktorial(-5));
        } catch (NegativeNumberException e) {
            System.out.println("Bilangan : "+e.getBilangan());
            e.printStackTrace();
        }
    }
}
