package rentalmobil;
import java.util.Scanner;
public class RentalMobil {
    public static void main(String[] args) {
        Scanner ketik = new Scanner(System.in);
        
        String[]nMobil = {"Daihatsu Ayla","Honda Brio   ","Suzuki Ertiga","Nissan Livina","Toyota Avanza","Daihatsu Xenia","Toyota Innova","Toyota HiAce","Isuzu Elf    ","Jeep             "};
        String[]wMobil = {"Merah","Kuning","Silver","Oranye","Bronze","Biru","Putih","Putih","Putih","Hitam"};
        int[]jWaktu = {24, 24, 24, 24, 24, 24, 24, 24, 24, 24};
        int[]hSewa = {325000, 325000, 375000, 375000, 375000, 375000, 475000, 700000, 500000, 645000};
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
            if (p_menu.equals("1")) {
                System.out.println("");
                if (listM.length == 0) {
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
            } else if (p_menu.equals("2")) {
                System.out.println("");
                if (listM.length == 0) {
                    System.out.println("Tidak ada mobil yang bisa disewa");
                    System.out.print("Tekan Enter untuk keluar...");
                    back = ketik.nextLine();
                    System.out.println("");
                } else {
                    Tools.listMobil(listM);
                    no_mobil = Tools.inputInt("Nomor Mobil") - 1;
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
            } else if (p_menu.equals("3")) {
                app = 0;
                System.out.println("");
            } else if (p_menu.equals("4dm1n")) {
                System.out.println("\n!!!!!!!!!!!!!!!!!!!!FORBIDDEN!!!!!!!!!!!!!!!!!!!!");
                String namaMB, warnaMB;
                int tarifMB;
                namaMB = Tools.inputString("Nama Mobil Baru");
                warnaMB = Tools.inputString("Warna Mobil");
                tarifMB = Tools.inputInt("Tarif/24jam");
                listM = Tools.tambahArray(listM, namaMB, warnaMB, tarifMB);
                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
            } else {
                System.out.println("");
            }
        }
    }
}
