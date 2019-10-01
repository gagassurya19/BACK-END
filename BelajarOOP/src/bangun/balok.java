package bangun;
public class balok {
    double panjang, lebar, tinggi;
    balok(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    balok() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double volume(){
        return panjang*lebar*tinggi;
    }
    public double luasPermukaan(){
        return (2*panjang*lebar)+(2*panjang*tinggi)+(2*tinggi*lebar);
    }
    
}
