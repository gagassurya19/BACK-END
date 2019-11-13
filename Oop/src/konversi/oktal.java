package konversi;
public class oktal {
    String konversi;
        oktal(String o){
            konversi = o;
        }
    oktal(){}
    //oktal -> des,hexa,biner
    public int oktaldes(){
        int desimal = Integer.parseInt(konversi, 8);
        return desimal;
    }
    public int oktalhex(){
        int hexa = Integer.parseInt(konversi, 16);
        return hexa;
    }
    public String oktalbin(){
        int desimal = Integer.parseInt(konversi, 8);
        String biner = Integer.toBinaryString(desimal);
        return biner;
    }
}