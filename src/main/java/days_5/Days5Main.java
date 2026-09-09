package days_5;

public class Days5Main {

    static void main() {

        Customer customer = new Customer();
        customer.call1();
        customer.call2();
        System.out.println(customer.data1);

        User u1 = new User();
        u1.setId(1);
        u1.setName("John");
        u1.setSurname("Doe");
        u1.setEmail("john@mail.com");

        User u2 = new User();
        u2.setId(2);
        u2.setName("Ali");
        u2.setSurname("Bilmem");
        u2.setEmail("ali@mail.com");

        User[] users = {u1, u2};
        for (User user : users) {
            System.out.println(user.getId() + " " + user.getName() + " " + user.getSurname() + " " + user.getEmail());
        }

        Product[] products = customer.addProduct();
        for (Product product : products) {
            System.out.println(product.getTitle() + " " + product.getPrice() + " " + product.getDescription());
        }

    }
}
