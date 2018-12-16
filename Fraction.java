package com.company;

import java.lang.*;
import java.math.*;
class Fraction {
    private int n, d;


    public Fraction(int n, int d) throws ArithmeticException {
        if (d == 0) throw new ArithmeticException("wrong ");
        int divisor = gcd(n, d);
        this.n = n / divisor;
        this.d = d / divisor;
    }

     private static int gcd(int n, int d) {
        return (d == 0 ? n : gcd(d, n % d));
    }



    public static Fraction add(Fraction x, Fraction y) {
        return new Fraction(x.n * y.d + y.n * x.d, x.d * y.d);
    }

    public static Fraction sub(Fraction x, Fraction y) {
        return new Fraction(x.n * y.d - y.n * x.d, x.d * y.d);
    }

    public static Fraction mul(Fraction x, Fraction y) {
        return new Fraction(x.n * y.n, x.d * y.d);
    }

    public static Fraction div(Fraction x, Fraction y) {
        return new Fraction(x.n * y.d, x.d * y.n);
    }


    public String toString() {
        if (n%d == 0)
            return String.valueOf(n/d);
        else if(n > d)
            return n/d + " " + Math.abs(n%d) + "/" + Math.abs(d);
        else
            return n + "/" + d;
    }
}
