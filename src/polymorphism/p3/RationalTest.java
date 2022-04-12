package polymorphism.p3;

public class RationalTest {
    //-----------------------------------------------------------------
    //  Creates some rational number objects and performs various
    //  operations on them.
    //-----------------------------------------------------------------
    public static void main(String[] args) {
        RationalNumber r1 = new RationalNumber(6, 8);
        RationalNumber r2 = new RationalNumber(1, 3);
//        RationalNumber r3, r4, r5, r6, r7;
//        System.out.println("First rational number: " + r1);
//        System.out.println("Second rational number: " + r2);
//        if (r1.isLike(r2))
//            System.out.println("r1 and r2 are equal.");
//        else
//            System.out.println("r1 and r2 are NOT equal.");
//        r3 = r1.reciprocal();
//        System.out.println("The reciprocal of r1 is: " + r3);
//        r4 = r1.add(r2);
//        r5 = r1.subtract(r2);
//        r6 = r1.multiply(r2);
//        r7 = r1.divide(r2);
//        System.out.println("r1 + r2: " + r4);
//        System.out.println("r1 - r2: " + r5);
//        System.out.println("r1 * r2: " + r6);
//        System.out.println("r1 / r2: " + r7);

        double compareValue = r1.compareTo(r2);
        System.out.println("1st rational number: "+r1);
        System.out.println("2nd rational number: "+r2);
        if (compareValue == 0)
            System.out.println("r1 and r2 are equal");
        else if (compareValue ==1)
            System.out.println("r1 is greater than r2");
        else
            System.out.println("r1 is less than r2");

        RationalNumber r3 = new RationalNumber(3,5);
        RationalNumber r4 = new RationalNumber(7,9);
        System.out.println("3rd rational number: "+r3);
        System.out.println("4th rational number: "+r4);
        double compareValue2 = r3.compareTo(r4);
        if (compareValue2 == 0)
            System.out.println("r3 and r4 are equal");
        else if (compareValue2 ==1)
            System.out.println("r3 is greater than r4");
        else
            System.out.println("r3 is less than r4");


    }
}

