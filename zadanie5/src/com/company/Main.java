package com.company;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String args[]) throws IOException {
        String line = "";
        BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Ilonka\\IdeaProjects\\file.txt"));
        line = file.readLine();
        Random random = new Random();
        String value = null;
        int start = 0,
                end = 0;
        //int y = random.nextInt(5);
        int y = randInt(1, 5);

        do {
            //end = start + end;
            //while (line != null) {
            //    if (!line.isEmpty()) {
            if (start + y < line.length() + 1 + 1) { // 1 - nie wiem / <=
                value = line.substring(start, start + y);
                start = start + y;      // old y value
                //y = random.nextInt(5);      // new y value
                y = randInt(1,5);
                System.out.println(value);
            } else {
                break;
            }
             //   }}


            //begin 26, end 27, length 26
        } while (pressEnterToContinue());
    }

    private static boolean pressEnterToContinue()
    {
        System.out.println(" >>Press Enter key to continue... ");
        try
        {
            System.in.read();
            return true;
        }
        catch(Exception e)
        {}
        return false;
    }

    public static int randInt(int min, int max) {

        // NOTE: This will (intentionally) not run as written so that folks
        // copy-pasting have to think about how to initialize their
        // Random instance.  Initialization of the Random instance is outside
        // the main scope of the question, but some decent options are to have
        // a field that is initialized once and then re-used as needed or to
        // use ThreadLocalRandom (if using at least Java 1.7).
        //
        // In particular, do NOT do 'Random rand = new Random()' here or you
        // will get not very good / not very random results.
        Random rand = new Random();

        // nextInt is normally exclusive of the top value,
        // so add 1 to make it inclusive
        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }

}