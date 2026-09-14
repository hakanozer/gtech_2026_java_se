package days_7;

public class Computer {

    int a = 10;

    // Static -> nesne üretim işlemi olmadan bir özelliği kullanma
    // static methodları tetiklerken sınıfAdı (.) operaötrü yeterlidir.
    static int b = 20;

    public static void call1() {
        int c = 40;
        System.out.println("call1 print " + b);
    }

}



