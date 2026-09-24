<?php
require_once 'Orang.php';

class Pegawai extends Orang {
    protected $id_pegawai;
    protected $departemen;
    protected $tahun_masuk;

    public function __construct($nik, $nama, $jenis_kelamin, $id_pegawai, $departemen, $tahun_masuk) {
        parent::__construct($nik, $nama, $jenis_kelamin);
        $this->id_pegawai = $id_pegawai;
        $this->departemen = $departemen;
        $this->tahun_masuk = $tahun_masuk;
    }

    public function get_id_pegawai() { return $this->id_pegawai; }
    public function get_departemen() { return $this->departemen; }
    public function get_tahun_masuk() { return $this->tahun_masuk; }
}
?>