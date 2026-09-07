package days_4;

public class Days4Main {

    static void main() {

        // if karar kontrol yapısı
        // karar kontrol operatörleri
        // ==, !=, >, <, >=, <=
        boolean status = false;

        int a = 10;
        int b = 11;

        // ==, sol taraftaki değer ile sağ taraftaki değer eşit mi?
        status = a == b;
        System.out.println("== operatörü ile a ve b eşit mi? : " + status);

        // !=, sol taraftaki değer ile sağ taraftaki değer değiş değil ise.
        status = a != b;
        System.out.println("!= operatörü ile a ve b eşit değil mi? : " + status);

        status = a > b;
        System.out.println("> operatörü ile a ve b eşit mi? : " + status);

        status = a < b;
        System.out.println("< operatörü ile a ve b eşit mi? : " + status);

        int age = 18;
        status = age >= 18;
        System.out.println(">= operatörü ile age ve 18 eşit mi? : " + status);

        status = a <= b;
        System.out.println("<= operatörü ile a ve b eşit mi? : " + status);

        // logical operators
        // &&, ||, !
        // && -> and, sol tarafaki koşul ile sağ taraftaki koşul sağlandı mı?
        status = (age >= 18) && (a > b);
        System.out.println("&& operatörü ile age ve a koşulları sağlandı mı? : " + status);

        // || -> or, sol tarafaki koşul veya sağ taraftaki koşul sağlandı mı?
        status = (age >= 18) || (a > b);
        System.out.println("|| operatörü ile age ve a koşulları sağlandı mı? : " + status);

        // ! değilse
        status = !(a > b && age >= 18);
        System.out.println("! operatörü ile age 18'den büyük değil mi? : " + status);

        boolean button = false;
        button = !(button);
        System.out.println("button: " + button);

        // if karar kontrol
        /*
        * if (şart) {
        *   // şart sağlanırsa yapılacak işlemler
        * }else {
        *   // şart sağlanmazsa yapılacak işlemler
        * }
        * */

        if (age >= 18) {
            System.out.println("Yaşınız 18'den büyük veya eşit.");
        } else {
            System.out.println("Yaşınız 18'den küçük.");
        }

        if (a > 9 && b < 100) {
            System.out.println("a > 9 ve b < 100");
        }else {
            System.out.println("a > 9 ve b < 100 değil");
        }

        String email = "ali@mail.com";
        String password = "123456";

        if (email == "ali@mail.com" && password == "123456") {
            System.out.println("Giriş başarılı");
        }else {
            System.out.println("Giriş başarısız");
        }

        // else if
        String name = "Ahmet";
        String surname = "Bilmem";
        String username = "ahmet01";

        if (name == "") {
            System.out.println("Lütfen adınızı giriniz.");
        } else if (surname == "") {
            System.out.println("Lütfen soyadınızı giriniz.");
        } else if (username == "") {
            System.out.println("Lütfen kullanıcı adınızı giriniz.");
        } else {
            System.out.println("Kayıt başarılı");
        }

        // Bu gün günlerden ne?
        // Pazartesi
        String day = "Pazartesi";
        switch (day) {
            case "Pazartesi":
                System.out.println("Bugün Pazartesi");
                break;
            case "Salı":
                System.out.println("Bugün Salı");
                break;
            case "Çarşamba":
                System.out.println("Bugün Çarşamba");
                break;
            case "Perşembe":
                System.out.println("Bugün Perşembe");
                break;
            case "Cuma":
                System.out.println("Bugün Cuma");
                break;
            case "Cumartesi":
                System.out.println("Bugün Cumartesi");
                break;
            case "Pazar":
                System.out.println("Bugün Pazar");
                break;
            default:
                System.out.println("Geçersiz gün");
                break;
        }

        User objUser = new User();
        // nesne (objUser) içindeki yeteneklere . operatörü ile erişebiliriz.
        boolean userLoginStaus = objUser.login("ali01", "12345");
        if (userLoginStaus) {
            System.out.println("Kullanıcı Giriş Başarılı");
        }else {
            System.out.println("Kullanıcı Giriş Başarısız");
        }

        String[] userAddress = objUser.getAddress(100);
        for (String address : userAddress) {
            System.out.println("User Address: " + address);
        }

        String userName = objUser.getUserName(100);
        System.out.println("User Name: " + userName);
        

    }

}
