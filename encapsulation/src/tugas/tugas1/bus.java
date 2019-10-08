package tugas.tugas1;
public class bus {
    public double penumpang;
    public double maxPenumpang;
    public int password = 19;
    public double counter;
    public double penumpangBaru;
    public  bus(double maxpenumpang){
        this.maxPenumpang = maxpenumpang;
        penumpang = 0;
    }
    public void addPenumpang(double penumpang){
        double temp;
        temp = this.penumpang+penumpang;
        if (temp > maxPenumpang) {
            System.out.println("Penumpang melebihi kuota!");
        } else{
            this.penumpang = temp;
            counter++;
        }
    }
    public void getPenumpang(int password){
        if (password == this.password) {
            System.out.println("Password Berhasil!");
        } else{
            System.out.println("Password Salah!");
        }
    }
    public double setPassword(){
        return password;
    }
    public double getAverage(){
        return penumpang/counter;
    }
    public void cetak(){       
        System.out.println("Penumpang bus sekarang : "+penumpang);
        System.out.println("Penumpang bus maximal : "+maxPenumpang);
    }
}