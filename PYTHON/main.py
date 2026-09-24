from barista import Barista

def print_tabel(list_barista):
    garis = "-" * 145
    print("\n" + garis)
    print(f"| {'NIK':<10} | {'Nama':<15} | {'L/P':<3} | {'ID Pegawai':<10} | {'Departemen':<12} | {'Thn':<4} | {'Shift':<7} | {'Menu Andalan':<15} | {'Foto Produk':<20} |")
    print(garis)
    for b in list_barista:
        print(f"| {b.get_nik():<10} | {b.get_nama():<15} | {b.get_jenis_kelamin():<3} | {b.get_id_pegawai():<10} | {b.get_departemen():<12} | {b.get_tahun_masuk():<4} | {b.get_shift_kerja():<7} | {b.get_menu_andalan():<15} | {b.get_foto_produk():<20} |")
    print(garis + "\n")

def main():
    list_barista = [
        Barista("3201", "Budi", "L", "P01", "Operasional", 2021, "Pagi", "Espresso", "budi_espresso.jpg"),
        Barista("3202", "Siti", "P", "P02", "Operasional", 2022, "Malam", "Latte Art", "siti_latte.jpg"),
        Barista("3203", "Andi", "L", "P03", "Operasional", 2020, "Pagi", "Cappuccino", "andi_capp.jpg"),
        Barista("3204", "Rina", "P", "P04", "Gudang", 2023, "Malam", "Cold Brew", "rina_coldbrew.jpg"),
        Barista("3205", "Dika", "L", "P05", "Manajemen", 2019, "Pagi", "Manual Brew", "dika_v60.jpg")
    ]

    print("=== DATA AWAL BERSYARAT (5 OBJEK) ===")
    print_tabel(list_barista)

    print("=== TAMBAH DATA BARISTA BARU ===")
    nik = input("Masukkan NIK: ")
    nama = input("Masukkan Nama: ")
    jk = input("Masukkan Jenis Kelamin (L/P): ")
    id_peg = input("Masukkan ID Pegawai: ")
    dept = input("Masukkan Departemen: ")
    thn = int(input("Masukkan Tahun Masuk: "))
    shift = input("Masukkan Shift Kerja: ")
    menu = input("Masukkan Menu Andalan: ")
    foto = input("Masukkan Nama File Foto: ")

    barista_baru = Barista(nik, nama, jk, id_peg, dept, thn, shift, menu, foto)
    list_barista.append(barista_baru)

    print("\n=== DATA KESELURUHAN (DALAM SATU TABEL) ===")
    print_tabel(list_barista)

if __name__ == "__main__":
    main()