package com.univ;

public class Main {
    public static void main(String[] args) {

        Mahasiswa Gerrald = new Mahasiswa (
             "4525210087",
             "Gerrald",
             "Wangkut",
            "13 April 2007",
             "Jl. Cendana No.12",
             19

        );

        // Objek kedua: David
        Mahasiswa Marianus = new Mahasiswa(
                "4525210087",
                "Marianus",
                "Saputra",
                "10 Mei 2001",
                "Jl. Melati No.8",
                23
        );

        // Tampilkan info
        Gerrald.displayInfo();
        Marianus.displayInfo();

        // Panggil method belajar dan ujian
        Gerrald.belajar();
        Marianus.ujian();
    }
}