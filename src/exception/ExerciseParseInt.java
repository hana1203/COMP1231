package exception;

public class ExerciseParseInt {
    public static void main(String[] args) {
        String code = "KE1808";
        String codeNumber = code.substring(2,6); //String 형의 숫자
        System.out.println(codeNumber); //1808 문자형
//        Integer.parseInt(code); //Exception in thread "main" java.lang.NumberFormatException
        System.out.println(Integer.parseInt(codeNumber)); //1808 정수형

//        code.substring(7,8); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException
//        code.charAt(8); //Exception in thread "main" java.lang.StringIndexOutOfBoundsException

    }
}
