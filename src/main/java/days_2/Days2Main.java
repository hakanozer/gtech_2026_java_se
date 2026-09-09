package days_2;

import days_5.Customer;

public class Days2Main {

    // Tek satırlı açıklama
    /*
    Bu
    Çok
    satırlı
    açıklama
    */

    // Main Metodu
    // Uygulama çalıştırıldığında ilk çalışacak kod gövdesidir.
    static void main(String[] args) {

        // String - Karakter katarı
        // Stringler çift tırnak içinde yazılır ve karakterlerin bir dizisini temsil eder.
        // Ad, soyadı, adresi, şehri, ürün adı
        String name = "Ali";
        name = "Erkan";
        String data = "";

        String surname = "Kaya";
        // alinin istanbul adresi
        String aliIstanbulAddress = "İstanbul";

        int ageInSt = 25;

        // print alma
        String join = name + " " + surname + " " + aliIstanbulAddress + " " + ageInSt;
        System.out.println(join);

        String stAge = "30";
        String userClass = "4";
        String joinAgeClass = stAge + userClass;
        System.out.println(joinAgeClass);

        // tam sayılar - int
        // matematiksel işlemlere uygun olan değerler
        int age = 307;
        int num1 = 455;
        int num2 = 23;
        int sum = num1 + num2;
        System.out.println(sum);

        // küçük tam sayı değerleri
        byte b1 = 127;

        int intMax = Integer.MAX_VALUE;
        // büyük tam sayı değerleri - long

        long num3 = 9223372036854775807L;


        // ondalıklı değerler
        double dSum = num1 + 100.5;
        double ondalik1 = 1234534.34;
        double ondalik2 = 1223453423.35;
        double sumOndalik = ondalik1 / ondalik2;
        System.out.println(sumOndalik);
        System.out.println(dSum);
        double max = Double.MAX_VALUE;

        // küçük ondalıklı değerler
        float floatMax = Float.MAX_VALUE;
        float fSum = 1234534.34f;

        // boolean değerler
        boolean status1 = true;
        boolean status2 = false;
        System.out.println(status1);
        System.out.println(status2);

        if (status1) {
            System.out.println("true");
        }else {
            System.out.println("false");
        }


        Customer customer = new Customer();
        customer.call1();
        System.out.println(customer.data2);


    }

}
