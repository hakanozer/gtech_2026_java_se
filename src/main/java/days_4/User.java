package days_4;

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

}
