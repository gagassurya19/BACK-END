package latihan; //Latihan 5.2 [Keywords Throws]
//Github.com/Gagassurya19
public class Throws2 {
    public static void uji(int angka)throws NullPointerException,ArithmeticException{
        if (angka < 0) {
            throw new NullPointerException("Kesalahan : null pointer Exception");
        }else {
            throw new ArithmeticException("Kesalahan : Arithmetic Exception");
        }
    }
    public static void main(String[] args) {
        try {
            uji(-12);
        } catch (Exception e) {
            System.out.println("Exception ditangkap disini");
            System.out.println(e.getMessage());
        }
        System.out.println("Statement setelah blok try-catch");
    }
}
