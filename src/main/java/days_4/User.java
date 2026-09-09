package days_4;

import java.util.Scanner;

public class User {

    // Kullanıcı Login

    /**
     * Kullanıcının login bilgilerini kontrol eder.
     *
     * @param username veritabanı içindeki kullanıcı adı
     * @param password veritabanı içindeki kullanıcı şifresi
     * @return bilgiler doğru ise true yanlış ise false döner
     */
    public boolean login(String username, String password) {
        if (username == "ali01" && password == "12345") {
            return true;
        } else {
            return false;
        }
    }

    public String[] getAddress(int userID) {
        String[] address = {"Altın şehir mah, İstanbul", "Kızılay, Ankara"};
        return address;
    }

    public String getUserName(int userID) {
        return "Ali Bilmem";
    }

    public void twoNumberCall() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen sayı -1 giriniz:");
        double number = scanner.nextDouble();

        System.out.println("Lütfen sayı -2 giriniz:");
        double number2 = scanner.nextDouble();

        System.out.println(number + number2);
        System.out.println(number - number2);
        System.out.println(number * number2);
        System.out.println(number / number2);

    }

}
