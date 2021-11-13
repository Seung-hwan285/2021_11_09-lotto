package domain;

import java.util.*;
import java.util.stream.Collectors;

public class WinningNumbers {

    /**
     *    당첨 번호 입력받아 검증하는 클래스
     *
     *      [] 당첨번호 문자열로 입력받아오기 -> WinningNumbers()
     *
     *      [] 모든 예외 한번에 처리 하기 -> totalInputNumCheck()
     *
     *          - 중복숫자 예외 -> checkisDuplicate()
     *
     *          - 숫자외 다른 입력 예외 ->  checkInputOtherType()
     *
     *          - null값,빈값 예외 -> checkInputNull()
     *
     *          - 1~45 숫자 제한 예외 -> checkInputLimite()
     *
     *          - 문자열 -> 정수형 -> changeInput()
     *
     *      [] 보너스볼 추가
     *
     *
     */

    private static List<Integer> wintegerList=new ArrayList<>();
    private static final int MAX=45;
    private static final int MIN=1;
    private static int numbers;


    // [] 당첨번호 문자열로 입력받아오기
    public WinningNumbers(String input){
        this.wintegerList=totalInputNumCheck(input);
    }

    public List<Integer> getWintegerList() {
        return wintegerList;
    }

    // [] 모든 예외 한번에 처리 하기
    public  static List<Integer> totalInputNumCheck(String input){

        List<String> splitNumber=new ArrayList<>();
        List<Integer> integerList=new ArrayList<>();
        String[] str=input.split(",");

        for(int i=0; i<str.length; i++){
            splitNumber.add(str[i]);
        }

        //문자열 리스트 체크
        checkOtherType(splitNumber);
        //중복체크
        checkisDuplicate(splitNumber);


        for(String s:  splitNumber){

            // 1~45 체크
            checkInputLimite(s);


            integerList.add(Integer.parseInt(s));
        }
        return integerList;

    }


    // - 숫자외 다른 입력 예외
    public static void checkOtherType(List<String> input){

        try {
            input.stream()
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        }catch (RuntimeException e) {
            throw new RuntimeException("숫자말고 다른 값 들어옵니다.");
        }

    }




    // - 중복숫자 예외
    public static void checkisDuplicate(List<String> splitNumber) {
        Set<String> stringSet=new HashSet<>(splitNumber);

        if(stringSet.size() != splitNumber.size()){
            throw new IllegalArgumentException("중복 숫자가 있습니다");
        }
    }


    // - 1~45 숫자 제한 예외
    public static void checkInputLimite(String input){
        numbers=changeInput(input);

        if(numbers > MAX || numbers < MIN){
           throw new IllegalArgumentException("1~45숫자만 입력해주세요");
        }

    }

    // - 문자열 -> 정수형
    public static int changeInput(String input){
        return Integer.parseInt(input);
    }


    // [] 보너스볼 추가
    public static List<Integer> InsertBounsNum(int BounsNum){
        wintegerList.add(BounsNum);

        return wintegerList;
    }


}
