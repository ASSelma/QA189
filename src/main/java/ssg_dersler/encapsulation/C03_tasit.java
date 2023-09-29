package ssg_dersler.encapsulation;

public class C03_tasit {

    private String tasitTuru;
    private String vitesTuru;
    private int kacVites;
    private boolean muayenesiVarMi;

    static int counter = 1000;

    public String getTasitTuru() {
        return tasitTuru;
    }

    public void setTasitTuru(String tasitTuru) {
        this.tasitTuru = tasitTuru;

    }

    public String getVitesTuru() {
        return vitesTuru;
    }

    public void setVitesTuru(String vitesTuru) {
        this.vitesTuru = vitesTuru;
    }

    public int getKacVites() {
        return kacVites;
    }

    public void setKacVites(int kacVites) {
        this.kacVites = kacVites;
    }

    public boolean isMuayenesiVarMi() {
        return muayenesiVarMi;
    }

    public void setMuayenesiVarMi(boolean muayenesiVarMi) {
        this.muayenesiVarMi = muayenesiVarMi;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter() {
        counter = counter;
        counter++;
    }

    @Override
    public String toString() {
        return "C03_tasit{" +
                "tasitTuru='" + tasitTuru + '\'' +
                ", vitesTuru='" + vitesTuru + '\'' +
                ", kacVites=" + kacVites +
                ", muayenesiVarMi=" + muayenesiVarMi +
                ", counter=" + counter +
                '}';
    }
}