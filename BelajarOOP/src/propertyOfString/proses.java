package propertyOfString;
public class proses {
    String kata;
    proses(String kt){
        kata = kt;
    }
    public String balik(){
        System.out.println("sebelum dibalik: "+kata);
        int length = kata.length();
        String end = "";
        for (int i = length -1;  i >= 0; i--) {
            end = end + kata.charAt(i);
        }
        return end;
    }
    public int vokal(){
        int jumvokal = 0;
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i)=='a' || kata.charAt(i)=='i' || kata.charAt(i)=='u' || kata.charAt(i)=='e' || kata.charAt(i)=='o') {
                jumvokal++;
            }
        }
        return jumvokal;
    }
    public int konsonan(){
        int jumkons = 0;
        for (int i = 0; i < kata.length(); i++) {
            if (kata.charAt(i) == 'b' || kata.charAt(i)  == 'c' || kata.charAt(i)  == 'd' || kata.charAt(i)  == 'f'
                    || kata.charAt(i) == 'g' || kata.charAt(i) == 'h' || kata.charAt(i) == 'j' || kata.charAt(i) == 'k' || kata.charAt(i)  == 'l'
                    || kata.charAt(i) == 'm' || kata.charAt(i) == 'n' || kata.charAt(i)  == 'p' || kata.charAt(i)  == 'q'
                    || kata.charAt(i)  == 'r' || kata.charAt(i)  == 's' || kata.charAt(i)  == 't' || kata.charAt(i)  == 'v' || kata.charAt(i)  == 'w'
                    || kata.charAt(i)  == 'x' || kata.charAt(i)  == 'y' || kata.charAt(i)  == 'z') {
                jumkons++;
            }
        }
        return jumkons;
    }
    public String upper(){
        String end = "";
        for (int i = 0; i < kata.length(); i++) {
            end = kata.toUpperCase();
        }
        return end;
    }
    public String lower(){
        String end = "";
        for (int i = 0; i < kata.length(); i++) {
            end = kata.toLowerCase();
        }
        return end;
    }
    public String striped(){
        String length = kata;
        for (int i = 0; i < length.length(); i++) {
            if (i/2 == 0) {
                System.out.println(kata.toUpperCase());
            } else {
                System.out.println(kata.toLowerCase());
            }
        }
        return length;
    }
}