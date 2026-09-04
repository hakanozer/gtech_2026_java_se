package days_3;

import java.util.Date;

public class Days3Main {

    static void main(String[] args) {

        // Tür Dönüşümleri
        String ageSt = "30";
        int age = Integer.parseInt(ageSt);
        System.out.println("Age: " + age);

        // Şimdiki zaman ile doğum tarihi arassındaki yaş farkı
        String dateOfBirth = "1995-05-12";
        Date now = new Date();
        String[] dateParts = dateOfBirth.split("-");
        int birthYear = Integer.parseInt(dateParts[0]);
        int currentYear = now.getYear() + 1900; // getYear() returns the year minus 1900
        int ageDifference = currentYear - birthYear;
        System.out.println("Age difference: " + ageDifference);

        // String to Ondalik
        String priceSt = "12345.67";
        double price = Double.parseDouble(priceSt);
        System.out.println("Price: " + price);

        // String to Boolean
        String isActiveSt = "true";
        boolean isActive = Boolean.parseBoolean(isActiveSt);
        System.out.println("Is Active: " + isActive);

        // String to int
        String numSt = "44";
        // istisnalar - try catch
        // kullanıcıdan veri alırken, database işlemlerinde, servisler api,
        try {
            // hata olma olasılığı olan kodlar
            int num = Integer.parseInt(numSt);
            System.out.println("Number: " + num);
        }catch (Exception e) {
            // hata olduğunda çalışacak kodlar
            System.err.println("Lütfen sadece tam sayılar giriniz.");
        }

        System.out.println("This line call");

    }


}
