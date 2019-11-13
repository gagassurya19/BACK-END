package latihan4;
public class ujiBus {
    public static void main(String[] args) {
        bus ujiBus = new bus(40);
        ujiBus.getPenumpang(24); 
        ujiBus.addPenumpang(5);
        ujiBus.cetak();
        ujiBus.addPenumpang(6);
        ujiBus.cetak();
        ujiBus.addPenumpang(2);
        ujiBus.cetak();
    }
}