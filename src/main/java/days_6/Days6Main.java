package days_6;

public class Days6Main {

    static void main() {

        Address address = new Address();
        address.setTitle("Ev");
        address.setAddress("Atatürk Cad. Bostancı");
        address.setCity("İstanbul");
        address.setZipCode(34000);
        address.setNumber(10);

        Address address2 = new Address("İş", "Kemal Cad. Kadıköy", 34500, 11, "İstanbul");
        System.out.println(address2.getAddress());

        A a = new A();
        B b = new B();
        C c = new C();

        mainCall(a);
        mainCall(b);
        mainCall(c);

        Action objAction = new Action();
        // objAction.surname = "Bilmem"; // final değiştirilemez
        objAction.name = "Serkan";
        System.out.println(objAction.name);
        System.out.println(objAction.surname);

    }

    static void mainCall(Base base) {
        base.print();
    }

}
