package rentalmobil;
import java.util.Scanner;
public class RentalMobil {
    private static String pass_adm = "kelompok9";
    public static void main(String[] args) {
        Scanner ketik = new Scanner(System.in);
        ToolsMenu tools = new ToolsMenu();
        
        String[]nMobil = {"Daihatsu Ayla","Honda Brio   ","Suzuki Ertiga","Nissan Livina","Toyota Avanza","Daihatsu Xenia","Toyota Innova","Toyota HiAce","Isuzu Elf    ","Jeep             "};
        String[]wMobil = {"Merah","Kuning","Silver","Oranye","Bronze","Biru","Putih","Putih","Putih","Hitam"};
        int[]jWaktu = {24, 24, 24, 24, 24, 24, 24, 24, 24, 24};
        int[]hSewa = {325000, 325000, 375000, 375000, 375000, 375000, 475000, 700000, 500000, 645000};
        ListMobil[]listM = new ListMobil[nMobil.length];
        ToolsMenu.pMobil(listM, nMobil, wMobil, jWaktu, hSewa);
        int no_mobil;
        
        String cNama, cAlamat, cNoKTP, cNoTelp, cEmail;
        
        int app = 1;
        String back;
        String p_menu;
        while(app==1){
            ToolsMenu.menu();
            p_menu = ketik.nextLine();
            if (p_menu.equals("1")) {
                System.out.println("");
                if (listM.length == 0) {
                    System.out.println("Tidak ada mobil yang bisa disewa");
                    System.out.print("Tekan Enter untuk keluar...");
                    back = ketik.nextLine();
                    System.out.println("");
                } else {
                    ToolsMenu.listMobil(listM);
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
                    ToolsMenu.listMobil(listM);
                    no_mobil = tools.inputInt("Nomor Mobil") - 1;
                    cNama = tools.inputString("Nama");
                    cAlamat = tools.inputString("Alamat");
                    cNoKTP = tools.inputString("No. KTP");
                    cNoTelp = tools.inputString("No. Telp");
                    cEmail = tools.inputString("Email");
                    System.out.println("");
                    ToolsMenu.cetak(cNama, cAlamat, cNoKTP, cNoTelp, cEmail, listM[no_mobil]);
                    listM = tools.hapusArray(listM, no_mobil);
                    System.out.print("Tekan Enter untuk keluar...");
                    back = ketik.nextLine();
                    System.out.println("");
                }
            } else if (p_menu.equals("3")) {
                app = 0;
                System.out.println("");
            } else if (p_menu.equals("4dm1n")) {
                System.out.println("");
                String pass = tools.inputString("Password");
                if (pass.equals(pass_adm)) {
                    System.out.println("\n!!!!!!!!!!!!!!!!!!!!FORBIDDEN!!!!!!!!!!!!!!!!!!!!");
                    System.out.println("!!!!!!!!!!!!!***Tambah List Mobil***!!!!!!!!!!!!!");
                    String namaMB, warnaMB;
                    int tarifMB;
                    namaMB = tools.inputString("Nama Mobil Baru");
                    warnaMB = tools.inputString("Warna Mobil");
                    tarifMB = tools.inputInt("Tarif/24jam");
                    listM = tools.tambahArray(listM, namaMB, warnaMB, tarifMB);
                    System.out.println("Mobil Berhasil Ditambahkan");
                    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!\n");
                } else {
                    System.out.println("Password salah\n");
                }
            } else {
                System.out.println("");
            }
        }
    }
}
