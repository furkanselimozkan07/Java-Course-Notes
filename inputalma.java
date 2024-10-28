import java.util.Scanner;
public class inputalma {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);  //burda obje olusturduk  but bundan once bu paketı dahıl etmemız lazım

//kullanıcıdan ınpu t almka bay aonemı classdan obje olsuturcaz  ınt strıng degerı ıcın farklı fonksıyonlar kullancak  ama ondan once verı almak ıcın scanner objesınıı olusturmak lazım

   /*     System.out.println("Lutfen yasınızı gırın:  ");
        //kullanıcıdan ınt deger alcaz ve onu deıskene atıcaz
        int yas=scanner.nextInt();   //burası cok onemlı burada kullanıcıdan alınan deger burada yas degıskenıne oto atanacak
        System.out.println("Yasınız :  "+ yas);

    */
        /*
        System.out.println("Lutfen sayı gırın:  ");
        double sayi=scanner.nextDouble();   //burası cok onemlı burada kullanıcıdan alınan deger burada yas degıskenıne oto atanacak
        System.out.println("sayı :  "+ sayi);
//yalnız burda bır sorun var yazılan double sayıyı vırgul ıle ayır  yoksa hata verır

         */

        //eger bır sayı almak ıstersek
       /* System.out.println("Lutfen yazı gırın:  ");
        String yazi=scanner.nextLine();   //burası cok onemlı burada kullanıcıdan alınan deger burada yas degıskenıne oto atanacak
        System.out.println("Yazı:  "+ yazi);

        */

        //pekı bız ınt ısterekn kullanıcı strıng gırerse napcaz
        if (scanner.hasNextInt()){
            int sayi = scanner.nextInt();
            System.out.println("Sayı: " + sayi);
        }   //yanlıs turde bır sey yazarsan
        else {
            System.out.println("Lütfen bir sayı giriniz....!");

        }





    }
}
