package domain;

import java.util.ArrayList;
import java.util.List;

public class BounusNumber {
    /**
     *   보너스 볼 구현
     *     [] 생성자로 값 받아오기
     *        - 문자열 -> 정수로 변경
     *        - 0~46이하만 입력가능하게 예외
     *        - 숫자가 아닌 다른 타입 예외
     *        - 입력하지 않았을때 예외
     *
     */

    private final static int MAX=45;
    private final static int MIN=1;

    private  int BonusNum;
    private static int num;

    public int getBonusNum() {
        return BonusNum;
    }

    public BounusNumber(final String input){
        this.BonusNum=totalCheck(input);
    }


    public static int totalCheck(final String input){

        checkOtherTypeBonus(input);
        checkLimitNumber(num);

        return num;

    }

    private static  int changeInteger(final String input){
        return Integer.parseInt(input);
    }




    // - 1~45이하만 입력가능하게 예외
    public static int checkLimitNumber(final int input){

        if(input >MAX || input <MIN){
            throw new IllegalArgumentException("숫자값 맞춰주세요");
        }
        return input;
    }

    // - 숫자가 아닌 다른 타입 예외
    public static int checkOtherTypeBonus(final String input){
        try{
            num=changeInteger(input);

        }catch (RuntimeException e){
            throw new RuntimeException("숫자만 입력해주세요");
        }
        return num;
    }

}
