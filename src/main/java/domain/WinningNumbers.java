package domain;

import java.util.ArrayList;
import java.util.List;

public class WinningNumbers {

    /**
     *    당첨 번호 입력받아 검증하는 클래스
     *
     *      [] 당첨번호 문자열로 입력받아오기 -> WinningNumbers()
     *
     *          - 중복숫자 예외
     *
     *          - 숫자외 다른 입력 예외
     *
     *          - null값,빈값 예외
     *
     *          - 1~45 숫자 제한 예외
     *
     *          - 문자열 -> 정수형 -> changeInput()
     *
     *
     */

    private List<Integer> wIntegerList=new ArrayList<>();
     static int numbers;
    // [] 당첨번호 문자열로 입력받아오기
    public WinningNumbers(String input){
        numbers=changeInput(input);
    }


    public static int changeInput(String input){
        return Integer.parseInt(input);
    }


}
