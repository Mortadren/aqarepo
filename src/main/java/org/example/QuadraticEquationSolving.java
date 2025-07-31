package org.example;


import java.util.Arrays;

public class QuadraticEquationSolving {

//ax^2+bx+c
    // найти дискриминант
    public static double discriminant(int a,  int b, int c) {
        return  b * b - 4 * a * c;

    }
    // определить путь решения
    public static double[] calculation(int a,  int b, int c) {
        double disc = discriminant(a, b, c);
        if (disc > 0) {
            double x1 = (-b + Math.sqrt(disc)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(disc)) / (2.0 * a);
//            System.out.println("В  уравнении два корня: " + x1 +" и " + x2);
            return new double[]{x1, x2};

        } else if (disc == 0) {
            double x = (double) -b / (2 * a);
//            System.out.println("В уравнении один корень:" + x);
            return new double[]{x};
        }
        else {
            return new double[]{};
        }
    }
    //основной метод
    public static void main (String[] args){
        int a = 1, b = 4, c = 4;
        System.out.println("Корни уравнения: " + Arrays.toString(calculation(a, b, c)));
    }
    }