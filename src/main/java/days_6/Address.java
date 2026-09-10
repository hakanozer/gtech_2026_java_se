package days_6;

public class Address {

    private String title;
    private String address;
    private int zipCode;
    private int number;
    private String city;

    // kurucu methodlar
    public Address() {}

    public Address(String title, String address, int zipCode, int number, String city) {
        this.title = title;
        this.address = address;
        this.zipCode = zipCode;
        this.number = number;
        this.city = city;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
