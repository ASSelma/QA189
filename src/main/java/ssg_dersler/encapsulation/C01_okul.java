package ssg_dersler.encapsulation;

public class C01_okul {

    private String okulIsmi = "Techpro Koleji";

    private String mudurYardimcisi1 = "Veli Can";

    private String mudurYardimcisi2 = "Hasan Can";

    private int sinifSayisi = 80;

    private String mudur = "Ali Can";

    private int ogretmenSayisi = 80;

    int ogrenciSayisi = 80;

    public String getOkulIsmi() {
        return okulIsmi;
    }

    public void setOkulIsmi(String okulIsmi) {
        this.okulIsmi = okulIsmi;
    }

    public String getMudurYardimcisi1() {
        return mudurYardimcisi1;
    }

    public void setMudurYardimcisi1(String mudurYardimcisi1) {
        this.mudurYardimcisi1 = mudurYardimcisi1;
    }

    public String getMudurYardimcisi2() {
        return mudurYardimcisi2;
    }

    public void setMudurYardimcisi2(String mudurYardimcisi2) {
        this.mudurYardimcisi2 = mudurYardimcisi2;
    }

    public String getMudur() {
        return mudur;
    }

    public void setMudur(String mudur) {
        this.mudur = mudur;
    }

    public int getOgretmenSayisi() {
        return ogretmenSayisi;
    }

    public void setOgretmenSayisi(int ogretmenSayisi) {
        this.ogretmenSayisi = ogretmenSayisi;
    }

    public int getOgrenciSayisi() {
        return ogrenciSayisi;
    }

    public void setOgrenciSayisi(int ogrenciSayisi) {
        this.ogrenciSayisi = ogrenciSayisi;
    }

    public int getSinifSayisi() {
        return sinifSayisi;
    }



    @Override
    public String toString() {
        return "C01_okul{" +
                "okulIsmi='" + okulIsmi + '\'' +
                ", mudurYardimcisi1='" + mudurYardimcisi1 + '\'' +
                ", mudurYardimcisi2='" + mudurYardimcisi2 + '\'' +
                ", sinifSayisi=" + sinifSayisi +
                ", mudur='" + mudur + '\'' +
                ", ogretmenSayisi=" + ogretmenSayisi +
                ", ogrenciSayisi=" + ogrenciSayisi +
                '}';
    }
}




