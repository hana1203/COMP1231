package array;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class SodaSurvey {
    public static void main(String[] args) {
        int[][] scores = {{3, 4, 5, 2, 1, 4, 3, 2, 4, 4},
                        {2, 4, 3, 4, 3, 3, 2, 1, 2, 2},
                        {3, 5, 4, 5, 5, 3, 2, 5, 5, 5},
                        {1, 1, 1, 3, 1, 2, 1, 3, 2, 4} };

        final int SODAS = scores.length; //4
        final int PEOPLE = scores[0].length; //10

        int[] sodaSum = new int[SODAS]; //4 배열
        int[] personSum = new int[PEOPLE]; //10 배열

        //Load the sum into new arrays
        for (int soda=0; soda<SODAS; soda++) {
            for (int person=0; person<PEOPLE; person++){
                sodaSum[soda] += scores[soda][person];
                personSum[person] += scores[soda][person];
                System.out.println(sodaSum[soda]);
            }
        }
        //sodaSum 배열에는 [32, 26, 42, 19]
        //personSum 배열에는 [9 14 13 14 10 12 8 11 13 15]

        System.out.println("Averages: \n");
        DecimalFormat fmt = new DecimalFormat("0.#");
        //Print Soda average scores
        for (int soda=0; soda<SODAS; soda++) {
            System.out.println("Soda#" + (soda+1) + ": "+ fmt.format((float)sodaSum[soda]/PEOPLE));
        }
        //Print Person average scores
        System.out.println();
        for (int person=0; person<PEOPLE; person++) {
            System.out.println("Person#" + (person+1)+ ": "+ fmt.format((float) personSum[person]/SODAS));
        }

    }
}
