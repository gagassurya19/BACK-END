package polimorfisme.latihan2;
public class run {
    public static void main(String[] args) {
        line satu = new line(1,2,3,4);
        line dua = new line(4,3,7,1);
        System.out.println("isGreater : "+satu.isGreater(satu, dua));
        System.out.println("isLess : "+satu.isLess(satu, dua));
        System.out.println("isEquals : "+satu.isEquals(satu, dua));
    }
}