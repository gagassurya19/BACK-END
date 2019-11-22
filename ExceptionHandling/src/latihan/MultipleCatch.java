package latihan; //latihan3
//Github.com/Gagassurya19
public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int a = 3/0; /*
                          *Berpotensi menimbulkan kesalahan 
                          *yaitu pembagian dengan bilangan 0
                         */
            int num = Integer.parseInt(args[0]); // Input data Array
            String Kota = "Tulungagung"; //penambahan args kota
            
            System.out.println(a+Kota+num); //deklarasi
            System.out.println("Perintah selanjutnya...");
            
        /*
            ArrayIndexOutOfBoundsException : Menampilkan exception 
            ketika data array tidak ditemukan.
        */
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Exception : "+e);
            
        /*
            NullPointerException : Menampilkan Exception jika data bervariable
            null atau "Kosong".
        */
        } catch (NullPointerException e) {
            System.out.println("Null Pointer : "+e);    
        }
        
        /*
        catch (Exception e) tidak harus diletakkan diakhir kode, karena saat
        menggunakan Catch (Throwable e) bersamaan dengan catch (Exception e),
        catch (Throwable e) yang harus berada diakhir kode.
        
        catch (Throwable e) -> Berfungsi Menangkap segala jenis Exception.
        */
        catch (Exception e) {
            System.out.println("Exception : "+e);
        }
    }
}
