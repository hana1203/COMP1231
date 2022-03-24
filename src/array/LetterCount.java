package array;

import java.util.Scanner;

public class LetterCount {
    public static void main(String[] args) {
        final int NUMCHARS = 26;

        int[] upper = new int[NUMCHARS];
        int[] lower = new int[NUMCHARS];

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String line = scan.nextLine();

        char currentChar;
        int other =0;

        for (int index = 0; index < line.length(); index++) {
            currentChar = line.charAt(index);
//            System.out.println(currentChar);
            if (currentChar >= 'A' && currentChar <= 'Z')
                upper[currentChar-'A']++;//대체 이게 무슨 역할하는 코드?
            //A = 65 값을 가지기때문에 만약 currentChar 이 'E' 라면 69값 가진다.
            //E 문자에 대해서는 upper array 에 4의 값 저장한다.
            else
                if (currentChar >= 'a' && currentChar <= 'z')
                    lower[currentChar-'a']++;
                else other++; //대문자도 소문자도 아닐때
        }

        for (int letter = 0; letter < upper.length; letter++) {
            System.out.print((char)(letter+'A')+": ");
            System.out.print(upper[letter]);
            System.out.print("\t\t"+ (char)(letter+'a')+": ");
            System.out.println(lower[letter]);
        }
        System.out.println();
        System.out.println("Other non-alphabetic characters: "+other);
    }

}
