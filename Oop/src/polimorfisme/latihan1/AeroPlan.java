package polimorfisme.latihan1;
public class AeroPlan extends vehicle {
    @Override
    public void walk(){
        System.out.println("Aeroplan is flying");
    }
    @Override
    public void fuels(){
        System.out.println("Fuels");
    }
}