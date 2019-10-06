package konversi;
import  java.util.Scanner;
public class main {
    public static void print(String p){
        System.out.println(p);
    }
    public static void main(String[] args) {
        //Tombol kembali
        String balik="y";
        while (balik.equals("y"))
        {
        Scanner input = new Scanner(System.in);
        
        print("-------------------------------");
        print("Pilih menu yang diinginkan : ");
        print("1. desimal\n2. Oktal\n3. Hexa\n4. Biner");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1 :{
                desimal prosesdes = new desimal();
                print("masukkan angka desimal : ");
                prosesdes.konversi = input.nextInt();
                print("Angka desimal -> Biner : "+prosesdes.desbinary());
                print("Angka desimal -> Hexa : "+prosesdes.desoktal());
                print("Angka desimal -> Octal : "+prosesdes.deshexa());
            } break;
            case 2 : {
                oktal prosesokt = new oktal();
                print("Masukkan angka oktal : ");
                prosesokt.konversio = input.next();
                print("Ankga oktal -> desimal : "+prosesokt.oktaldes());
                print("Ankga oktal -> hexa : "+prosesokt.oktalhex());
                print("Ankga oktal -> biner : "+prosesokt.oktalbin());
            } break;
        }
        System.out.println("=====================");
            System.out.println("Ingin Mengulang ? (y/t)");
            balik = input.next();
        }
    }
}
