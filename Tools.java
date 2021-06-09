package rentalmobil;
import java.util.Scanner;
public class ToolsMenu implements EditArray, InputVar{
    static Scanner ketik = new Scanner(System.in);
    @Override
    public String inputString(String label){
        System.out.print("Masukkan "+label+" : ");
        String var = ketik.nextLine();
        return var;
    }
    @Override
    public int inputInt(String label){
        System.out.print("Masukkan "+label+" : ");
        String a = ketik.nextLine();
        int var = Integer.parseInt(a);
        return var;
    }
    static void menu(){
        System.out.println("===============");
        System.out.println("Menu:");
        System.out.println("1. List Mobil");
        System.out.println("2. Sewa Mobil");
        System.out.println("3. Keluar");
        System.out.println("===============");
        System.out.print("Pilih aksi => ");
    }
    static void pMobil(ListMobil[]mobil, String[]nama, String[]warna, int[]waktu, int[]harga){
        for(int i = 0; i < nama.length; i++){
            mobil[i] = new ListMobil(nama[i]);
            mobil[i].setWarna(warna[i]);
            mobil[i].setJangkaWaktu(waktu[i]);
            mobil[i].setHargaSewa(harga[i]);
        }
    }
    @Override
    public ListMobil[] tambahArray(ListMobil[]mobil, String namaB, String warnaB, int tarifB){
        ListMobil[]another = new ListMobil[(mobil.length)+1];
        for(int i=0;i<mobil.length;i++){
            another[i] = mobil[i];
        }
        another[mobil.length] = new ListMobil(namaB);
        another[mobil.length].setWarna(warnaB);
        another[mobil.length].setJangkaWaktu(24);
        another[mobil.length].setHargaSewa(tarifB);
        return another;
    }
    static void listMobil(ListMobil[]mobil){
        System.out.println("*************************List Mobil*************************");
        System.out.println("No. Nama Mobil\t\tWarna\tJangka Waktu\tTarif");
        for(int i=0;i<mobil.length;i++){
            System.out.println((i+1)+".  "+mobil[i].getNamaMobil()+"\t"+mobil[i].getWarna()+"\t"+mobil[i].getJangkaWaktu()+"jam\t\t"+mobil[i].getHargaSewa());
        }
        System.out.println("************************************************************");
    }
    @Override
    public ListMobil[] hapusArray(ListMobil[]mobil, int index){
        if(mobil==null || index<0 || index>=mobil.length){
            return mobil;
        }
        ListMobil[]another = new ListMobil[(mobil.length)-1];
        for(int i=0, k=0; i< mobil.length; i++){
            if(i==index){
                continue;
            }
            another[k++] = mobil[i];
        }
        return another; 
    }
    static void cetak(String namaC, String alamatC, String noKTP, String noTelp, String email, ListMobil obj){
        System.out.println("--------------------------------------------------");
        System.out.println("Nama\t\t\t: "+namaC);
        System.out.println("Alamat\t\t\t: "+alamatC);
        System.out.println("No. KTP\t\t\t: "+noKTP);
        System.out.println("No. Telp\t\t: "+noTelp);
        System.out.println("Email\t\t\t: "+email);
        System.out.println("Mobil yang disewa\t: "+obj.getNamaMobil());
        System.out.println("Warna Mobil\t\t: "+obj.getWarna());
        System.out.println("Waktu Penyewaan\t\t: "+obj.getJangkaWaktu());
        System.out.println("Tarif sewa\t\t: "+obj.getHargaSewa());
        System.out.println("--------------------------------------------------");
    }
}
