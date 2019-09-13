package pengulangan;
import java.util.Scanner;

public class looping {
    public static void main(String[] args) {
        int batas;
        Scanner input = new Scanner(System.in);
        System.out.println("batas bilangan ");
        batas = input.nextInt();
        

        int a = 9;
        while(a<=batas){
            System.out.println(a);
            a+=9;
        } 

        
        /**
        
        for (int a = 9; a <= batas; a+=9){
            System.out.println(a);
        }
**/        

    }
}
