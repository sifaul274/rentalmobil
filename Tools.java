package rentalmobil;
import java.util.Scanner;
public class Tools {
    static Scanner ketik = new Scanner(System.in);
    static String inputString(String label){
        System.out.print("Masukkan "+label+" : ");
        String var = ketik.nextLine();
        return var;
    }
    static int inputInt(String label){
        System.out.print("Masukkan "+label+" : ");
        String a = ketik.nextLine();
        int var = Integer.parseInt(a);
        return var;
    }
    static void menu(){
        System.out.println("===============");
        System.out.println("Menu:");
        System.out.println("1. Sewa Mobil");
        System.out.println("2. Keluar");
        System.out.println("===============");
        System.out.print("Pilih aksi => ");
    }
    static void listMobil(ListMobil[]mobil){
        System.out.println("***List Mobil***");
        for(int i=0;i<mobil.length;i++){
            System.out.println((i+1)+". "+mobil[i].getNamaMobil()+"\t"+mobil[i].getHargaSewa());
        }
        System.out.println("**********************");
    }
    static void pMobil(ListMobil[]mobil, String[]nama, int[]harga){
        for(int i = 0; i < nama.length; i++){
            mobil[i] = new ListMobil(nama[i],harga[i]);
        }
    }
    static ListMobil[] removeArray(ListMobil[]mobil, int index){
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
    static void cetak(String namaC, String noTelp, String namaM, int tarifM){
        System.out.println("---------------");
        System.out.println("Nama\t\t\t: "+namaC);
        System.out.println("No. Telp\t\t: "+noTelp);
        System.out.println("Mobil yang disewa\t: "+namaM);
        System.out.println("Tarif sewa\t\t: "+tarifM);
        System.out.println("---------------");
    }
}