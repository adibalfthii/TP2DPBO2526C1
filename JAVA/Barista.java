public class Barista extends Pegawai {
    private String shiftKerja;
    private String menuAndalan;
    private String fotoProduk;

    public Barista() {}

    public Barista(String nik, String nama, String jenisKelamin, String idPegawai, String departemen, int tahunMasuk, String shiftKerja, String menuAndalan, String fotoProduk) {
        super(nik, nama, jenisKelamin, idPegawai, departemen, tahunMasuk); // Memanggil constructor parent (Pegawai)
        this.shiftKerja = shiftKerja;
        this.menuAndalan = menuAndalan;
        this.fotoProduk = fotoProduk;
    }

    public String getShiftKerja() { return shiftKerja; }
    public String getMenuAndalan() { return menuAndalan; }
    public String getFotoProduk() { return fotoProduk; }
}