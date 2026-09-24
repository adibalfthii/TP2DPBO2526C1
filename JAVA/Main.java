import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    // Fungsi untuk mencetak tabel dinamis
    public static void printTabel(ArrayList<Barista> listBarista) {
        String garis = "-------------------------------------------------------------------------------------------------------------------------------------------------";
        System.out.println("\n" + garis);
        System.out.printf("| %-10s | %-15s | %-3s | %-10s | %-12s | %-4s | %-7s | %-15s | %-20s |\n", 
                "NIK", "Nama", "L/P", "ID Pegawai", "Departemen", "Thn", "Shift", "Menu Andalan", "Foto Produk");
        System.out.println(garis);
        
        for (Barista b : listBarista) {
            System.out.printf("| %-10s | %-15s | %-3s | %-10s | %-12s | %-4d | %-7s | %-15s | %-20s |\n",
                    b.getNik(), b.getNama(), b.getJenisKelamin(), b.getIdPegawai(), 
                    b.getDepartemen(), b.getTahunMasuk(), b.getShiftKerja(), 
                    b.getMenuAndalan(), b.getFotoProduk());
        }
        System.out.println(garis + "\n");
    }

    public static void main(String[] args) {
        ArrayList<Barista> listBarista = new ArrayList<>();

        // Syarat: 5 Objek Awal (Hardcode)
        listBarista.add(new Barista("3201", "Budi", "L", "P01", "Operasional", 2021, "Pagi", "Espresso", "budi_espresso.jpg"));
        listBarista.add(new Barista("3202", "Siti", "P", "P02", "Operasional", 2022, "Malam", "Latte Art", "siti_latte.jpg"));
        listBarista.add(new Barista("3203", "Andi", "L", "P03", "Operasional", 2020, "Pagi", "Cappuccino", "andi_capp.jpg"));
        listBarista.add(new Barista("3204", "Rina", "P", "P04", "Gudang", 2023, "Malam", "Cold Brew", "rina_coldbrew.jpg"));
        listBarista.add(new Barista("3205", "Dika", "L", "P05", "Manajemen", 2019, "Pagi", "Manual Brew", "dika_v60.jpg"));

        System.out.println("=== DATA AWAL BERSYARAT (5 OBJEK) ===");
        printTabel(listBarista);

        // Syarat: Menerima Input User
        Scanner sc = new Scanner(System.in);
        System.out.println("=== TAMBAH DATA BARISTA BARU ===");
        System.out.print("Masukkan NIK: "); String nik = sc.nextLine();
        System.out.print("Masukkan Nama: "); String nama = sc.nextLine();
        System.out.print("Masukkan Jenis Kelamin (L/P): "); String jk = sc.nextLine();
        System.out.print("Masukkan ID Pegawai: "); String idPeg = sc.nextLine();
        System.out.print("Masukkan Departemen: "); String dept = sc.nextLine();
        System.out.print("Masukkan Tahun Masuk: "); 
        int thn = Integer.parseInt(sc.nextLine()); // Parse int agar tidak loncat saat baca string berikutnya
        System.out.print("Masukkan Shift Kerja: "); String shift = sc.nextLine();
        System.out.print("Masukkan Menu Andalan: "); String menu = sc.nextLine();
        System.out.print("Masukkan Nama File Foto: "); String foto = sc.nextLine();

        // Masukkan data baru ke dalam list
        Barista baristaBaru = new Barista(nik, nama, jk, idPeg, dept, thn, shift, menu, foto);
        listBarista.add(baristaBaru);

        System.out.println("=== DATA KESELURUHAN (DALAM SATU TABEL) ===");
        printTabel(listBarista);
        
        sc.close();
    }
}