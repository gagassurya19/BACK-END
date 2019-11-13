package uts3pembahasan;
public class siswa {
    String nama;
    double nilai_tugas, nilai_us, nilai_uh;
    double nilai_akhir(){
        return (0.3*nilai_tugas) + (0.3*nilai_us) + (0.4*nilai_uh);
    }
    public void detail(){
        System.out.println("--------------Detail Siswa---------------");
        System.out.println("Nama : "+nama);
        System.out.println("Nilai Tugas : "+nilai_tugas);
        System.out.println("Nilai UH : "+nilai_uh);
        System.out.println("Nilai US : "+nilai_us);
        System.out.println("Nilai Akhir : "+nilai_akhir());
        System.out.println("-----------------------------------------");
    }
}
