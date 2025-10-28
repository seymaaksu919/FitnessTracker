package main;

import java.util.Scanner;

class FitnessTracker {

    //Instance variables
    private int adimSayisi;
    private float uykuSaati;

    //Constructor
    public FitnessTracker(int adimSayisi, float uykuSaati) {
        this.adimSayisi = adimSayisi;
        this.uykuSaati = uykuSaati;
    }

    //Getter ve Setter metotları
    public int getAdimSayisi() {
        return adimSayisi;
    }

    public void setAdimSayisi(int adimSayisi) {
        this.adimSayisi = adimSayisi;
    }

    public float getUykuSaati() {
        return uykuSaati;
    }

    public void setUykuSaati(float uykuSaati) {
        this.uykuSaati = uykuSaati;
    }

    //Hedef Kontrol Metodları
    public void adimKontrolu() {
        if (adimSayisi >= 8000) {
            System.out.println("Hedef adım sayısı başarılı!");
        } else {
            System.out.println("Hedef adım sayısı başarısız!");
        }
    }

    public void uykuKontrolu() {
        if (uykuSaati < 7 || uykuSaati > 9) {
            System.out.println("Uyku Saati Dengesiz");
        } else {
            System.out.println("Uyku Saati Dengeli");
        }
    }

    //Haftalık ortalama su hesaplaması
    public static double ortalamaSu(double[] haftalikSu) {
        double toplam = 0;
        for (int i = 0; i < haftalikSu.length; i++) {
            toplam += haftalikSu[i];
        }
        return toplam / haftalikSu.length;
    }

    //Bilgileri Yazdırma
    public void bilgileriYazdirma(double[] haftalikSu) {
        System.out.println("\nAdım Sayısı: " + adimSayisi);
        System.out.println("Uyku Saati: " + uykuSaati);
        System.out.printf("Haftalık Ortalama Su Kullanımı: %.2f litre\n", ortalamaSu(haftalikSu));
    }

}







