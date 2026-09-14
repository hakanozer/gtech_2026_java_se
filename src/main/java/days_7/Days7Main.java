package days_7;

public class Days7Main {

    static void main() {

        Computer objComputer = new Computer();
        System.out.println(objComputer.a);

        Computer.b = 30;
        System.out.println(Computer.b);

        Computer.call1();

        // Customer
        Customer customer = new Customer();
        String name = customer.getName();
        long total = customer.getTotal();
        String eftStatus = customer.eft(100);

        System.out.println("Name: " + name);
        System.out.println("Total: " + total);
        System.out.println("EFT Status: " + eftStatus);

    }

}
