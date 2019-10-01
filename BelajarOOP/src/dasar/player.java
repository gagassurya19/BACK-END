package dasar;
public class player {
    //DEFINISI ATRIBUT/VARIABLE
    String nama;
    int kecepatan, titikKesehatan;
    //DEFINISI BEHAVIOR/METHOD RUN
    void run(){
        System.out.println(nama+" sedang berjalan.....");
        System.out.println("Kecepatan : "+kecepatan);
    }
    //DEFINISI METHOD ISDEAD UNTUK MENGECEK NILAI KESEHATAN / HP
    boolean isDead(){
        if (titikKesehatan <= 0) return true; 
        return false;
    }
}