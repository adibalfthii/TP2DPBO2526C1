public class Orang {
    private String nik;
    private String nama;
    private String jenisKelamin;

    // Constructor kosong (opsional tapi baik untuk kebiasaan)
    public Orang() {}

    // Constructor dengan parameter
    public Orang(String nik, String nama, String jenisKelamin) {
        this.nik = nik;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
    }

    // Getter
    public String getNik() { return nik; }
    public String getNama() { return nama; }
    public String getJenisKelamin() { return jenisKelamin; }
}