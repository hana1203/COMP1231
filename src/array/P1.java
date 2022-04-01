package array;

import java.util.Scanner;
//아무런 숫자 받는 프로그램인데 0부터 50까지 숫자가 몇개 들어있는지 세기
public class P1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //array 활용해서 짜보기
        int[] numberArray = new int[10];
        System.out.println(numberArray);
        int count = 0;
        for(int i = 0; i< numberArray.length; i++) {
            numberArray[i] = scan.nextInt();
            if (numberArray[i] >=0 && numberArray[i] <=50) {
                count++;
            }
            System.out.println(numberArray[i]);
        }
        System.out.println(count);

//        int i =0;
//        while (i<10) {
//            System.out.println("Enter an arbitrary number: ");
//            int number = scan.nextInt();
//            if (number>=0 && number <51) {
//                count++;
//            }
//            i++;
//        }
//        System.out.println("occurences: "+count);
    }
}
