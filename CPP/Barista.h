#pragma once
#include "Pegawai.h"

class Barista : public Pegawai {
private:
    string shift_kerja;
    string menu_andalan;
    string foto_produk;
public:
    Barista() {}
    Barista(string n, string nm, string jk, string id, string dep, int thn, string shift, string menu, string foto)
        : Pegawai(n, nm, jk, id, dep, thn), shift_kerja(shift), menu_andalan(menu), foto_produk(foto) {}
        
    string get_shift_kerja() { return shift_kerja; }
    string get_menu_andalan() { return menu_andalan; }
    string get_foto_produk() { return foto_produk; }
};