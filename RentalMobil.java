package rentalmobil;
import java.util.Scanner;
public class RentalMobil {
    public static void main(String[] args) {
        Scanner ketik = new Scanner(System.in);
        
        String[]nMobil = {"Toyota Avanza","Daihatsu Xenia"};
        String[]wMobil = {"Hitam", "Hitam"};
        int[]jWaktu = {24, 24};
        int[]hSewa = {375000, 375000};
        ListMobil[]listM = new ListMobil[nMobil.length];
        Tools.pMobil(listM, nMobil, wMobil, jWaktu, hSewa);
        int no_mobil;
        
        String cNama, cAlamat, cNoKTP, cNoTelp, cEmail;
        
        int app = 1;
        String back;
        String p_menu;
        while(app==1){
            Tools.menu();
            p_menu = ketik.nextLine();
            switch(p_menu){
                case "1":
                    System.out.println("");
                    if(listM.length == 0){
                        System.out.println("Tidak ada mobil yang bisa disewa");
                        System.out.print("Tekan Enter untuk keluar...");
                        back = ketik.nextLine();
                        System.out.println("");
                    } else {
                        Tools.listMobil(listM);
                        System.out.print("Tekan Enter untuk keluar...");
                        back = ketik.nextLine();
                        System.out.println("");
                    }
                    break;
                case "2":
                    System.out.println("");
                    if(listM.length == 0){
                        System.out.println("Tidak ada mobil yang bisa disewa");
                        System.out.print("Tekan Enter untuk keluar...");
                        back = ketik.nextLine();
                        System.out.println("");
                    } else {
                        Tools.listMobil(listM);
                        no_mobil = Tools.inputInt("Nomor Mobil")-1;
                        cNama = Tools.inputString("Nama");
                        cAlamat = Tools.inputString("Alamat");
                        cNoKTP = Tools.inputString("No. KTP");
                        cNoTelp = Tools.inputString("No. Telp");
                        cEmail = Tools.inputString("Email");
                        System.out.println("");
                        Tools.cetak(cNama, cAlamat, cNoKTP, cNoTelp, cEmail, listM[no_mobil]);
                        listM = Tools.removeArray(listM, no_mobil);
                        System.out.print("Tekan Enter untuk keluar...");
                        back = ketik.nextLine();
                        System.out.println("");
                    }
                    break;
                case "3":
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
