package rentalmobil;
public class ListMobil extends Mobil{
    protected int jangkaWaktu, hargaSewa;
    void setJangkaWaktu(int jangkaWaktu){
        this.jangkaWaktu = jangkaWaktu;
    }
    int getJangkaWaktu(){
        return jangkaWaktu;
    }
    void setHargaSewa(int hargaSewa){
        this.hargaSewa = hargaSewa;
    }
    int getHargaSewa(){
        return hargaSewa;
    }
    @Override
    void setNamaMobil(String namaMobil) {
        this.namaMobil = namaMobil;
    }
    @Override
    String getNamaMobil() {
        return namaMobil;
    }
    @Override
    void setWarna(String warna) {
        this.warna = warna;
    }
    @Override
    String getWarna() {
        return warna;
    }
    ListMobil(String namaMobil){
        this.namaMobil = namaMobil;
    }
}
