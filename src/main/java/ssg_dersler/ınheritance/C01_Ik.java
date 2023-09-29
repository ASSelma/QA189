package ssg_dersler.ınheritance;

public class C01_Ik {
    public static int sayac=100;

  public   int id;

  public String telefon;

  public  String isim;

  public String soyİsim;


    String adres;


    public int idAtama(){ //metod oluşturduk

        id=sayac;
        sayac++;
        return id;

    }

    public static int getSayac() {
        return sayac;
    }

    public static void setSayac(int sayac) {
        C01_Ik.sayac = sayac;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyİsim() {
        return soyİsim;
    }

    public void setSoyİsim(String soyİsim) {
        this.soyİsim = soyİsim;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }



}
