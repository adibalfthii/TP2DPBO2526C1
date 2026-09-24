<?php
require_once 'Pegawai.php';

class Barista extends Pegawai {
    private $shift_kerja;
    private $menu_andalan;
    private $foto_produk; 

    public function __construct($nik, $nama, $jk, $id, $dept, $thn, $shift, $menu, $foto) {
        parent::__construct($nik, $nama, $jk, $id, $dept, $thn);
        $this->shift_kerja = $shift;
        $this->menu_andalan = $menu;
        $this->foto_produk = $foto;
    }

    public function get_shift_kerja() { return $this->shift_kerja; }
    public function get_menu_andalan() { return $this->menu_andalan; }
    public function get_foto_produk() { return $this->foto_produk; }
}
?>