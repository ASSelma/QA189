package ssg_dersler.ınheritance;

public class Runner {

    public static void main(String[] args) {

        C03_Isci isci = new C03_Isci("Ali","Can","5555555555","Istanbul",12,100,6);
        System.out.println(isci);


        isci.fazlaMesai=5;
        isci.ucret=isci.fazlaMesaiParasiHesapla();
        System.out.println(isci.maas+isci.ucret);

        C03_Isci isci1 = new C03_Isci();
        isci1.id=isci1.idAtama();
        System.out.println(isci1);


    }





}
