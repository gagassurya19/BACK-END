package latihan4;
public class bus {
    public int penumpang;
    public int maxPenumpang;
    public  bus(int maxpenumpang){
        this.maxPenumpang = maxpenumpang;
        penumpang = 0;
    }
    //mutator
    public void addPenumpang(int penumpang){
        int temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota!");
        } else{
            this.penumpang = temp;
        }
    }
    public void getPenumpang(int password){
        if (password == 25) {
            System.out.println("Password Berhasil!");
        } else{
            System.out.println("Password Salah!");
        }
    }
    public void cetak(){       
        System.out.println("Penumpang bus sekarang : "+penumpang);
        System.out.println("Penumpang bus maximal : "+maxPenumpang);
    }
}