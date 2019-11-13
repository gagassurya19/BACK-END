package polimorfisme.latihan1;
public class run {
    public static void main(String[] args) {
        vehicle garuda = new AeroPlan();
        garuda.function();
        garuda.fuels();
        garuda.walk();
        System.out.println("========================");
        vehicle mobil = new Car();
        mobil.function();
        mobil.fuels();
        mobil.walk();
        System.out.println("========================");
        vehicle HB = new HoverBoard();
        HB.function();
        HB.fuels();
        HB.walk();
    }
}