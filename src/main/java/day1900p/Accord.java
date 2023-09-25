package day1900p;

public class Accord implements  Ac,Engine,Security{


    @Override
    public void cool() {

        System.out.println("Accord");

    }


    @Override
    public void run() {
        System.out.println("Accord cools super");
    }
}
