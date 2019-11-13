package bangun;
public class limasSegiEmpat {
    double p,l,t;
    limasSegiEmpat(double panjang, double lebar, double tinggi){
        p = panjang;
        l = lebar;
        t = tinggi;
    }

    limasSegiEmpat(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double volume(){
        return (p*l*t)/3;
    }
    public double luasPermukaan(){
        return (p*l)+((2*p*t)/2)+((2*l*t)/2);
    }
}
