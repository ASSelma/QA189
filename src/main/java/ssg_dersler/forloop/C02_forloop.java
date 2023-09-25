package ssg_dersler.forloop;

public class C02_forloop {

    public static void main(String[] args) {

        // Soru2 : 10 ile 30 arasındaki (10 ve 30 dahil) sayıları aralarında virgül olarak aynı satırda yazdırın.



        int bas = 10;
        int bitis = 30;

        for (int i  = bas; i <=bitis ; i++) {

            if (i<bitis){

                System.out.print(i+", ");


            }else System.out.println(i);

        }


    }


}
