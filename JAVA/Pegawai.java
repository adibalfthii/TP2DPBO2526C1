public class Pegawai extends Orang {
    private String idPegawai;
    private String departemen;
    private int tahunMasuk;

    public Pegawai() {}

    public Pegawai(String nik, String nama, String jenisKelamin, String idPegawai, String departemen, int tahunMasuk) {
        super(nik, nama, jenisKelamin); // Memanggil constructor parent (Orang)
        this.idPegawai = idPegawai;
        this.departemen = departemen;
        this.tahunMasuk = tahunMasuk;
    }

    public String getIdPegawai() { return idPegawai; }
    public String getDepartemen() { return departemen; }
    public int getTahunMasuk() { return tahunMasuk; }
}