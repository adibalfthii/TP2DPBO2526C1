#include <iostream>
#include <string>
#include <vector>
#include <iomanip>
#include "Barista.h"

using namespace std;

void printTabel(vector<Barista> list_barista) {
    string garis = "-------------------------------------------------------------------------------------------------------------------------------------------------";
    cout << "\n" << garis << endl;
    
    // Header Tabel
    cout << "| " << left << setw(10) << "NIK" 
         << " | " << left << setw(15) << "Nama" 
         << " | " << left << setw(3) << "L/P" 
         << " | " << left << setw(10) << "ID Pegawai" 
         << " | " << left << setw(12) << "Departemen" 
         << " | " << left << setw(4) << "Thn" 
         << " | " << left << setw(7) << "Shift" 
         << " | " << left << setw(15) << "Menu Andalan" 
         << " | " << left << setw(20) << "Foto Produk" << " |" << endl;
    cout << garis << endl;

    // Isi Tabel
    for (Barista b : list_barista) {
        cout << "| " << left << setw(10) << b.get_nik() 
             << " | " << left << setw(15) << b.get_nama() 
             << " | " << left << setw(3) << b.get_jenis_kelamin() 
             << " | " << left << setw(10) << b.get_id_pegawai() 
             << " | " << left << setw(12) << b.get_departemen() 
             << " | " << left << setw(4) << b.get_tahun_masuk() 
             << " | " << left << setw(7) << b.get_shift_kerja() 
             << " | " << left << setw(15) << b.get_menu_andalan() 
             << " | " << left << setw(20) << b.get_foto_produk() << " |" << endl;
    }
    cout << garis << "\n" << endl;
}

int main() {
    vector<Barista> list_barista;

    list_barista.push_back(Barista("3201", "Budi", "L", "P01", "Operasional", 2021, "Pagi", "Espresso", "budi_espresso.jpg"));
    list_barista.push_back(Barista("3202", "Siti", "P", "P02", "Operasional", 2022, "Malam", "Latte Art", "siti_latte.jpg"));
    list_barista.push_back(Barista("3203", "Andi", "L", "P03", "Operasional", 2020, "Pagi", "Cappuccino", "andi_capp.jpg"));
    list_barista.push_back(Barista("3204", "Rina", "P", "P04", "Gudang", 2023, "Malam", "Cold Brew", "rina_coldbrew.jpg"));
    list_barista.push_back(Barista("3205", "Dika", "L", "P05", "Manajemen", 2019, "Pagi", "Manual Brew", "dika_v60.jpg"));

    cout << "=== DATA AWAL BERSYARAT (5 OBJEK) ===" << endl;
    printTabel(list_barista);

    // Menerima Input User
    string nik, nama, jk, idPeg, dept, shift, menu, foto;
    int thn;

    cout << "=== TAMBAH DATA BARISTA BARU ===" << endl;
    cout << "Masukkan NIK: "; getline(cin, nik);
    cout << "Masukkan Nama: "; getline(cin, nama);
    cout << "Masukkan Jenis Kelamin (L/P): "; getline(cin, jk);
    cout << "Masukkan ID Pegawai: "; getline(cin, idPeg);
    cout << "Masukkan Departemen: "; getline(cin, dept);
    cout << "Masukkan Tahun Masuk: "; 
    cin >> thn;
    cin.ignore(); 
    cout << "Masukkan Shift Kerja: "; getline(cin, shift);
    cout << "Masukkan Menu Andalan: "; getline(cin, menu);
    cout << "Masukkan Nama File Foto: "; getline(cin, foto);

    Barista barista_baru(nik, nama, jk, idPeg, dept, thn, shift, menu, foto);
    list_barista.push_back(barista_baru);

    cout << "=== DATA KESELURUHAN (DALAM SATU TABEL) ===" << endl;
    printTabel(list_barista);

    return 0;
}