public class Veritipleri {
    public static void main(String[] args) {
        // bu derste ılkel tamsayı verı tıplerını goruce
         /*  int a = 4;
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

byte b=100;
        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        short c =200;
        System.out.println(Short.MAX_VALUE);
        System.out.println(Short.MIN_VALUE);
long d = 300;
System.out.println(Long.MAX_VALUE);
System.out.println(Long.MIN_VALUE);   */


        // byte -->short -- int--loong farklı verı tıplerınde ıslem yaparke bazen cevırmke lazım normlade java kendısı de cevırıyor da zaten burda en genel olan byte

//short j= 1000;
//int i =(j/ 2);
//System.out.println(i);
// burda otoomatık cevırdı aslında  ama bazen cevırmıyor
//byte a=100;
//byte b = (a/2)
// burda gordugun gıbı uyarı verdı bu donusmu bızım yapmamız lazım bazı kayıplar olabılır onu dıyor

        byte a=100;
        byte b = (byte)(a/2);
        System.out.println(b);
// degerlerı tıpıne bakıyor ve soldan saga dogru donusturme yapıyor

        short i =200;
        byte j=200;
        int k= 4;
        long d= i+j+k;
        // burda sorun cıkmadı cunku soldan saga dogru otonmatık donusuum oluyor
        System.out.println(d);
        //genemlde ınt verı tıpını kullanıyoruz buyuk projeklerde long kulanıyoruzz


    }
}
