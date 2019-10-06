package konversi;
public class oktal {
    String konversi;
    oktal(String o){
        konversi = o;
    }
    oktal(){}
    //oktal -> des,hexa,biner
    public Integer oktaldes(){
        int oktaldes = Integer.parseInt(konversi, 8);
        return oktaldes;
    }
    public Integer oktalhex(){
        int oktalhex = Integer.parseInt(konversi, 16);
        return oktalhex;
    }
    public Integer oktalbin(){
        int oktalbin = Integer.parseInt(konversi, 2);
        return oktalbin;
    }
}
