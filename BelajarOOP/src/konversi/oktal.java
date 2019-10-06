package konversi;
public class oktal {
    String konversio;
        oktal(String o){
            konversio = o;
        }
    oktal(){}
    //oktal -> des,hexa,biner
    public int oktaldes(){
        int desimal = Integer.parseInt(konversio, 8);
        return desimal;
    }
    public int oktalhex(){
        int hexa = Integer.parseInt(konversio, 16);
        return hexa;
    }
    public int oktalbin(){
        //int desimal = Integer.parseInt(konversio, 8);
        //String x = String.valueOf(desimal);
        int biner = Integer.parseUnsignedInt(konversio, 2);
        return biner;
    }
}