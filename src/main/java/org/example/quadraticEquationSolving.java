package org.example;

/**
 * Hello world!
 *
 */
public class  quadraticEquationSolving {

//x^2+2ab+c
    // найти дискриминант
    public static double discriminant(int a,  int b, int c) {
        double disc = b * b - 4 * a * c;

        return disc;
    }
    // определить путь решения
    public static void calculation(double disc) {
        if (disc > 0) {
            System.out.println("два корня");

        } else if (disc == 0) {
            System.out.println("один корень");
        }
        else {
            System.out.println("Решения нет");
        }
    }
    //основной метод
    public static void main (String[] args){
        int a = 1, b = 2, c = 3;
        double disc = discriminant(a, b, c);
        calculation(disc);
    }
    }