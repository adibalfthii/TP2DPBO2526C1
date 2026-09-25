# Tugas Praktikum 2 DPBO 2026 - Kelas C1
**- Sistem Manajemen Staf UMKM Kopi Specialty (Multilevel Inheritance)**
Nama: Muh. Adib Al-Fathi
NIM: 2500418
Kelas: C1

**Janji** 
Saya Muh. Adib Al-Fathi dengan NIM 2500418 mengerjakan Tugas Praktikum 2 dalam mata kuliah Desain dan Pemrograman Berorientasi Objek untuk keberkahan-Nya maka saya tidak melakukan kecurangan seperti yang telah dispesifikasikan. Aamiin.

**1. Desain Arsitektur Sistem (Class Diagram)**
Sistem ini dirancang menggunakan hirarki Multilevel Inheritance (pewarisan tiga tingkat). Berikut adalah representasi diagram strukturnya:
<img width="229" height="382" alt="class diagram (tp2)" src="https://github.com/user-attachments/assets/69587e9b-3d1c-4f79-8949-0e07a5db4370" />

**2. Penjelasan Konsep OOP (Multilevel Inheritance)**
Alur pewarisannya dibikin serealistis mungkin berdasarkan logika di dunia nyata:
- Orang (Parent Class): Ini class paling dasar. Isinya cuma atribut identitas umum manusia.
- Pegawai (Child Class 1): Turunan dari class Orang. Karena setiap pegawai udah pasti manusia, class ini mewarisi sifat Orang dan ditambah atribut soal urusan kerjaan/kantor.
- Barista (Child Class 2): Turunan dari class Pegawai. Karena barista itu bagian dari pegawai kafe, dia mewarisi atribut pegawai ditambah atribut spesifik soal kerjaannya (kayak shift dan menu andalan). Ada juga tambahan atribut foto_produk biar aman menuhin syarat khusus di bahasa PHP.

**3. Daftar Atribut dan Method**
- Class Orang
1. Atribut: nik, nama, jenis_kelamin
2. Method: Constructor biasa & fungsi Getter/Setter.
- Class Pegawai (extends Orang)
1. Atribut: id_pegawai, departemen, tahun_masuk
2. Method: Constructor (pakai pemanggilan super()/parent) & Getter/Setter.
- Class Barista (extends Pegawai)
1. Atribut: shift_kerja, menu_andalan, foto_produk
2. Method: Constructor (pakai super()) & Getter/Setter.

**4. Alur Program pas Di-run**
- Data Awal: Pas program jalan, sistem otomatis bikin 5 objek Barista (di-hardcode langsung di kodenya).
- Tabel Pertama: Kelima data awal tadi langsung ditampilin dalam bentuk tabel yang rapi.
- Input Data Baru:
1. Buat Python, Java, & C++: Program bakal minta user masukin 1 data baru lewat ketikan di terminal.
2. Buat PHP: Sesuai keringanan aturan tugas, nambahin 1 data barunya langsung di-hardcode aja di kodenya tanpa input terminal.
- Tabel Akhir: Data yang baru masuk tadi digabungin ke dalam list, terus program bakal nyetak lagi tabel keseluruhan yang isinya udah update jadi 6 objek.

**5. Error Handling & Validation**
Biar programnya lebih aman dan nggak gampang crash pas di-test atau diinput aneh-aneh, ada beberapa validasi sederhana yang diterapin:
- Validasi Unik (Cek Duplikat NIK/ID): Program bakal ngecek NIK atau ID Pegawai yang dimasukin. Kalau ternyata ID-nya udah kepakai sama data yang ada sebelumnya, sistem bakal nolak dan nyuruh user masukin ID lain yang unik.
- Validasi Tipe Data Angka: Pas disuruh masukin tahun_masuk, program bakal mastiin kalau inputannya itu beneran angka. Kalau user malah ngetik huruf, program bakal nangkep error-nya (exception catching) biar nggak force close, dan minta input ulang.
- Mencegah Input Kosong: Ada validasi biar user nggak bisa sengaja atau nggak sengaja cuma pencet Enter (input kosong) di field-field penting kayak nama atau NIK.

**6. Dokumentasi Bukti Eksekusi**
1. Python:
<img width="691" height="507" alt="output_python" src="https://github.com/user-attachments/assets/8c7e3786-7630-4fc3-8221-42d8034edc04" />

2. Java:
<img width="665" height="484" alt="output_java" src="https://github.com/user-attachments/assets/797119d8-2399-4d01-be27-ab8f93be4929" />

3. C++:
<img width="702" height="506" alt="output_cpp" src="https://github.com/user-attachments/assets/b3960ed3-33c7-4f2c-8a81-309c85fe069c" />

4. PHP:
<img width="719" height="429" alt="output_php" src="https://github.com/user-attachments/assets/c319c429-17c3-4ebd-9c62-096be256b915" />
<img width="959" height="443" alt="output_php_2" src="https://github.com/user-attachments/assets/40f34e68-af5a-4b0f-8023-f6956645d37f" />










