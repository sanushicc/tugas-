package com.tugas;

import java.io.Console;
import java.util.Scanner;

public class tugas_7 {
    public static void main(String[] args) {

        Console con = System.console();

        int p, t;
        double luas;

        System.out.print("Masukan Panjang : ");
        p = Integer.parseInt(con.readLine());
        System.out.print("Masukan Tinggi : ");
        t = Integer.parseInt(con.readLine());

        luas = p * t / 2;
        System.out.println("Luas Segitiga : " + luas);

    }
}

class PersegiPanjang {
    public static void main(String[] args) {

        int Panjang;
        int Lebar;
        double luas;

        Scanner lord = new Scanner(System.in);

        System.out.print("Masukkan Panjang Persegi Panjang : ");
        Panjang = lord.nextInt();

        System.out.print("Masukkan Lebar Persegi Panjang : ");
        Lebar = lord.nextInt();

        luas = Panjang * Lebar;

        System.out.println("Jadi Luas Persegi Panjang Adalah : " + luas);
    }
}

class LuasLingkaran_jari_jari {
    public static void main(String[] args) {

        double phi = 3.14;
        int jari_jari;
        double luas;

        Scanner lord = new Scanner(System.in);

        System.out.print("Masukkan Jari-Jari Lingkaran : ");
        jari_jari = lord.nextInt();

        luas = phi * jari_jari * jari_jari;

        System.out.println("Jadi Luas Lingkaran Adalah : " + luas);

    }
}