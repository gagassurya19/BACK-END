package bangun;
public class tabung {
    double r, t;
    tabung(double jarijari, double tinggi){
        r = jarijari;
        t = tinggi;
    }

    tabung(int i) {
    }
    public double volume(){
        return Math.PI*(r*r)*t;
    }
    public double luasPermukaan(){
        return (2*Math.PI*(r*r))+(2*Math.PI*r*t)+(2*Math.PI*r*(r+t));
    }
}
