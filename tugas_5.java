package com.tugas;

public class tugas_5 {
    private String HidupkanMobil;
    private String MatikanMobil;
    private int Gigi;

    public String getHidupkanMobil() {
        return this.HidupkanMobil;
    }

    public void setHidupkanMobil(String HidupkanMobil) {
        this.HidupkanMobil = HidupkanMobil;
    }

    public String getMatikanMobil() {
        return this.MatikanMobil;
    }

    public void setMatikanMobil(String MatikanMobil) {
        this.MatikanMobil = MatikanMobil;
    }

    public int getGigi() {
        return this.Gigi;
    }

    public void setGigi(int Gigi) {
        this.Gigi = Gigi;
    }

}

class MobilLengkapBeraksi {

    public static void main(String[] args) {

        tugas_5 mobilme = new tugas_5();

        mobilme.setHidupkanMobil("1. Masukkan kunci ke dalam kontak." + "\n" + "2. Kenali kopling, rem, dan gas." + "\n"
                + "3. Pastikan mobil Anda dalam posisi netral." + "\n" + "4. Nyalakan kontak");

        mobilme.setGigi(1);

        mobilme.setMatikanMobil("1. Pindahkan tuas perseneling ke N bagi mobil manual dan ke P bagi mobil matic." + "\n"
                + "2. Tarik hand rem atau rem tangan." + "\n"
                + "3. Matikan semua komponen litrik seperti lampu, double din, begitu juga AC." + "\n"
                + "Tunggu putaran mesin sampai posisi idle." + "Putar kunci ke posisi off.");

        // Print

        String Hidpukanmobil = mobilme.getHidupkanMobil();
        int Gigi = mobilme.getGigi();
        String MatikanMobil = mobilme.getMatikanMobil();

        System.out.println("Hidupkan Mobil : " + "\n" + Hidpukanmobil);
        System.out.println("Gigi Anda Saat Ini : " + "\n" + Gigi);
        System.out.println("Matikan Mobil : " + "\n" + MatikanMobil);

    }

}