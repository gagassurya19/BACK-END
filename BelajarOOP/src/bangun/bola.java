package bangun;
public class bola {
    double r;
    bola(double radius){
        r = radius;
    }
    public double volume(){
        return (Math.PI*(r*r*r)*4)/3;
    }
    public double luasPermukaan(){
        return 4*Math.PI*(r*r);
    }
}
