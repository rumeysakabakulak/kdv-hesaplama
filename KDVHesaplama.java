import java.util.Scanner;
public class KDVHesaplama {
    public static void main(String[] args) {
        double fiyat , kdvOrani = 0.18, kdvTutari , kdvliFiyat;
        Scanner inp = new Scanner(System.in);

        System.out.print("Ürün Fiyatı :");
        fiyat = inp.nextDouble();

        kdvTutari = fiyat * kdvOrani;
        kdvliFiyat = fiyat + kdvTutari;

        System.out.println("Kdv Tutarı : "+ kdvTutari);
        System.out.println("Kdvli Fiyat : " + kdvliFiyat);

    }
}
