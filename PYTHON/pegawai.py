from orang import Orang

class Pegawai(Orang):
    def __init__(self, nik, nama, jenis_kelamin, id_pegawai, departemen, tahun_masuk):
        super().__init__(nik, nama, jenis_kelamin)
        self.id_pegawai = id_pegawai
        self.departemen = departemen
        self.tahun_masuk = tahun_masuk

    def get_id_pegawai(self): return self.id_pegawai
    def get_departemen(self): return self.departemen
    def get_tahun_masuk(self): return self.tahun_masuk