package konversi;
public class hexadesimal {
    String konversi;
        hexadesimal(String h){
            konversi = h;
        }
    hexadesimal(){}
    //hexadesimal -> des,oktal,biner
    public int hexades(){
        int hexa = Integer.parseInt(konversi, 16);
        String binary = Integer.toBinaryString(hexa);
        int desimal = Integer.parseInt(binary, 2);
        return desimal;
    }
    public String hexaokt(){
        int hexa = Integer.parseInt(konversi, 16);
        String binary = Integer.toBinaryString(hexa);
        int biner = Integer.parseInt(binary, 2);
        String oktal = Integer.toOctalString(biner);
        return oktal;
    }
    public String hexabin(){
        int hexa = Integer.parseInt(konversi, 16);
        String binary = Integer.toBinaryString(hexa);
        return binary;
    }
}