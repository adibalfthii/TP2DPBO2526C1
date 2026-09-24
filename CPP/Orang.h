#pragma once
#include <iostream>
#include <string>
using namespace std;

class Orang {
protected:
    string nik;
    string nama;
    string jenis_kelamin;
public:
    Orang() {}
    Orang(string n, string nm, string jk) : nik(n), nama(nm), jenis_kelamin(jk) {}
    
    string get_nik() { return nik; }
    string get_nama() { return nama; }
    string get_jenis_kelamin() { return jenis_kelamin; }
};