package tugas.tugas1;
public class ujiBus {
    public static void main(String[] args) {
        bus ujiBus = new bus(40);
        ujiBus.getPassword(19); 
        ujiBus.addPenumpang(5);
        ujiBus.cetak();
        ujiBus.addPenumpang(6);
        ujiBus.cetak();
        ujiBus.addPenumpang(2);
        ujiBus.cetak();
    }
}