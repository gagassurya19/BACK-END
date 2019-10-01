package bangun;
public class kubus {
    double sisi;
    kubus(double s){
        sisi = s;
    }
    public double volume(){
        return sisi*sisi*sisi;
    }
    public double luasPermukaan(){
        return (sisi*sisi)*6;
    }
}
