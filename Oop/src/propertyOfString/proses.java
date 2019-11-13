package propertyOfString;
public class proses {
    String kata;
    proses(String kt){
        kata = kt;
    }
    public void print(String p){
        System.out.println(p);
    }
    public void balik(){
        print("--------------------------------");
        print("sebelum dibalik\t: "+kata);
        String end = "";
        for (int i = kata.length() -1;  i >= 0; i--) {
            end = end + kata.charAt(i);
        }
        System.out.println("kalimat dibalik\t: "+end);
        print("--------------------------------");
    }
    public void vokal(){
        print("--------------------------------");
        int vokal = 0;
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) == 'a' || kata.charAt(i) == 'i' || kata.charAt(i) == 'u' || kata.charAt(i) == 'e'
                || kata.charAt(i)=='o') {
                vokal++;
            }
        }
        System.out.println("huruf vokal\t: "+vokal);
    }
    public void konsonan(){
        int konsonan = 0;
        for (int i = 0; i < kata.length(); i++){
            if (kata.charAt(i) == 'b' || kata.charAt(i) == 'c' || kata.charAt(i) == 'd' || kata.charAt(i) == 'f'
                || kata.charAt(i) == 'g' || kata.charAt(i) == 'h' || kata.charAt(i) == 'j' || kata.charAt(i) == 'k'
                || kata.charAt(i) == 'l' || kata.charAt(i) == 'm' || kata.charAt(i) == 'n' || kata.charAt(i) == 'p'
                || kata.charAt(i) == 'q' || kata.charAt(i) == 'r' || kata.charAt(i) == 's' || kata.charAt(i) == 't'
                || kata.charAt(i) == 'v' || kata.charAt(i) == 'w' || kata.charAt(i) == 'x' || kata.charAt(i) == 'y'
                || kata.charAt(i) == 'z'){
            konsonan++;
            }
        }
        System.out.println("huruf konsonan\t: "+konsonan);
        print("--------------------------------");
    }
    public void upper(){
        print("--------------------------------");
        System.out.print("Upper Case\t: "+kata.toUpperCase());
        print("");
    }
    public void lower(){
        System.out.print("Lower Case\t: "+kata.toLowerCase());
        print("");
    }
    public void striped(){   
        for (int i = 0; i < kata.length(); i++) {
            if (i%2 == 0) {
                System.out.print(kata.toUpperCase().charAt(i)); 
            } else {
                System.out.print(kata.toLowerCase().charAt(i));
            }
        }
    }
    public void printstrip(){
        System.out.print("Striped\t\t: ");
        striped();
        System.out.println("\n--------------------------------");
    }
}