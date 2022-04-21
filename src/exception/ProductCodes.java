package exception;
import java.util.Scanner;

//Demonstrates the use of try-catch block.
public class ProductCodes {

    // Counts the number of product codes that are entered
    // with a zone of R and district greater than 2000.
    public static void main(String[] args) {
        String code;
        char zone;
        int district, valid = 0, banned =0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter product code (STOP to quit): ");
        code = scan.nextLine();
        //testing code
        /*
        TRV2475A5R-14 //banned
        TRD1704A7R-12 //normal
        TRL2k74A5R-11 //parseInt() or substring() 메서드에 integer 포함하지 않을때 NumberFormat 에러
        TRV2105A2 //CharAt() or substring() 메서드에서 인덱스 범위 벗어나면 StringIndexOutofBounds 오류
        TRQ2778A7R-19 //banned
         */

        //사용자 입력받는 code 가 STOP 될때까지 반복.
        while (!code.equals("STOP")) {
            //pull out the zone, district info, and determine whether it represents a banned product code.
            try {
                zone = code.charAt(9);
                district = Integer.parseInt(code.substring(3,7));//3번째부터 6번째 문자까지 자르고 숫자로 된 문자형을 Integer 형으로 반환
                //parseInt() 는 String 타입의 숫자를 int 타입으로 변환해줌. 매개변수에는 String 문자열이 무조건 숫자로만 이뤄져있어야 함
                valid++;
                if (zone == 'R' && district >2000) //zone 이 R 이고 district 값이 2000 초과여야지 banned 된 코드
                    banned++;
            } catch (NumberFormatException e) {
                System.out.println("District is not numeric: "+code);
            } catch (StringIndexOutOfBoundsException e) {
                System.out.println("Improper code length: "+code);
            }

            System.out.println("Enter product code (STOP to quit): ");
            code = scan.nextLine();
        }

        System.out.println("valid codes entered "+valid);
        System.out.println("banned codes entered: "+banned);

    }
}
