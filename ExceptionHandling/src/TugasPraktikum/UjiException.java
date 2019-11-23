package TugasPraktikum;
//Github.com/Gagassurya19
public class UjiException {
    //membuat method -> method
    public static void method() throws ExceptionSaya {
        //membuat Exception
        throw new ExceptionSaya("Test Exception");
    }
    
    //main method
    public static void main(String[] args) {
        //blok yang memungkinkan Exception
        try {
            method();
        } 
        //blok yang dijalankan JIKA terjadi Exception
        //catch dengan parameter ExceptionSaya
        catch (ExceptionSaya e) {
            System.out.println("Terjadi Exception : "+e);
        }
        
        //blok yang dijalankan JIKA terjadi Exception
        catch (Exception e){
            System.out.println("Seeep : "+e);
        }
    }
}
