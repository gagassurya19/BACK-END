package latihan; //latihan2
//Github.com/Gagassurya19
public class DenganExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println(5/0);
            System.out.println("Keluaran Program");
        } catch (ArithmeticException e) {
            //dibagi dengan 0 -> ArithmeticException
            System.out.println("Exception yang ditangkap : "+e);
        }
        System.out.println("Setelah Exception..");
    }
}
