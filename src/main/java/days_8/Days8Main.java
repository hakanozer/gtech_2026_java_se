package days_8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Days8Main {

    static void main() {

        Action<String> action = new Action();
        action.doAction("Bu bir generic type'dır");

        // ArrayList
        ArrayList<String> users = new ArrayList<>();

        // elemen ekleme
        users.add("Serkan");
        users.add("Ali");
        users.add("Veli");
        users.add("Fatma");
        users.add("Ahmet");
        users.add("Kemal");

        // indexe göre ekleme
        users.add(2, "Mehmet");

        // set - değiştirme
        users.set(2, "Kaan");

        // remove - silme
        // users.remove(4);
        // users.remove("Ahmet");

        // size - boyut
        System.out.println(users.size());

        // Tek tek itemları yazdırma
        System.out.println("--------------------------");
        for (int i = 0; i < users.size(); i++) {
            System.out.println(users.get(i));
        }

        System.out.println("--------------------------");
        for (String user : users) {
            System.out.println(user);
        }
        System.out.println("--------------------------");

        // Contains - içeriyor mu
        System.out.println(users.contains("Ali"));

        // indexOf - index
        System.out.println(users.indexOf("Ali"));

        // tüm elemanları silme
        // users.clear();

        // Eleman getirme
        // System.out.println(users.get(2));
        System.out.println(users);


        // Customer - ArrayList
        ArrayList<Customer> customers = new ArrayList<>();

        Customer cs1 = new Customer("Ali", "Yılmaz", "ali.yilmaz@mail.com", "Ali123");
        Customer cs2 = new Customer("Ayşe", "Kaya", "ayse.kaya@mail.com", "Ayse456");
        Customer cs3 = new Customer("Mehmet", "Demir", "mehmet.demir@mail.com", "Mehmet789");
        Customer cs4 = new Customer("Zeynep", "Çelik", "zeynep.celik@mail.com", "Zeynep321");
        Customer cs5 = new Customer("Ahmet", "Şahin", "ahmet.sahin@mail.com", "Ahmet654");
        Customer cs6 = new Customer("Elif", "Aydın", "elif.aydin@mail.com", "Elif987");
        Customer cs7 = new Customer("Mustafa", "Arslan", "mustafa.arslan@mail.com", "Mustafa246");
        Customer cs8 = new Customer("Fatma", "Öztürk", "fatma.ozturk@mail.com", "Fatma135");
        Customer cs9 = new Customer("Emre", "Yıldız", "emre.yildiz@mail.com", "Emre852");
        Customer cs10 = new Customer("Buse", "Koç", "buse.koc@mail.com", "Buse741");

        customers.add(cs1);
        customers.add(cs2);
        customers.add(cs3);
        customers.add(cs4);
        customers.add(cs5);
        customers.add(cs6);
        customers.add(cs7);
        customers.add(cs8);
        customers.add(cs9);
        customers.add(cs10);
        customers.add(cs10);
        customers.add(cs10);

        for (Customer customer : customers) {
            System.out.println("Name: " + customer.getName() + ", Surname: " + customer.getSurname() + ", Email: " + customer.getEmail() + ", Password: " + customer.getPassword());
        }

        System.out.println(customers);

        System.out.println("--------------------------");

        // Bezersiz verilerin saklanması
        Set<String> set = new HashSet<>();

        String serkan = "Serkan";
        String ali = "Ali";
        String veli = "Veli";
        String fatma = "Fatma";
        String ahmet = "Ahmet";
        String kemal = "Kemal";

        System.out.println("Ali : " + ali.hashCode());
        System.out.println("Serkan : " + serkan.hashCode());
        System.out.println("Veli : " + veli.hashCode());
        System.out.println("Fatma : " + fatma.hashCode());
        System.out.println("Ahmet : " + ahmet.hashCode());
        System.out.println("Kemal : " + kemal.hashCode());

        System.out.println("--------------------------");

        set.add("Serkan");
        set.add("Ali");
        set.add("Veli");
        set.add("Fatma");
        set.add("Ahmet");
        set.add("Kemal");
        set.add("Serkan");
        set.add("Ali");
        set.add("Fatma");

        System.out.println(set);

        System.out.println("--------------------------");
        // Sıralama algoritması eklediğin gibi
        // Benzersizlik mevcut
        Set<String> setLinked = new LinkedHashSet<>();

        setLinked.add("Serkan");
        setLinked.add("Ali");
        setLinked.add("Veli");
        setLinked.add("Fatma");
        setLinked.add("Ahmet");
        setLinked.add("Kemal");
        setLinked.add("Serkan");
        setLinked.add("Ali");
        setLinked.add("Fatma");

        System.out.println(setLinked);

    }

}
