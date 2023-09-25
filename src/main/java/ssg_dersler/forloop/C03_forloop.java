package ssg_dersler.forloop;

public class C03_forloop {

    public static void main(String[] args) {
        
        
        
        // 0'dan 100 e kadar 100 dahil tek ve çift sayıları iki ayrı döngü ile yazdırın.

        for (int i = 0; i <=100; i++) {

            if(i%2==0){
                System.out.print(i+" ");
            }
            
        }

        System.out.println("\n.........................");

        for (int i = 0; i <=100; i++) {

            if(i%2!=0){
                System.out.print(i+" ");
            }

        }

    }
}
