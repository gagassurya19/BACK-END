package latihan1;
public class ujiBus {
    public static void main(String[] args) {
        //objek bus
        bus ujibus = new bus();
        //menambah nilai penumpang bus
        ujibus.penumpang = 5;
        ujibus.maxpenumpang = 15;
        //print
        ujibus.cetak();
        //menambah penumpang
        ujibus.penumpang += 5;
        ujibus.cetak();
        //mengurangi penumpang
        ujibus.penumpang -= 2;
        ujibus.cetak();
        //menambah penumpang
        ujibus.penumpang += 8;
        ujibus.cetak();
    }    
}