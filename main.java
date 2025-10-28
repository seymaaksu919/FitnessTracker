package main;
import java.util.Scanner;

public class main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Günlük Adım sayınızı giriniz: ");
        int adimsayisi = scanner.nextInt();

        System.out.print("Günlük Uyku saatinizi giriniz: ");
        float uykuSaati = scanner.nextFloat();

        double[] haftalikSu = new double[7];
        for (int i = 0; i < 7; i++) {
            System.out.print((i + 1) + ". Günlük Su miktarını giriniz: ");
            haftalikSu[i] = scanner.nextDouble();
        }

        // FitnessTracker nesnesi oluştur
        FitnessTracker ft = new FitnessTracker(adimsayisi, uykuSaati);

        // Hedef kontroller
        ft.adimKontrolu();
        ft.uykuKontrolu();

        


        	ft.bilgileriYazdirma(haftalikSu);

        scanner.close();
    }
}


