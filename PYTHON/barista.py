from pegawai import Pegawai

class Barista(Pegawai):
    def __init__(self, nik, nama, jenis_kelamin, id_pegawai, departemen, tahun_masuk, shift_kerja, menu_andalan, foto_produk):
        super().__init__(nik, nama, jenis_kelamin, id_pegawai, departemen, tahun_masuk)
        self.shift_kerja = shift_kerja
        self.menu_andalan = menu_andalan
        self.foto_produk = foto_produk

    def get_shift_kerja(self): return self.shift_kerja
    def get_menu_andalan(self): return self.menu_andalan
    def get_foto_produk(self): return self.foto_produk