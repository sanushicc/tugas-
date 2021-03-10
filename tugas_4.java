package com.tugas;

import java.util.Scanner;

// Nomer 2

public class tugas_4 {
    public static void main(String[] args) {

        int name = 1;

        while (name <= 100) {
            System.out.println("My Name Is Nagi Yanagi");
            name++;
        }

    }
}

class loop_name {
    public static void main(String[] args) {
        int a = 1;

        do {
            System.out.println("My Name Is Cecilisa");
            a++;
        } while (a <= 100);

    }
}

class loop_name2 {

    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            System.out.println("My Name Is Nunnaly Elizabeth");
        }

    }

}

class loop_name3 {

    public static void main(String[] args) {

        String[] data = { "Ujang Sanusi", "Elizabeth", "Rookofeller", "Rotchchilds" };

        for (String string : data) {
            System.out.println(string);
        }

    }

}

// Nomer 1

class number1 {

    public static void main(String[] args) {

        int angka;

        Scanner User = new Scanner(System.in);

        System.out.print("Angka : ");
        angka = User.nextInt();

        if (angka <= 10) {
            System.out.println(" Angka Yang Kamu Pilih : " + angka);
        } else {
            System.out.println("Invalid Number");
        }

    }

}

class number2 {
    public static void main(String[] args) {

        int angka;

        Scanner User = new Scanner(System.in);

        System.out.println("Angka : ");
        angka = User.nextInt();

        switch (angka) {

        case 1:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        case 2:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        case 3:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        case 4:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        case 5:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        case 6:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        case 7:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        case 8:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        case 9:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        case 10:
            System.out.println("Angka Yang Anda Pilih : " + angka);
            break;
        default:
            System.out.println("INVALID NUMBER");
            break;
        }

    }
}