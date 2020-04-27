package com.company;

public class Polynomial {
    public static void main(String[] args) {

        int a, b, c;
        double delta;

        if (args.length < 3) {
            System.out.println("Too less args.");
            return;
        }

        if (args.length > 3) {
            System.out.println("Too many args");
            return;
        }

        try {
            a = Integer.parseInt(args[0]);
            b = Integer.parseInt(args[1]);
            c = Integer.parseInt(args[2]);

            System.out.println("Polynomial: " + a + "x^2 + " + b + "x + " + c);

            if (a != 0) {
                delta = b * b - 4 * a * c;
                System.out.println("delta = " + delta);

                if (delta > 0) {
                    double x1, x2;
                    x1 = (Math.sqrt(delta) - b) / 2 * a;
                    x2 = (-Math.sqrt(delta) - b) / 2 * a;
                    System.out.println("quadratic function, delta > 0, two roots:\nx1 = " + x1 + "\nx2 = " + x2);
                } else if (delta == 0) {
                    double x;
                    x = (-b) / 2 * a;
                    System.out.println("quadratic function, double root:\nx = " + x);
                } else {
                    double x, x_i;
                    x = -b / 2 * a;
                    x_i = Math.sqrt(-delta) / 2 * a;
                    System.out.println("quadratic function, two complex elements:\nx1 = " + x + "+" + x_i + "i" + "\nx2 = " + x + "-" + x_i + "i");
                }
            } else {
                double x;
                if (b != 0) {
                    x = (-c) / b;
                    System.out.println("linear function: x = " + x);
                }
                else {
                    System.out.println("Dividing by zero is not allowed!");
                }
            }
        } catch (NumberFormatException error) {
            System.out.println("Args must be int int int");
        }
    }
}

