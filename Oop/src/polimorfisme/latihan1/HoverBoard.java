package polimorfisme.latihan1;
public class HoverBoard extends vehicle{
    @Override
    public void function(){
        System.out.println("HoverBoard isn't public transportation");
    }
    @Override
    public void walk(){
        System.out.println("HoverBoard is Moving");
    }
    @Override
    public void fuels(){
        System.out.println("HoverBoard is electricity transportation");
    }
}
