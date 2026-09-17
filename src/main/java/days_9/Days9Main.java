package days_9;

import java.util.ArrayList;
import java.util.Scanner;

public class Days9Main {

    static void main() {

        // ControlFile controlFile = new ControlFile();
        // controlFile.createFile();

        // controlFile.writeInFileTxt("Not-1");
        // ArrayList<String> list = controlFile.readFileTxt();
        // System.out.println(list);

        // kullanıcıdan dosya adını al, - ise tarih değeri ile oluşsun
        // sonsuz kere veri girişi ve - ise data alımı duracak.
        // girilen tüm verileri raporla

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dosya adını giriniz (tarih için -): ");
        String fileName = scanner.nextLine();
        ControlFile controlFile;
        if (fileName.equals("-")) {
            controlFile = new ControlFile();
        } else {
            controlFile = new ControlFile(fileName);
        }
        controlFile.createFile();

        while(true) {
            System.out.println("Veri giriniz (- ile çıkış): ");
            String input = scanner.nextLine();
            if (input.equals("-")) {
                break;
            }
            controlFile.writeInFileTxt(input);
        }

        ArrayList<String> list = controlFile.readFileTxt();
        System.out.println(list);

        System.out.println("Dosya silinsin mi? (e/h): ");
        String deleteInput = scanner.nextLine();
        if (deleteInput.equals("e")) {
            controlFile.deleteFile();
            System.out.println("Dosya silindi.");
        }

    }

}
