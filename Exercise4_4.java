public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        /*
        // Cevap 1:
        // getNumber() metodu 42 degerini dondurur, ancak bu deger bir degiskene
        // atanmadigi veya bir ifade icinde kullanilmadigi icin YIGIN'dan (Stack) 
        // atilir ve KULLANILMAZ.
        // Derleyici (Compiler) teknik olarak HATA VERMEZ, ancak bazi modern IDE'ler
        // (IntelliJ, Eclipse gibi) "unused return value" (kullanilmayan donus degeri)
        // uyarisi verir. Program calismaya devam eder.
        */

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        /*
        // Cevap 2:
        // Bir void metot (geri deger dondurmeyen metot) bir ifadenin (expression) 
        // icinde kullanilamaz (ornegin toplama islemi gibi). 
        // Java derleyicisi bu durumda hemen HATA (Syntax Error) verecektir.
        // Hata Mesaji Aciklamasi: "void cannot be converted to type" (void, 
        // istenen tipe donusturulemez) veya "not a statement" (ifade degil) 
        // benzeri bir hata alirsiniz. Cunku sayHello() bir deger degil, bir 
        // eylemdir (ekrana yazdirma).
        */
    }
}
