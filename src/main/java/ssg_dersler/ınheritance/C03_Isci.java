package ssg_dersler.ınheritance;

public class C03_Isci extends  C02_muhasebe{


public  C03_Isci(){

}

int fazlaMesai;

int ucret;

public int fazlaMesaiParasiHesapla(){

    ucret=fazlaMesai*calısmaSaati*2;

    return ucret;

}



    public C03_Isci(String isim, String soyIsim, String telefon, String adres, int calısmaSaati, int kacGunCalıstı, int saatUcreti) {

        this.id=idAtama();
        this.isim=isim;
        this.soyİsim=soyIsim;
        this.adres=adres;
        this.telefon=telefon;
        this.calısmaSaati=calısmaSaati;
        this.saatUcreti=saatUcreti;
        this.kacGunCalıstı=kacGunCalıstı;
        this.maas=maasHesapla();
    }

    @Override
    public String toString() {
        return "C03_Isci{" +
                "saatUcreti=" + saatUcreti +
                ", calısmaSaati=" + calısmaSaati +
                ", kacGunCalıstı=" + kacGunCalıstı +
                ", maas=" + maas +
                ", id=" + id +
                ", telefon='" + telefon + '\'' +
                ", isim='" + isim + '\'' +
                ", soyİsim='" + soyİsim + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }
}
