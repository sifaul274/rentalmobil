package rentalmobil;
import java.util.Scanner;
public class RentalMobil {
    public static void main(String[] args) {
        Scanner ketik = new Scanner(System.in);
        
        String[]nMobil = {"Toyota Avanza","Daihatsu Xenia"};
        int[]hSewa = {375000, 375000};
        ListMobil[]listM = new ListMobil[nMobil.length];
        Tools.pMobil(listM, nMobil, hSewa);
        int no_mobil, harga_M;
        String nama_M;
        
        String cNama, cNoTelp;
        
        int app = 1;
        String back;
        String p_menu;
        while(app==1){
            Tools.menu();
            p_menu = ketik.nextLine();
            switch(p_menu){
                case "1":
                    if(listM.length==0){
                        System.out.println("Tidak ada mobil yang bisa disewa");
                        System.out.print("Tekan Enter untuk keluar...");
                        back = ketik.nextLine();
                        System.out.println("");
                        break;
                    } else {
                        Tools.listMobil(listM);
                        no_mobil = Tools.inputInt("Nomor Mobil")-1;
                        cNama = Tools.inputString("Nama");
                        cNoTelp = Tools.inputString("No. Telp");
                        nama_M = listM[no_mobil].getNamaMobil();
                        harga_M = listM[no_mobil].getHargaSewa();
                        Tools.cetak(cNama, cNoTelp, nama_M, harga_M);
                        listM = Tools.removeArray(listM, no_mobil);
                        System.out.print("Tekan Enter untuk keluar...");
                        back = ketik.nextLine();
                        System.out.println("");
                        break;
                    }
                case "2":
                    app = 0;
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    break;
            }
        }
    }
}