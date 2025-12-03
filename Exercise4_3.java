public class Exercise4_3 {

    public static void zoop() {
        baffle();
        System.out.print("You wugga ");
        baffle();
    }

    public static void main(String[] args) {
        System.out.print("No, I ");
        zoop();
        System.out.print("I ");
        baffle();
    }

    public static void baffle() {
        System.out.print("wug");
        ping();
    }

    public static void ping() {
        System.out.println(".");
    }
}
/* Stack Diyagramı (ping İlk Çağrıldığında)
// Metot Çerçevesi 	Yerel Değişkenler & Parametreler	Geri Dönüş Adresi
// ping	            Yok 	                            baffle (Satır 16)
// baffle	            Yok                               	zoop (Satır 2)
// zoop	            Yok                             	main (Satır 9)
// main	            args: [...]	                       (Program Girişi)


// TAM ÇIKTI:
// No, I wug.
// You wugga wug.
// I wug.
*/
