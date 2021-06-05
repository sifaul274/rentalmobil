package rentalmobil;
public class ListMobil extends Mobil{
    protected int hargaSewa;
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
    ListMobil(String namaMobil, int hargaSewa){
        this.namaMobil = namaMobil;
        this.hargaSewa = hargaSewa;
    }
}