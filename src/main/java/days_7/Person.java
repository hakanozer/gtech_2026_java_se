package days_7;

public abstract class Person {

    // soyut -> gövdesiz method
    abstract long getTc();

    // kullanıcı adını soyadını
    public String getName() {
        long tc = getTc();
        if(tc == 123) {
            return "Ali Bilmem";
        }else if (tc == 456) {
            return "Veli Bilmem";
        }else {
            return "";
        }
    }

    // kullanıcı toplam hesap
    public long getTotal() {
        long tc = getTc();
        if(tc == 123) {
            return 10000;
        }else if (tc == 456) {
            return 20000;
        }else {
            return 0;
        }
    }

    // eft methodt
    public String eft(long amount) {
        long tc = getTc();
        long total = getTotal();
        total -= amount;
        if(tc == 123) {
            return tc +" Tc Nolu kişi "+ amount + " Gönderdi Kalan Tutar: " + total + " TL";
        }else if (tc == 456) {
            return tc +" Tc Nolu kişi "+ amount + " Gönderdi Kalan Tutar: " + total + " TL";
        }else {
            return "";
        }
    }

}
