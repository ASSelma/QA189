package day22map_exception;

public class E02 {
    public static void main(String[] args) {

        String s = "1234a";
        convertStringToInt(s);

    }

    public static void convertStringToInt(String s){
        try {
            int intS = Integer.valueOf(s);
            System.out.println(intS+1);
        }catch (NumberFormatException e){
            System.out.println("Bir stringin sayıya dönüştürülebilmesi için rakam dışı character içermemesi gerekir.");
            System.out.println(e.getMessage());

        }

    }
}
