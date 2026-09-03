package days_2;

import java.util.Scanner;

public class MainScanner {

    static void main(String[] args) {

        // kullanıcıdan terminalde / consoledan veri almak için kullanılır.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adınızı giriniz: ");
        String name = scanner.nextLine();

        System.out.println("Soyadınızı giriniz: ");
        String surname = scanner.nextLine();

        System.out.println("Adınız: " + name);
        System.out.println("Soyadınız: " + surname);

    }

}
