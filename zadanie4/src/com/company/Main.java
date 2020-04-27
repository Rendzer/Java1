package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.SecureRandom;
import java.util.Random;

public class Main {

        private static final String CHAR_LOWER = "abcdefghijklmnopqrstuvwxyz";
        private static final String CHAR_UPPER = CHAR_LOWER.toUpperCase();
        private static final String NUMBER = "0123456789";

        private static final String DATA_FOR_RANDOM_STRING = CHAR_LOWER + CHAR_UPPER + NUMBER;
        private static SecureRandom random = new SecureRandom();

        public static void main(String[] args) throws IOException {

            String randomString = generateRandomString(1000);

            long    startTime,
                    endTime,
                    totalTimeIO,
                    totalTimeNIO;

            startTime = System.nanoTime();
            IO(randomString);
            endTime = System.nanoTime();

            totalTimeIO = endTime - startTime;

            startTime = System.nanoTime();
            NIO(randomString);
            endTime= System.nanoTime();

            totalTimeNIO = endTime - startTime;

            if (totalTimeIO == totalTimeNIO) {
                System.out.println("The same time, IO:" + totalTimeIO + ", " + "NIO: " + totalTimeNIO);
            } else if (totalTimeIO < totalTimeNIO) {
                System.out.println("IO < NIO, IO:" + totalTimeIO + ", " + "NIO: " + totalTimeNIO);
            } else {
                System.out.println("IO > NIO, IO:" + totalTimeIO + ", " + "NIO: " + totalTimeNIO);
            }


        }

        public static String generateRandomString(int length) {
            if (length < 1) throw new IllegalArgumentException();

            StringBuilder sb = new StringBuilder(length);
            for (int i = 0; i < length; i++) {

                // 0-62 (exclusive), random returns 0-61
                int rndCharAt = random.nextInt(DATA_FOR_RANDOM_STRING.length());
                char rndChar = DATA_FOR_RANDOM_STRING.charAt(rndCharAt);

                // debug
                //System.out.format("%d\t:\t%c%n", rndCharAt, rndChar);

                sb.append(rndChar);

            }

            return sb.toString();
        }

        public static void IO(String rand) throws FileNotFoundException {
            IOprocedure.writeToFile(rand, new File("IO.txt"));
            System.out.println("IO:");
            IOprocedure.readFromFile(new File("IO.txt"));
        }

        public static void NIO(String rand) throws IOException {
            NIOprocedure.writeToFile(rand, new File("NIO.txt"));
            System.out.println("NIO:");
            NIOprocedure.readFromFile(new File("NIO.txt"));
        }

}
