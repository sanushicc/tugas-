package com.tugas_inheritance;

class Sepeda {

    int kecepatan = 0;
    int gir = 0;

    void ubahgir(int pertambahangir) {
        gir = gir + pertambahangir;

        System.out.println("Gir : " + gir);

    }

    void tambahkecepatan(int pertambahankecepatan) {
        kecepatan = kecepatan + pertambahankecepatan;

        System.out.println("Kecepatan : " + kecepatan);
    }
}
