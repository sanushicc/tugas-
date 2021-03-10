package com.tugas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class tugas_3 {
    public static void main(String[] args) {

        // Praktek 4.3 Halaman 12

        // Bagian A
        double grade = 80;

        if (grade >= 90) {
            System.out.println("Excellent");

        } else if (grade < 90 && grade >= 80) {

            System.out.println("Good Job");

        } else if (grade < 80 && grade >= 60) {

            System.out.println("Study Harder!");

        } else {
            System.out.println("Sorry, You Failed");
        }

    }
}

// Bagian B

class Grade_Switch {
    public static void main(String[] args) {
        int grade = 85;

        switch (grade) {

        case 100:
            System.out.println("Excellent");
            break;
        case 90:
            System.out.println("Good Job");
            break;

        case 80:
            System.out.println("Study Harder");

        default:
            System.out.println("Sorry, You Failed");
            break;

        }
    }
}

class SwitchDemo {
    public static void main(String[] args) {
        Date date = new Date();
        String strDateFormat = "MMMM";
        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);

        switch (sdf.format(date)) {
        case "Januari":
            System.out.println("Bulan Januari");
            break;
        case "Februari":
            System.out.println("Bulan Februari");
            break;
        case "Maret":
            System.out.println("Bulan Maret");
            break;
        case "April":
            System.out.println("Bulan April");
            break;
        case "Mei":
            System.out.println("Bulan Mei");
            break;
        case "Juni":
            System.out.println("Bulan Juni");
            break;
        case "July":
            System.out.println("Bulan July");
            break;
        case "Agustus":
            System.out.println("Bulan Agustus");
            break;
        case "September":
            System.out.println("Bulan September");
            break;
        case "November":
            System.out.println("Bulan November");
            break;
        case "Desember":
            System.out.println("Bulan Desember");
            break;
        default:
            System.out.println("Invalid Month");
            break;
        }
    }
}

class Bagian_C {

    public static void main(String[] args) {
        int i = 4;

        while (i >= 0) {

            System.out.println(i);

            i--;

            System.out.println("\n");

            int x = 0;
            do {
                System.out.println(x);
                x++;
            } while (x < 10);

            System.out.println("\n");

            int is = 0;

            while (is < 10) {
                System.out.println(is);
                is++;

                System.out.println("\n");

                int ea = 10;

                for (int j = 1; j <= ea; j++) {
                    System.out.println(ea);
                }

            }
        }
    }

}