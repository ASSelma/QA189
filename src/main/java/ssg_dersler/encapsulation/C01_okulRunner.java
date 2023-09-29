package ssg_dersler.encapsulation;

import com.sun.jdi.PathSearchingVirtualMachine;

public class C01_okulRunner {

    public static void main(String[] args) {


        C01_okul okul = new C01_okul();

        System.out.println(okul);

        okul.setOkulIsmi("Cihan School");

        System.out.println(okul);

        okul.setMudur("Cansu Ay");

        System.out.println(okul);



    }
}
