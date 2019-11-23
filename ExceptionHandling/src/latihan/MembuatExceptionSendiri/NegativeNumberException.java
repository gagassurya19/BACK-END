package latihan.MembuatExceptionSendiri; //latihan6
//Github.com/Gagassurya19
public class NegativeNumberException extends Exception{
    //Deklarasi var
    private int bilangan;
    
    //constructor
    public NegativeNumberException() {
    }
    
    //constructor parameter String
    public NegativeNumberException(String pesan) {
        super(pesan);
    }
    
    //constructor parameter String dan int
    public NegativeNumberException(String pesan, int nilai){
        super(pesan);
        this.bilangan = nilai;
    }
    
    //Method untuk mendapat nilai Bilangan
    public int getBilangan(){
        return bilangan;
    }
    
}
