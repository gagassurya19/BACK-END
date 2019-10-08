package tugas.tugas2;
public class bola {
    private double jarijari;
    public bola(double jarijari){
        this.jarijari = jarijari;
    }
    public void setJarijari(double jarijari){
        this.jarijari = jarijari;
    }
    public double showDiameter(){
        double diameter = 2*jarijari;
        return diameter;
    }
    public double showLuasPermukaan(){
        double lp = 4*Math.PI*(jarijari*jarijari);
        return lp;
    }
    public double showVolume(){
        double volume = (Math.PI*(jarijari*jarijari*jarijari)*4)/3;
        return volume;
    }
    public void print(){
        System.out.println("------------------------------");
        System.out.println("Diameter dari jari-jari "+jarijari+" adalah : "+showDiameter());
        System.out.println("------------------------------");
        System.out.println("Luas Permukaan dari jari-jari "+jarijari+" adalah : "+showLuasPermukaan());
        System.out.println("------------------------------");
        System.out.println("Volume dari jari-jari "+jarijari+" adalah : "+showVolume());
        System.out.println("------------------------------");
    }
}