package days_10;

public class Days10Main {

    static void main() {

        String data = "Lorem Ipsum, dizgi ve baskı endüstrisinde kullanılan mıgır metinlerdir. Lorem Ipsum, adı bilinmeyen bir matbaacının bir hurufat numune kitabı oluşturmak üzere bir yazı galerisini alarak karıştırdığı 1500'lerden beri endüstri standardı sahte metinler olarak kullanılmıştır. Beşyüz yıl boyunca varlığını sürdürmekle kalmamış, aynı zamanda pek değişmeden elektronik dizgiye de sıçramıştır. 1960'larda Lorem Ipsum pasajları da içeren Letraset yapraklarının yayınlanması ile ve yakın zamanda Aldus PageMaker gibi Lorem Ipsum sürümleri içeren masaüstü yayıncılık yazılımları ile popüler olmuştur.";

        String x = "Ali";
        String y = new String("Ali");
        String z = "Ali";

        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());

        x = "Alix"; // yeni string oluşuturulur.
        for (int i = 0; i < 100; i++) {
            x += "x"; // yeni string oluşuturulur.
        }
        System.out.println(x);

        StringBuilder sb = new StringBuilder();
        sb.append("Ali");
        sb.append("x");
        for (int i = 0; i < 100; i++) {
            sb.append("x");
        }
        System.out.println(sb.toString());

        // char dizisi
        char[] chars = data.toCharArray();
        System.out.println(chars.length);
        System.out.println(chars[4]);


        // lenght -> metin karakter sayısı
        System.out.println(data.length());

        // charAt -> string içerisindeki indexe göre karakteri verir.
        System.out.println(data.charAt(0));
        System.out.println( data.charAt(data.length() - 1) );

        // isEmpty -> string içerisinde değer yoksa true
        System.out.println(data.isEmpty());

        // indexOf -> string içerisinde aranan karakterin indexini verir. Bulamazsa -1 döner.
        System.out.println(data.indexOf("baskı"));

        // lastIndexOf -> string içerisinde aranan
        System.out.println(data.lastIndexOf("Lorem"));

        // contains -> string içerisinde aranan karakterin olup olmadığını boolean olarak döner.
        System.out.println(data.contains("Lorem"));

        String[] words = {"mıgır", "Ipsum", "numune"};
        boolean isComment = false;
        for (String word : words) {
            if (data.contains(word)) {
                isComment = false;
            } else {
                isComment = true;
            }
        }
        System.out.println("Yorum Durumu: " + isComment);

        // Equals -> string iki ifadeyi değer açısından kıyaslamak için kullanılır.
        String name1 = "Ali";
        String name2 = "Ali";
        if (name1.equals(name2)) {
            System.out.println("Eşit");
        } else {
            System.out.println("Eşit Değil");
        }


        // equalsIgnoreCase -> iki string değişkeni büyük - küçük karakter ayrımı olmaksızın kıyaslar
        String email1 = "ali@mail.com";
        String email2 = "ALi@Mail.COM";
        if (email1.equalsIgnoreCase(email2)) {
            System.out.println("E-mail Eşit");
        } else {
            System.out.println("E-mail Eşit Değil");
        }

        // compareTo -> iki string değişkeni kıyaslar. Büyükse pozitif, küçükse negatif, eşitse 0 döner.
        String name3 = "Ali";
        String name4 = "AliZ";
        if (name3.compareTo(name4) == 0) {
            System.out.println("compareTo Eşit");
        } else if (name3.compareTo(name4) > 0) {
            System.out.println("compareTo name3 büyüktür");
        } else {
            System.out.println("compareTo name4 büyüktür");
        }

        // substring -> string içerisinden belirli bir index aralığını alır.
        String dizgi = "dizgi";
        int index = data.indexOf(dizgi);
        String subString = data.substring( index, (index + dizgi.length()) );
        System.out.println(subString);

        // replace -> string içerisinde bulup değiştirir.(Herşey değişir)
        String newString = data.replace("Lorem", "*****");
        System.out.println(newString);

        // replaceFirst -> string içerisinde bulup değiştirir.(Sadece ilk bulduğu değişir)
        String newString2 = data.replaceFirst("Lorem", "*****");
        System.out.println(newString2);

        // split -> string içerisinde bellli başlı ifadeleri ayırmak için kullanılır. (Dizi döner)
        String[] splitWords = data.split(" ");
        for (String word : splitWords) {
            System.out.println(word);
        }
        // cümlelere parçala
        String[] sentences = data.split("[.!?]");
        for (String sentence : sentences) {
            System.out.println(sentence);
        }

        String splitData = "100;Ali;Bilmem;ali@mail.com;12345";
        String[] arr = splitData.split(";");
        System.out.println("ID: " + arr[0]);
        System.out.println("Name: " + arr[1]);
        System.out.println("Surname: " + arr[2]);
        System.out.println("Email: " + arr[3]);
        System.out.println("Password: " + arr[4]);

        // toLowerCase -> string içerisindeki tüm karakterleri küçük yapma
        System.out.println(data.toLowerCase());

        // toUpperCase -> string içerisindeki tüm karakterleri büyük yapma
        System.out.println(data.toUpperCase());

        // trim -> string içerisinde sağında yada solunda oluşan boşlukları temizler
        String trimData = "   Ali Bilmem      ";
        System.out.println(trimData.trim());

        // repeat -> string belirlenen sayıda ekleme yapar
        String repeatData = "Ali";
        System.out.println(repeatData.repeat(5));

        // valueOf -> herhangi bir nesneyi Stringe dönüşyürmek için kullanılır.
        int number = 100;
        String numberString = String.valueOf(number);
        String numberString2 = "" + number; // Stringe dönüştürmenin bir diğer yolu
        System.out.println(numberString);


        // format -> string içerisinde belirli bir formatta yazdırmak için kullanılır.
        double doubleNumber = 100.123456789;
        String formatString = String.format("%.2f", doubleNumber);
        System.out.println(formatString);

        // join -> belirtilen ayırıcıyı kullanarak item değerlerini tek tek birleştirir.
        String[] items = {"Ali", "Bilmem", "12345"};
        String joinString = String.join(" ", items);
        System.out.println(joinString);

        double ondalik = 74.15;
        System.out.println( Math.round(ondalik) ); // yakınlığa göre yubarlama yapar
        System.out.println( Math.floor(ondalik) ); // aşağı doğru yuvarlar
        System.out.println( Math.ceil(ondalik) ); // yukarı doğru yuvarlar

    }

}
