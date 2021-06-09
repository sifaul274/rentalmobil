package rentalmobil;
public interface EditArray {
    ListMobil[] tambahArray(ListMobil[]mobil, String namaB, String warnaB, int tarifB);
    ListMobil[] hapusArray(ListMobil[]mobil, int index);
}