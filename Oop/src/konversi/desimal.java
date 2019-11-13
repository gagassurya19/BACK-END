package konversi;
public class desimal {
int konversi;
    desimal(int k){
    konversi = k;
}
desimal() {}
//desimal -> oktal,hexa,biner
public String desbinary(){
    String binary = Integer.toBinaryString(konversi);
    return binary;
}
public String deshexa(){
    String hexa = Integer.toHexString(konversi);
    return hexa;
}
public String desoktal(){
    String octal = Integer.toOctalString(konversi);
    return octal;
}
}
