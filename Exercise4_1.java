/**öğrenci no:250541132
 * öğrenci ad soyad: Esmanur ulu
 * ödev adı:alıştırma 4.1
 */

import java.util.Scanner;

public class Alistirma4_1 {
    public static void printAmerican(String day, int date, String month, int year) {
        // TODO
    }

    public static void printEuropean(String day, int date, String month, int year) {
        // TODO
    }

    public static void main(String[] args) {
        // TODO: test methods // ... printAmerican ve printEuropean metotları aynı kalır ...

        Scanner scanner = new Scanner(System.in);

        System.out.print("Haftanın gününü giriniz (örn: Monday): ");
        String day = scanner.nextLine();

        System.out.print("Ayın adını giriniz (örn: July): ");
        String month = scanner.nextLine();

        System.out.print("Ayın tarihini giriniz (örn: 22): ");
        int date = scanner.nextInt();

        System.out.print("Yılı giriniz (örn: 2019): ");
        int year = scanner.nextInt();

        scanner.close();

        System.out.println("\n--- Çıktılar ---");
        System.out.print("Amerikan: ");
        printAmerican(day, date, month, year);

        System.out.print("Avrupa: ");
        printEuropean(day, date, month, year);
    }
}
}
