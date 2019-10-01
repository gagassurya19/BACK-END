package bangun;
public class bangunRuang {
    public static void main(String[] args) {
        balok balook = new balok(3,4,5);
        System.out.println("Volume = "+balook.volume());
        System.out.println("Luas Permukaan = "+balook.luasPermukaan());
        
        System.out.println("");
        
        kubus kubuus = new kubus(5);
        System.out.println("Volume = "+kubuus.volume());
        System.out.println("Luas Permukaan = "+kubuus.luasPermukaan());
        
        System.out.println("");
        
        kerucut kerucuut = new kerucut(7,8);
        System.out.println("Volume = "+kerucuut.volume());
        System.out.println("Luas Permukaan = "+kerucuut.luasPermukaan());
        
        System.out.println("");
        
        bola bolaa = new bola(7);
        System.out.println("Volume = "+bolaa.volume());
        System.out.println("Luas Permukaan = "+bolaa.luasPermukaan());
        
        System.out.println("");
        
        tabung tabuung = new tabung(8);
        System.out.println("Volume = "+tabuung.volume());
        System.out.println("Luas Permukaan = "+tabuung.luasPermukaan());
        
        System.out.println("");
        
        limasSegiEmpat LSE = new limasSegiEmpat(9,5,7);
        System.out.println("Volume = "+LSE.volume());
        System.out.println("Luas Permukaan = "+LSE.luasPermukaan());
        
        System.out.println("");
        
        prismaSegitiga PS = new prismaSegitiga(5,7,9);
        System.out.println("Volume = "+PS.volume());
        System.out.println("Luas Permukaan = "+PS.luasPermukaan());
    }
}
