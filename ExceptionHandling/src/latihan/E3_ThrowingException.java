package latihan; //latihan 5.1 [Melempar Exception]
//Github.com/Gagassurya19
public class E3_ThrowingException {
    public static void main(String[] args) {
        String Input = "Invalid Input";
        try {
            if (Input.equals("Invalid Input")) {
                throw new RuntimeException("Throw Demo"); //Pelemparan Exception
            }else{
                System.out.println(Input);
            }
            System.out.println("After Throwing.");
        } catch (RuntimeException e) {
            System.out.println("Exception ada disini.");
            System.out.println(e);
        }
    }
}