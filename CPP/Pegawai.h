#pragma once
#include "Orang.h"

class Pegawai : public Orang {
protected:
    string id_pegawai;
    string departemen;
    int tahun_masuk;
public:
    Pegawai() {}
    Pegawai(string n, string nm, string jk, string id, string dep, int thn)
        : Orang(n, nm, jk), id_pegawai(id), departemen(dep), tahun_masuk(thn) {}
        
    string get_id_pegawai() { return id_pegawai; }
    string get_departemen() { return departemen; }
    int get_tahun_masuk() { return tahun_masuk; }
};