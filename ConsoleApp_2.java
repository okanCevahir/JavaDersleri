public class ConsoleApp_2 {
    private String Marka;
    private String Renk;
    private String Isletim;
    private double Fiyat;

    public void Goster(){
        System.out.println("marka: "+ this.Marka);
        System.out.println("renk: "+ this.Renk);
        System.out.println("İşletim: "+ this.Isletim);
        System.out.println("Fiyat: "+ this.Fiyat);
        }

    public String getMarka() {
        return Marka;
    }

    public void setMarka(String marka) {
        this.Marka = marka;
    }

    public String getRenk() {
        return Renk;
    }

    public void setRenk(String renk) {
        this.Renk = renk;
    }

    public String getIsletim() {
        return Isletim;
    }

    public void setIsletim(String isletim) {
        this.Isletim = isletim;
    }

    public double getFiyat() {
        return Fiyat;
    }

    public void setFiyat(double fiyat) {
        this.Fiyat = fiyat;
    }
}
