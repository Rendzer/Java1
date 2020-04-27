package com.company;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOprocedure {

    static void writeToFile(String wynik, File file) throws IOException {
        Files.write(Paths.get(String.valueOf(file)), wynik.getBytes());
    }

    static void readFromFile(File file) throws IOException {
        System.out.println( Files.readAllLines(Paths.get(String.valueOf(file)), Charset.forName("UTF-8")));
    }

}
