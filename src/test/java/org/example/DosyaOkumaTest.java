package org.example;

import java.io.FileNotFoundException;
import java.io.IOException;
import org.junit.Test;

public class DosyaOkumaTest {


    @Test(expected = FileNotFoundException.class)
    public void testReadFromFile_FileNotFound() throws FileNotFoundException, IOException {
        String filePath = "olmayandosya.txt"; // var olmayan bir dosya yolu
        DosyaOkuma.readFromFile(filePath);
    }

    @Test(expected = IOException.class)
    public void testReadFromFile_IOError() throws FileNotFoundException, IOException {
        String filePath = "hataliformat.bin"; // geçersiz dosya biçimi
        DosyaOkuma.readFromFile(filePath);
    }
}
