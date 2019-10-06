package konversi;
import  java.util.Scanner;
public class main {
    public static void print(String p){
        System.out.println(p);
    }
    public static void main(String[] args) {
        String balik = "y";
        while(balik.equals("y")){
        Scanner input = new Scanner(System.in);
        
        print("-------------------------------");
        print("Pilih menu yang diinginkan : ");
        print("1. desimal\n2. Oktal\n3. Hexa\n4. Biner");
        System.out.print("Pilih : ");
        int pilih = input.nextInt();
        switch(pilih){
            case 1 :{
                desimal proses = new desimal();
                print("masukkan angka desimal : ");
                proses.konversi = input.nextInt();
                print("Angka desimal -> Biner : "+proses.desbinary());
                print("Angka desimal -> Hexa : "+proses.desoktal());
                print("Angka desimal -> Octal : "+proses.deshexa());
            } break;
            case 2 : {
                print("Masukkan angka oktal : ");
                oktal proses = new oktal();
                proses.konversi = input.nextLine();
                print("Ankga oktal -> desimal : "+proses.oktaldes());
                print("Ankga oktal -> hexa : "+proses.oktalhex());
                print("Ankga oktal -> biner : "+proses.oktalbin());
            } break;
        }
            System.out.println("Ingin mengulang ? (y/t)");
            balik = input.nextLine();
      }
    }
}
