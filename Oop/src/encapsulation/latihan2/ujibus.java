package latihan2;
public class ujibus {
    public static void main(String[] args) {
        bus ujibus = new bus(40); //maximal
        //menambah nilai penumpang bus
        ujibus.setPenumpang(5);
        ujibus.cetak();
        ujibus.setPenumpang(15);
        ujibus.cetak();
        ujibus.setPenumpang(50);
        ujibus.cetak();
    }
}