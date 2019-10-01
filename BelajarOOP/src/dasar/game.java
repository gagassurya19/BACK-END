package dasar;
public class game {
    public static void main(String[] args) {
        //membuat objek untuk class player
        player petani = new player(); //menghubungkan ke class player
        //mengisi data pada objek player
        petani.nama = "OEK";
        petani.kecepatan = 78;
        petani.titikKesehatan = 100;
        //memanggil/menjalankan method run
        petani.run();
        if (petani.isDead()) {
            System.out.println("GameOver!");
        }
    }
}