package latihan3;
public class encapSiswa {
    private String name;
    private String address;
    private int absen;
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public int getAbsen(){
        return absen;
    }
    public void setName(String newName){
        name = newName;
    }
    public void setAddress(String newAddress){
        address = newAddress;
    }
    public void setAbsen(int newAbsen){
        absen = newAbsen;
    }
    public void print(){
        System.out.println("nama\t: "+getName()+"\nAbsen\t: "+getAbsen()+"\nAlamat\t: "+getAddress());
    }
}
