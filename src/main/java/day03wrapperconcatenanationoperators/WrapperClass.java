package day03wrapperconcatenanationoperators;

public class WrapperClass {

    public static void main(String[] args) {


        // java, primitive data typelaruna bazı faydalı metodlar ekleyerek yeni bir veri yapısı oluşturmuştur.
        // Bu yeni yapı "Wrapper Class" olarak adlandırılır.

        //primitive: char - boolean - byte - short - int - long - float- double
        //Wrapper Class : Character -Boolean -Byte- Short - Integer - Long - Float - Double

        int n = 12;

        Integer m = 12;

        // Örnek primitive int i wrapper Integer a ceviriniz (==>Autoxing)

        int num = 13;
        Integer wrapperNum= num;

        // Ornek Wrapper Byte i primitive byte a çeviriniz (==Unboxing)

        Byte k = 13;

        byte primitiveK = k;



    }
}
