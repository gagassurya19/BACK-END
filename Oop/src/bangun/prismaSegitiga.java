package bangun;
public class prismaSegitiga {
    double a,tp,t;
    prismaSegitiga(double alas, double tinggiPrisma, double tinggi){
        a = alas;
        tp = tinggiPrisma;
        t = tinggi;
    }

    prismaSegitiga(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public double volume(){
        return (a*t/2)*tp;
    }
    public double luasPermukaan(){
        double kelilingAlas = (a*a)+(t*t);
        return 2*((a*t)/2)+(kelilingAlas*tp);
    }
}
