package days_3;

import java.util.Scanner;

public class DiziMain {

    static void main() {

        // diziler
        // tür diziAdi = {};
        String[] users = {"Ali", "Erkan", "Mehmet"};
        String[] cities = {"İstanbul", "Ankara", "İzmir", "Bursa", "Trabzon"};

        // item değerini değiştirme
        cities[0] = "Adana";

        // index - 0 dan başlar
        System.out.println(cities[0]);
        System.out.println(cities[4]);

        // dizi eleman sayısı - length
        System.out.println(cities.length);

        // dizi eleman sayısı belirtilerek oluşturma
        String[] days = new String[7];
        days[0] = "Pazartesi";
        days[1] = "Salı";
        days[2] = "Çarşamba";
        days[3] = "Perşembe";
        days[4] = "Cuma";
        days[5] = "Cumartesi";
        days[6] = "Pazar";

        // haftanın kaçıncı günü olduğunu bulma
        Scanner scanner = new Scanner(System.in);
        System.out.println("Haftanın kaçıncı günündesiniz? (1-7)");
        try {
            int day = scanner.nextInt(); // kullanıcıdan gün numarasını alıyoruz
            System.out.println("Bugün: " + days[day - 1]);
        }catch (Exception e) {
            System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz.");
        }


        // loop
        // tekrarlı işlerin yapılmasında kullanılır.
        for( int i = 0; i < 10; i++ ) {
            System.out.println("i: " + i);
        }

        for ( int i = 0; i < days.length; i++  ) {
            System.out.println( days[i] );
        }

        System.out.println("------------------------");
        // forEach
        for( String day : days ) {
            System.out.println(day);
        }

        System.out.println("------------------------");
        for ( String day : days ) {
            if (day == "Salı") {
                continue; // bu adımı atla, diğerlerine devam et.
            }
            System.out.println("Gün: " + day);
            if (day == "Cuma") {
                System.out.println("Cuma günü Kargo Saat 15'te olacak");
                break; // for döngüsünü artık durdur.
            }
        }


    }
}
