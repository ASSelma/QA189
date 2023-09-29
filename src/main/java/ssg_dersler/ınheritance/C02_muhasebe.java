package ssg_dersler.ınheritance;

public class C02_muhasebe  extends C01_Ik{
    public int saatUcreti;

   public int calısmaSaati;

   public int kacGunCalıstı;

   public int maas;

 public int maasHesapla(){

     maas=saatUcreti*calısmaSaati*kacGunCalıstı;
     return maas;
 }


    public int getSaatUcreti() {
        return saatUcreti;
    }

    public void setSaatUcreti(int saatUcreti) {
        this.saatUcreti = saatUcreti;
    }

    public int getCalısmaSaati() {
        return calısmaSaati;
    }

    public void setCalısmaSaati(int calısmaSaati) {
        this.calısmaSaati = calısmaSaati;
    }

    public int getKacGunCalıstı() {
        return kacGunCalıstı;
    }

    public void setKacGunCalıstı(int kacGunCalıstı) {
        this.kacGunCalıstı = kacGunCalıstı;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        this.maas = maas;
    }



}






