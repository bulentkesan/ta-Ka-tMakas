import java.util.Random;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        // Taş kağıt makas oyunu
        // Oyun bilgisayar ile oynanacak
        // Klavyeden değer girip bilgisayar random olarak seçim yapacak
        // Ekrana ise 'kazandınız','kaybettiniz' olarak belirtecek


        //1.taş
        //2.kağıt
        //3.makas

        int kisi, bilgisayar;
        // bilgisayarın 1 ile 3 aralığında rndom değer tutması lazım.
        Random rnd = new Random();
        bilgisayar = rnd.nextInt(3) + 1; // bilgisayarın 1 ile 3 arası sayı tutmasını sağlıyoruz.
        System.out.println("bilgisayar" + bilgisayar);
        System.out.println("1.taş");
        System.out.println("2.kağıt");
        System.out.println("3.makas");
        System.out.println("Lütfen seçiminizi yapınız");
        Scanner gelenioku = new Scanner(System.in);
        kisi = gelenioku.nextInt();
        if (kisi != 1 && kisi != 2 && kisi != 3) {
            System.out.println("yaliş bir seçim yapılmıştır.");
        } else {
            //bilgisayar:1 k:1 berabere
            //bilgisayar:1 k:2 kişi kazandı
            //bilgisayar:1 k:3 bilgisayar kazandı

            //bilgisayar:2 k:1 bilgisayar kazandı
            //bilgisayar:2 k:2 berabere
            //bilgisayar:2 k:3 kişi kazandı

            //bilgisayar:3 k:1 kişi kazandı
            //bilgisayar:3 k:2 bilgisayar kazandı
            //bilgisayar:3 k:3 berabere

            //istenilen değer aralığında giriş yapılmıştır. değeri bilgisayar ile karşılaştırmak gerekecektir.

            if (bilgisayar == kisi) {
                System.out.println("berabere");
            }
            if (bilgisayar == 1 && kisi == 2) {
                System.out.println("kişi kazandı");
            }
            if (bilgisayar == 1 && kisi == 3) {
                System.out.println("bilgisayar kazandı");
            }
            if (bilgisayar == 2 && kisi == 1) {
                System.out.println("bilgisayar kazandı");
            }
            if (bilgisayar == 2 && kisi == 3) {
                System.out.println("kişi kazandı");
            }
            if (bilgisayar == 3 && kisi == 1) {
                System.out.println("kisi kazandı");
            }
            if (bilgisayar == 3 && kisi == 2) {
                System.out.println("bilgisayar kazandı");
            }

        }
    }
}