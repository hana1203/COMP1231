package polymorphism.p3;
/*
. Modify the RationalNumber class from Chapter 5 so that it implements the
Comparable interface. To perform the comparison, compute an equivalent
floating point number from the numerator and denominator for both
RationalNumber objects, and then compare them using a tolerance of
0.0001. Write a main driver to test your modifications.
 */
//Real number = Rational Number + Irrational Number 실수는 유리수와 무리수의 집합이다.
//fraction 분수 reciprocal 역수
//numerator 위에있는 윗수(분자) denominator 아래있는 아랫수(분모)

public class RationalNumber implements Comparable {
    private int numerator, denominator;
    //-----------------------------------------------------------------
    //  Constructor: Sets up the rational number by ensuring a nonzero
    //  denominator and making only the numerator signed.
    //-----------------------------------------------------------------
    public RationalNumber(int numer, int denom)
    {
        if (denom == 0)
            denom = 1;
        // Make the numerator "store" the sign
        if (denom < 0)
        {
            numer = numer * -1;
            denom = denom * -1;
        }
        numerator = numer;
        denominator = denom;
        reduce(); }

    //-----------------------------------------------------------------
    //  Returns the numerator of this rational number.
    //-----------------------------------------------------------------
    public int getNumerator()
    {
        return numerator;
    }

    //-----------------------------------------------------------------
    //  Returns the denominator of this rational number.
    //-----------------------------------------------------------------
    public int getDenominator()
    {
        return denominator;
    }

    //-----------------------------------------------------------------
    //  Returns the reciprocal of this rational number.
    //-----------------------------------------------------------------
    public RationalNumber reciprocal() //역수
    {
        return new RationalNumber(denominator, numerator);
    }

    //-----------------------------------------------------------------
    //  Adds this rational number to the one passed as a parameter.
    //  A common denominator is found by multiplying the individual
    //  denominators.
    //-----------------------------------------------------------------
    public RationalNumber add(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator(); //공통분모
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int sum = numerator1 + numerator2;
        return new RationalNumber(sum, commonDenominator);
    }

    //-----------------------------------------------------------------
    //  Subtracts the rational number passed as a parameter from this
    //  rational number.
    //-----------------------------------------------------------------
    public RationalNumber subtract(RationalNumber op2)
    {
        int commonDenominator = denominator * op2.getDenominator();
        int numerator1 = numerator * op2.getDenominator();
        int numerator2 = op2.getNumerator() * denominator;
        int difference = numerator1 - numerator2;
        return new RationalNumber(difference, commonDenominator);
    }

    //-----------------------------------------------------------------
    //  Multiplies this rational number by the one passed as a
    //  parameter.
    //-----------------------------------------------------------------
    public RationalNumber multiply(RationalNumber op2)
    {
        int numer = numerator * op2.getNumerator();
        int denom = denominator * op2.getDenominator();
        return new RationalNumber(numer, denom);
    }

    //-----------------------------------------------------------------
    //  Divides this rational number by the one passed as a parameter
    //  by multiplying by the reciprocal of the second rational.
    //-----------------------------------------------------------------
    public RationalNumber divide(RationalNumber op2)
    {
        return multiply(op2.reciprocal());
    }

    //-----------------------------------------------------------------
    //  Determines if this rational number is equal to the one passed
    //  as a parameter. Assumes they are both reduced.
    //-----------------------------------------------------------------
    public boolean isLike(RationalNumber op2)
    {
        return (numerator == op2.getNumerator() &&
                denominator == op2.getDenominator());
    }

    //-----------------------------------------------------------------
    //  Returns this rational number as a string.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result;
        if (numerator == 0)
            result = "0";
        else
        if (denominator == 1)
            result = numerator + "";
        else
            result = numerator + "/" + denominator;
        return result;
    }

    //-----------------------------------------------------------------
    //  Reduces this rational number by dividing both the numerator
    //  and the denominator by their greatest common divisor.
    //-----------------------------------------------------------------
    private void reduce()
    {
        if (numerator != 0)
        {
            int common = gcd(Math.abs(numerator), denominator);
            numerator = numerator / common;
            denominator = denominator / common;
        }
    }

    //-----------------------------------------------------------------
    //  Computes and returns the greatest common divisor of the two
    //  positive parameters. Uses Euclid’s algorithm.
    //-----------------------------------------------------------------
    private int gcd(int num1, int num2)
    {
        while (num1 != num2)
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        return num1;
    }

    private double TOLERANCE = 0.0001;
    @Override
    public int compareTo(Object obj) {
        int result;
        RationalNumber rationalNum = (RationalNumber) obj; //hmmm...

        double rNum1 = (double)numerator/denominator;
        double rNum2 = (double)rationalNum.getNumerator()/rationalNum.getDenominator();

        if (Math.abs(rNum1 - rNum2) < TOLERANCE)
            result = 0;
        else {
            if (rNum1 > rNum2)
                result= 1;
            else
                result= -1;
        }
        return result;
    }
}
