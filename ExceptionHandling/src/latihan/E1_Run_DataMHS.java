package latihan; //latihan 5.1
//Github.com/Gagassurya19
public class E1_Run_DataMHS {
   public static void main(String[] args) {
            //Membuat Objek
            E2_ThrowingException_DataMahaSiswa obj = new E2_ThrowingException_DataMahaSiswa();
            
            //Set nilai var
            obj.setNim("10010234045650");
            obj.setNama("Gagas");
            obj.setNilai(85);
            
            //Output
            System.out.println("NIM : "+obj.getNim());
            System.out.println("Nama : "+obj.getNama());
            System.out.println("Nilai : "+obj.getNilai());
        } 
}
