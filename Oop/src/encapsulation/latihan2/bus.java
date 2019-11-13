package latihan2;
public class bus {
    private int penumpang;
    private int maxPenumpang;
    
    //konstruktor class bus
    bus(){}
    public bus(int maxPenumpang){
        this.maxPenumpang = maxPenumpang;
        penumpang = 0;
    }
    
    //method mutator penambah penumpang
    public void setPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (penumpang >= maxPenumpang) {
            System.out.println("Penumpang melebih kuota!");
        } else {
            this.penumpang = temp;
        }
    }
    public void cetak(){
        System.out.println("penumpang bus sekarang : "+penumpang);
        System.out.println("Penumpang bus maxsimal : "+maxPenumpang);
    }
}
