package konversi;
public class biner {
    String konversi;
        biner(String h){
            konversi = h;
        }
    biner(){}
    //hexadesimal -> des,oktal,biner
    public int bindes(){
        int desimal = Integer.parseInt(konversi, 2);
        return desimal;
    }
    public String binokt(){
        int biner = Integer.parseInt(konversi, 2);
        String oktal = Integer.toOctalString(biner);
        return oktal;
    }
    public String binhexa(){
        int biner = Integer.parseInt(konversi, 2);
        String hexa = Integer.toHexString(biner);
        return hexa;
    }
}