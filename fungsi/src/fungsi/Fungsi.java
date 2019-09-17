package fungsi;

public class Fungsi {

    static void ucapSalam(){
        System.out.println("Assalammualaikum");
    }
    
    static void ucapin(String ucapan){
        System.out.println(ucapan);
    }
    
    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    } 
    public static void main(String[] args) {
        ucapSalam();
        
        ucapin("haloo");
        ucapin("Assalammualaikum");
        ucapin("Woi mamank");
        
        ucapin("luas persegi dengan panjang sisi 5 adalah "+luasPersegi(5));
        
        //bangun ruang
        int s = 12;
        int luas = luasKubus(s);
        
        System.out.println(luas);
        }
        static int luasPersegii(int sisii){
        return sisii * sisii;
        }
        static int luasKubus(int sisii){
        return 6 * luasPersegii(sisii);
        
        }
}