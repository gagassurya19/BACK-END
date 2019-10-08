package tugas.tugas1;
public class bus {
    public double penumpang;
    public double maxPenumpang;
    public double password = 19;
    public  bus(double maxpenumpang){
        this.maxPenumpang = maxpenumpang;
        penumpang = 0;
    }
    //mutator
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota!");
        } else{
            this.penumpang = temp;
        }
    }
    public void getPassword(double password){
        if (password == this.password) {
            System.out.println("Password Berhasil!");
        } else{
            System.out.println("Password Salah!");
        }
    }
    public void addAverage(){
        
    }
    public void cetak(){       
        System.out.println("Penumpang bus sekarang : "+penumpang);
        System.out.println("Penumpang bus maximal : "+maxPenumpang);
    }
}