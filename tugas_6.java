package com.tugas;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class tugas_6 {

    public static String inputString() {

        int karakter;
        String str = "";
        boolean selesai = true;

        while (!selesai) {
            try {

                karakter = System.in.read();

                if (karakter < 0 || (char) karakter == '\n')
                    selesai = true;

                else if ((char) karakter != '\r')
                    str = str + (char) karakter;

            } catch (IOException e) {
                System.err.println("Ada Kesalahan");
                selesai = true;
            }

        }
        return str;
    }

    public static void main(String[] args) {
        tugas_6 oh = new tugas_6();

        System.out.println(oh);
    }
}

class SalamKenal {
    public static void main(String[] args) throws IOException {

        String nama;

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);

        // Mengisi varibel nama dengan Bufferreader
        System.out.print("Inputkan nama: ");
        nama = br.readLine();

        // tampilkan output isi variabel nama
        System.out.println("Nama kamu adalah " + nama);
    }
}

class KonversiData {
    public static void main(String[] args) throws IOException {

        String data_String;

        // Membuat objek inputstream
        InputStreamReader isr = new InputStreamReader(System.in);

        // membuat objek bufferreader
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Masukkan Bilangan Bulat : ");
        data_String = br.readLine();

        int data_bulat = Integer.valueOf(data_String);

        System.out.println("Masukkan Bilangan Pecahan : ");
        data_String = br.readLine();

        double data_Pecahan = Double.valueOf(data_String).doubleValue();

        System.out.println("Bilangan Bulat : " + data_bulat);
        System.out.println("Bilngan Pecahan : " + data_Pecahan);
    }

}