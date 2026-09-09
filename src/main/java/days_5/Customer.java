package days_5;

import java.util.Scanner;

public class Customer {

    String data1 = "data1"; // Default
    public String data2 = "data2"; // Public
    private String data3 = "data3"; // Private

    // public -> farklı sınıflar ve projedeki her yerden görün
    public void call1() {
        System.out.println(data3);
        System.out.println("call1 call");
    }

    // protected -> farklı sınıflar ve projedeki her yerden görünmez, sadece aynı paket içindeki sınıflardan ve alt sınıflardan erişilebilir
    protected void call2() {
        call3();
        System.out.println("call2 call");
    }

    // private -> sadece aynı sınıf içinden erişilebilir, farklı sınıflardan erişilemez
    private void call3() {
        System.out.println("call3 call");
    }

    // default -> protected davranışı ile aynı özelliğe sahiptir.
    void call4() {
        System.out.println("call4 call");
    }

    public Product[] addProduct() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen ürün sayınızı giriniz");
        int productNumber = scanner.nextInt();
        scanner.nextLine();

        Product[] products = new Product[productNumber];
        for (int i = 0; i < productNumber; i++) {

            System.out.println("Lütfen "+(i+1)+". ürün başlığını giriniz");
            String title = scanner.nextLine();
            System.out.println("Lütfen "+(i+1)+". ürün fiyatını giriniz");
            int price = scanner.nextInt();
            System.out.println("Lütfen "+(i+1)+". ürün açıklamasını giriniz");
            scanner.nextLine();
            String description = scanner.nextLine();

            Product product = new Product();
            product.setTitle(title);
            product.setPrice(price);
            product.setDescription(description);

            products[i] = product;

        }
        return products;
    }


}
