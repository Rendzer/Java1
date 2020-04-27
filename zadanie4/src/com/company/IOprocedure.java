package com.company;

import java.io.*;
import java.util.Scanner;

class IOprocedure {

    static void writeToFile(String s, File file) throws FileNotFoundException {
        PrintWriter printWriter = new PrintWriter(file);
        printWriter.println(s);
        printWriter.close();
    }

    static void readFromFile(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        String output;
        output = scanner.next();
        System.out.println(output);
    }


}
