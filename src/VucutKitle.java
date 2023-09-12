import java.util.Scanner;
public class VucutKitle {
        public static void main(String[] args) {
        double kilo , boy , kitleIndex ;
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu Giriniz(Metre Cinsinden) : ");
        boy=input.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz : ");
        kilo=input.nextDouble();
        kitleIndex = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz : " + kitleIndex);
    }
}