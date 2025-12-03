public class Exercise4_6_Multadd {

    /**
     * a * b + c islemini gerceklestirir.
     * Bu metot, dogrudan mult-add (carpma ve toplama) islemini yapar.
     * @param a double carpilacak 1. sayi
     * @param b double carpilacak 2. sayi
     * @param c double toplanacak sayi
     * @return double a * b + c isleminin sonucu
     */
    public static double multadd(double a, double b, double c) { // a * b + c islemini gerceklestirmeli. 
        return a * b + c;
    }

    /**
     * x * e^(-x) + sqrt(1 - e^(-x)) ifadesini hesaplar.
     * Bu metot, Java'nin Math kütüphanesi fonksiyonlarini kullanir.
     * @param x double ifadeye girecek degisken
     * @return double x * e^(-x) + sqrt(1 - e^(-x)) isleminin sonucu
     */
    public static double expSum(double x) { // xe^(-x) + sqrt(1 - e^(-x)) ifadesini hesaplayin. 
        
        // e^(-x) ifadesini bir degiskene atayarak kodu daha okunakli hale getirelim.
        double e_minus_x = Math.exp(-x); 
        
        // Ifadenin iki kismi:
        // 1. Kisim: x * e^(-x) --> multadd(x, e_minus_x, 0.0) seklinde de yazilabilir.
        double term1 = x * e_minus_x; 
        
        // 2. Kisim: sqrt(1 - e^(-x))
        double term2 = Math.sqrt(1 - e_minus_x); 
        
        // Toplam sonucu dondur
        return term1 + term2;
    }

    public static void main(String[] args) { // main metodunda metotlari test et. [cite: 210, 211]
        
        System.out.println("--- 1. multadd Metodu Testi ---");
        // Basit bir ornekle test edin: 3.0 * 2.0 + 1.0 = 7.0 olmali. 
        double simpleTest = multadd(3.0, 2.0, 1.0);
        System.out.println("3.0 * 2.0 + 1.0 = " + simpleTest);
        
        // --- multadd ile matematiksel ifadelerin hesaplanmasi ---
        System.out.println("\n--- 2. Matematiksel Ifadeler (multadd kullanilarak) ---");
        
        // a) sin(π/4) + cos(π/4)/2 ifadesini hesaplayin. 
        // Bu ifadeyi multadd(cos(π/4), 0.5, sin(π/4)) seklinde yazabiliriz.
        double pi_over_4 = Math.PI / 4.0;
        
        double a_sin = Math.sin(pi_over_4); // c: sin(π/4)
        double b_cos = Math.cos(pi_over_4); // a: cos(π/4)
        double c_half = 0.5; // b: 1/2
        
        double result1 = multadd(b_cos, c_half, a_sin); // cos(π/4) * 0.5 + sin(π/4)
        
        System.out.println("a) sin(π/4) + cos(π/4)/2 = " + result1);
        
        // b) log 10 + log 20 ifadesini hesaplayin. 
        // Not: Java'da Math.log() dogal logaritmayi (ln veya log_e) hesaplar.
        // Istenen ifadeyi multadd(1.0, log(20), log(10)) seklinde yazabiliriz.
        
        double log10 = Math.log(10); // c: log(10)
        double log20 = Math.log(20); // a: log(20)
        double factor = 1.0; // b: 1.0
        
        double result2 = multadd(factor, log20, log10); // 1.0 * log(20) + log(10)
        
        System.out.println("b) log 10 + log 20 (Dogal logaritma) = " + result2);
        
        // --- expSum Metodu Testi ---
        System.out.println("\n--- 3. expSum Metodu Testi ---");
        // Ornek bir x degeri ile test edelim (ornegin x = 1.0)
        double x_value = 1.0;
        double expSumResult = expSum(x_value);
        System.out.println("x = " + x_value + " icin expSum sonucu: " + expSumResult);
    }
}
