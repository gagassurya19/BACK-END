package bangun;
public class kerucut {
    double radius, tinggi;
    kerucut(double r, double t){
        radius = r;
        tinggi = t;
    }
    public double volume(){
        return (Math.PI*(radius*radius)*tinggi)/3;
    }
    public double luasPermukaan(){
        double selimut = 2*Math.PI*radius;
        return Math.PI*(radius*radius)+Math.PI*(radius*selimut);
    }
}
