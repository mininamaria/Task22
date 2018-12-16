package com.company;

import static com.company.Fraction.*;

public class Main {

    public static void main(String[] args) {


		try {
			Fraction a = new Fraction(4, 2);
			Fraction b = new Fraction(1, 2);
			Fraction c = new Fraction(2, 9);
			System.out.println(c.toString() + "+" + b.toString() + "=" + add(c, b));
			System.out.println(a.toString() + "-" + b.toString() + "=" + sub(a, b));
			System.out.println(b.toString() + "-" + a.toString() + "=" + sub(b, a));
			System.out.println(c.toString() + "*" + b.toString() + "=" + mul(c, b));
			System.out.println(a.toString() + ":" + b.toString() + "=" + div(a, b));

		} catch (ArithmeticException e) {
			System.out.println("\n dividing on 0");
		}

    }
}
