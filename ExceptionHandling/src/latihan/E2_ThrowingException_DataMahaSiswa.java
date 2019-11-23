package latihan; //latihan 5.1
//Github.com/Gagassurya19
public class E2_ThrowingException_DataMahaSiswa { 
        //Deklarasi variable
        private String nim;
        private String nama;
        private double nilai;

        //Method untuk mendapat nilai NIM dari var private
        public String getNim() {
            return nim;
        }
        
        //method Mengubah nilai NIM
        public void setNim(String nim) {
            //Blok kode kemungkinan terjadi Error
            try {
                this.nim = nim;
                if (nim == null) { // -> decision jika nim samaDengan null/Kosong
                    throw new NullPointerException(); //Memanggil cathc dibawah
                }
                //Blok yang dijalankan JIKA error
            } catch (NullPointerException e) {
                System.out.println("Kesalahan : NIM tidak boleh Kosong/Null");
            }
        }
        
        public String getNama() {
            return nama;
        }

        public void setNama(String nama) {
            try {
            this.nama = nama;
                if (nama == null) {
                    throw new NullPointerException();
                }
            } catch (NullPointerException e) {
                System.out.println("Kesalahan : Nama Tidak Boleh Kosong/Null");
            }   
        }

        public Double getNilai() {
            return nilai;
        }

        public void setNilai(int nilai) {
            this.nilai = nilai;
        }
}