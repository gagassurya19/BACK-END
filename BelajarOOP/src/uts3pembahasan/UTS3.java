package uts3pembahasan;
import java.util.Scanner;
public class UTS3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //objek untuk class siswa
        siswa moklet = new siswa();
        System.out.println("Masukkan nama siswa : ");
        moklet.nama = input.next();
        System.out.println("Masukkan nilai Tugas : ");
        moklet.nilai_tugas = input.nextDouble();
        System.out.println("Masukkan nilai Ulangan Harian : ");
        moklet.nilai_uh = input.nextDouble();
        System.out.println("Masukkan nilai Ulangan Semester : ");
        moklet.nilai_us = input.nextDouble();
        moklet.detail();
    }
}