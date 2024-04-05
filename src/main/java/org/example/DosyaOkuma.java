package org.example;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DosyaOkuma {

    public static String readFromFile(String filePath) throws FileNotFoundException, IOException {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (FileNotFoundException e) {
            throw new FileNotFoundException("Dosya bulunamadı: " + filePath);
        } catch (IOException e) {
            throw new IOException("Dosya okunurken bir hata oluştu: " + e.getMessage());
        }
        return content.toString();
    }

    public static void main(String[] args) {
        String filePath = "olmayandosya.txt"; // var olmayan bir dosya yolu
        try {
            String fileContent = readFromFile(filePath);
            System.out.println("Dosya içeriği: \n" + fileContent);
        } catch (FileNotFoundException e) {
            System.err.println("Hata: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Hata: " + e.getMessage());
        }
    }
}
