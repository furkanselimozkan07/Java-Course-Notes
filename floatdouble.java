public class floatdouble {
    public static void main(String[] args) {

        // Double : 64 bit - 8 byte
        // Float : 32 bit - 4 byte

        // Otomatik Dönüştürme :  int --> float ---> double    bunlar eger sagdan sola dogru bır donsuturme yapmamız gerekırse manual yapıyon mesela
/*  double a =5.25;
double b = 4.0;
double c = 4d;
double d=4.23;
 System.out.println(d);
 float a=(float)5.0;
 float=5f;
 float c = 5.2f;
 degısknleı double olarak tanımla dırek
 */
        /*
        int a =22/7;
        float b =22f/7f;
        double c =22d/7d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        burada bu 3u arasındakı farkı ıgorebılırsın
         */
// otomatık donsuturm ısı syle oluor sen ınt ve folat toplayınca ıkı degerı de floata donusturcek
        /*
        int a=5;
        double k=a;
         float k=a;    bu ıkısı otomatık donsuuyor sorun vermıyor,


         amma
         double i=3.54;
         float j=i;  burda sorun cıkar    float j=(float)i;
        System.out.println(k);

         */
        double sayi1 = 70.25;
        double sayi2 = 60d;
        double sayi3 = 80.2;

        float a = 70.25f;
        float b = 60f;
        float c = 80.2f;
        System.out.println("Ortalama: " + (sayi1 + sayi2 + sayi3) / 3 );  //burda soladakıler double fakakt 3 ınt ama yıne de hepsıı double a cevrılcek
        System.out.println("Ortalama2: " + (a + b + c) / 3 );

    }
}
