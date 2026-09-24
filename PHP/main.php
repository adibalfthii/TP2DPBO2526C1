<?php
require_once 'Barista.php';

function printTabel($list_barista) {
    $garis = str_repeat("-", 145);
    echo "\n" . $garis . "\n";
    printf("| %-10s | %-15s | %-3s | %-10s | %-12s | %-4s | %-7s | %-15s | %-20s |\n", 
            "NIK", "Nama", "L/P", "ID Pegawai", "Departemen", "Thn", "Shift", "Menu Andalan", "Foto Produk");
    echo $garis . "\n";
    
    foreach ($list_barista as $b) {
        printf("| %-10s | %-15s | %-3s | %-10s | %-12s | %-4s | %-7s | %-15s | %-20s |\n",
                $b->get_nik(), $b->get_nama(), $b->get_jenis_kelamin(), 
                $b->get_id_pegawai(), $b->get_departemen(), $b->get_tahun_masuk(), 
                $b->get_shift_kerja(), $b->get_menu_andalan(), $b->get_foto_produk());
    }
    echo $garis . "\n\n";
}

$list_barista = array();

array_push($list_barista, new Barista("3201", "Budi", "L", "P01", "Operasional", 2021, "Pagi", "Espresso", "budi_espresso.jpg"));
array_push($list_barista, new Barista("3202", "Siti", "P", "P02", "Operasional", 2022, "Malam", "Latte Art", "siti_latte.jpg"));
array_push($list_barista, new Barista("3203", "Andi", "L", "P03", "Operasional", 2020, "Pagi", "Cappuccino", "andi_capp.jpg"));
array_push($list_barista, new Barista("3204", "Rina", "P", "P04", "Gudang", 2023, "Malam", "Cold Brew", "rina_coldbrew.jpg"));
array_push($list_barista, new Barista("3205", "Dika", "L", "P05", "Manajemen", 2019, "Pagi", "Manual Brew", "dika_v60.jpg"));

echo "=== DATA AWAL BERSYARAT (5 OBJEK) ===\n";
printTabel($list_barista);

// menambahkan data yg baru 
echo "=== TAMBAH DATA BARISTA BARU ===\n";
$barista_baru = new Barista("3206", "Faisal", "L", "P06", "Operasional", 2024, "Malam", "Americano", "faisal_americano.jpg");
array_push($list_barista, $barista_baru);
echo "> Data atas nama Faisal berhasil ditambahkan ke dalam sistem!\n";

echo "=== DATA KESELURUHAN (DALAM SATU TABEL) ===\n";
printTabel($list_barista);
?>