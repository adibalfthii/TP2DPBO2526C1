<?php
class Orang {
    protected $nik;
    protected $nama;
    protected $jenis_kelamin;

    public function __construct($nik, $nama, $jenis_kelamin) {
        $this->nik = $nik;
        $this->nama = $nama;
        $this->jenis_kelamin = $jenis_kelamin;
    }

    public function get_nik() { return $this->nik; }
    public function get_nama() { return $this->nama; }
    public function get_jenis_kelamin() { return $this->jenis_kelamin; }
}
?>