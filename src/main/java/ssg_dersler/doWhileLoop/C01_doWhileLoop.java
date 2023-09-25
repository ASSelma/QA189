package ssg_dersler.doWhileLoop;

public class C01_doWhileLoop {

    public static void main(String[] args) {

        //5 ile 10 arasındaki (5 ve 10 dahil sayıları aynı satırda yazdırın)

        int a = 5;

        while(a<=10){
            System.out.print(a+" ");
            a++;
        }

        System.out.println(a);

        System.out.println("\n****************");

        a=5;

        do{

            System.out.print(a+" ");
            a++;
        }while (a<=10);

        System.out.println(a);




    }




}
