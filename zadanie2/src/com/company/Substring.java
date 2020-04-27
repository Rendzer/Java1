package com.company;

public class Substring {
    public static void main(String[] args) { //throws NumberFormatException {
        //if (args.length == 3) {
           // try {
                int startNumber, endNumber;
                String allString, stringFragment;
                //allString = args[0];
                startNumber = Integer.parseInt(args[1]);
                endNumber = Integer.parseInt(args[2]);
                System.out.println(args[0].substring(startNumber,endNumber + 1));

                //stringFragment = args[0].substring(startNumber,endNumber);
               // System.out.println(stringFragment);
           // } catch (NumberFormatException e) {
            //    System.err.println("Podales W zlym formacie liczbe");
           // } catch (IndexOutOfBoundsException e2){
           //     System.err.println("stanowczo za dużo parametrów");
           // }

       // } else
        //    System.out
        //            .println("Za duzo parametrów, lub za malo, lub w zlej kolejnosci"
        //                    + "\n Powinno byc: String int int");

    }

}

