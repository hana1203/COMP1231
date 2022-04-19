package exception;
import java.util.Scanner;

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
        TRL2k74A5R-11 //parseInt 의 substring 이 integer 없을때 NumberFormat 에러
        TRV2105A2 //CharAt 이나 parseInt 의 substring 메서드 StringIndexOutofBounds 오류
        TRQ2778A7R-19 //banned
         */

        while (!code.equals("STOP")) {
            try {
                zone = code.charAt(9);
                district = Integer.parseInt(code.substring(3,7));
                valid++;
                if (zone == 'R' && district >2000)
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
