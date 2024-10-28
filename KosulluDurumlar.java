

  import java.util.Scanner;


public class KosulluDurumlar {
    public static void main(String[] args) {

        /*
        if (kosul) {
            Koşul sağlanınca(true) bu blok çalışır.
//yalnı< bunu bır ozellıgı var bız class acarken suslu orantez acıyorduk ve bununnıcındekıler o classı ılgılendırıyordu
        }

        else {
            Bu bloğun üstündeki herhangi bir koşul sağlanmadığında bu blok çalışır.
// burda oneml olan kod blog acmak ıcın suslu parantez acıyoruz ama ıf ın kosulu -nu belırtırken normal paranteze alıyon
        }

        */
           /*Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı girin:");

        int sayi = scanner.nextInt();

        if (sayi < 0) {

            System.out.println("Negatif");


        }
        else {
            System.out.println("Pozitif veya 0");


        }





    }

}

            */
        Scanner scanner  = new Scanner(System.in);
        System.out.print("Lutfen yasınızı gırın :  ");
        int yas = scanner.nextInt();

        if (yas<18){
            System.out.println("BU mekana gıremezsın guze kardesım benım ...");

        }
else{
            System.out.println("Gec kardes gec sen bızdensın");
        }






    }}