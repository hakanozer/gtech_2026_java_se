package days_9;

import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class ControlFile {

    File file;

    public ControlFile() {
        String path = "docs";
        // folder create
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdir(); // folder oluştur
        }
        file = new File(path + "/" + fileNameDate() + ".txt");
    }

    public ControlFile(String fileName) {
        String path = "docs";
        // folder create
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdir(); // folder oluştur
        }
        file = new File(path + "/" + fileName + ".txt");
    }


    // file create
    public void createFile() {
        if (file.exists()) { // dosya daha önceden oluşturulmuş mu?
            // System.out.println("Dosya zaten var");
        }else {
            try {
                file.createNewFile();
            }catch (Exception e) {
                System.err.println("Dosya oluşturulamadı");
            }
        }
    }

    // Dosya içerisine veri yazma
    public void writeInFileTxt(String data) {
        // os info
        // System.out.println(System.getProperty("os.name"));
        // Enter -> windows -> \r\n, mac -> \n
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(data + System.lineSeparator());
            fw.close();
        } catch (Exception e) {
            System.err.println("Dosya içerisine veri yazılamadı");
        }
    }


    // dosya içeriğini okuma
    public ArrayList<String> readFileTxt() {
        ArrayList<String> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                list.add(scanner.nextLine());
            }
            scanner.close();
        } catch (Exception e) {
            System.err.println("Dosya okunamadı");
        }
        return list;
    }

    public String fileNameDate() {
        String fileName = "";
        Calendar calender = Calendar.getInstance();
        int day = calender.get(Calendar.DAY_OF_MONTH);
        int month = calender.get(Calendar.MONTH) + 1; // Month is 0-based
        int year = calender.get(Calendar.YEAR);
        String monthSt = month > 0 && month < 10 ? "0" + month : month + "";
        String daySt = day > 0 && day < 10 ? "0" + day : day + "";
        fileName = daySt + "_" + monthSt + "_" + year;
        return fileName;
    }

    // file delete
    public void deleteFile() {
        if (file.exists()) {
            file.delete();
        }
    }


}
