package polimorfisme.latihan1;
public class Car extends vehicle {
    @Override
    public void walk(){
        System.out.println("Car is moving");
    }
    @Override
    public void fuels(){
        System.out.println("Empty");
    }
}
