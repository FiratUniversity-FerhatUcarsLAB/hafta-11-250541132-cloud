public class Exercise4_2 {

  // Her satirin sonuna calisma sirasi yorumlarini ekleyin.

    public static void main(String[] args) { //1
        zippo("rattle", 13); //2
    }//14

    public static void baffle(String blimp) {
        System.out.println(blimp); //6
        zippo("ping", -5); // 7
    } // 11

    public static void zippo(String quince, int flag) {
        if (flag < 0) { // 3, 8
            System.out.println(quince + " zoop"); // 9
        } else { // 4
            System.out.println("ik"); // 4
            baffle(quince); // 5
            System.out.println("boo-wa-ha-ha"); // 12
        }  // 10, 13
    }
}
/** baffle metodu ilk çağrıldığında blimp parametresinin değeri nedir?
baffle metodu ilk kez satır 19'da baffle(quince) şeklinde çağrılmıştır. Bu çağrı, ilk zippo("rattle", 13) metodunun içinden gelmektedir,
bu yüzden quince parametresinin değeri "rattle" idi.

 * Programın ürettiği tüm çıktıyı yazınız.
ik rattle ping zoop boo-wa-ha-ha

* Hangi satırlar birden fazla kez çalışmıştır?
Sadece Satır 15 (if (flag < 0) {) iki kez çalışmıştır.

İlk çağrıda: flag = 13 (Yanlış)

İkinci çağrıda: flag = -5 (Doğru)
  */
