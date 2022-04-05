package array.p5;

public class StandardDeviation {
    public static void main(String[] args) {
        int[] x = {10,20,30,40,50};
        int sum=0;
        for (int i=0; i<x.length; i++) {
            sum += x[i];
        }
        int mean = sum/x.length;
        System.out.println(mean);

        double sumOfStandard =0;
        double standardDeviation;
        for (int i=0; i<x.length; i++) {
            sumOfStandard += Math.pow(x[i] - mean, 2);
        }
        System.out.println(sumOfStandard);
        standardDeviation = Math.sqrt(sumOfStandard/(x.length-1));
        System.out.println(standardDeviation);

    }
}
