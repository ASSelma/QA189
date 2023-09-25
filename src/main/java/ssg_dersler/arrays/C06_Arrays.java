package ssg_dersler.arrays;

public class C06_Arrays {
    public static void main(String[] args) {


        // Verilen String bir Array'de en uzun ve en kısa Stringleri yazdıran bir metod oluşturun


        String isimler[]={"Fatma","Selma","Çiğdem","Ayten","Rümeysa"};

        enUzunVeEnKısa(isimler);
    }

    private static void enUzunVeEnKısa(String[] isimler) {

        String max = isimler[0];
        String min = isimler[0];

        for (String w: isimler) {

            if(max.length()<w.length()){

                max=w;
            }

            if(min.length()>w.length()){

                min=w;

            }

        }

        System.out.println("en kısa String : "+min);
        System.out.println("en uzun String : "+max);


    }
}
