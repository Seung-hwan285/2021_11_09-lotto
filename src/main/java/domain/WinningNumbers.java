package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class WinningNumbers {

    /**
     *    당첨 번호 입력받아 검증하는 클래스
     *
     *      [] 당첨번호 문자열로 입력받아오기 -> WinningNumbers()
     *
     *      [] 모든 예외 한번에 처리 하기 -> totalInputNumCheck()
     *
     *          - 중복숫자 예외
     *
     *          - 숫자외 다른 입력 예외 ->  checkInputOtherType()
     *
     *          - null값,빈값 예외 -> checkInputNull()
     *
     *          - 1~45 숫자 제한 예외 -> checkInputLimite()
     *
     *          - 문자열 -> 정수형 -> changeInput()
     *
     *
     */

    private List<Integer> wintegerList=new ArrayList<>();
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
    private List<Integer> totalInputNumCheck(String input) {
        List<String> splitNumbers=new ArrayList<>();
        List<Integer> numbersList=new ArrayList<>();

        String []win=input.split(",");
        for(int i=0; i<win.length; i++){
            splitNumbers.add(win[i]);
        }
        // 문자열 리스트 정수형 리스트로 변환
//        List<Integer> winngNumbers=splitNumbers.stream()
//                .map(Integer::new)
//                .collect(Collectors.toList());

        for(String s: splitNumbers){
            // 리스트 null값 , 1~45 숫자만 예외체크
            if(!checkInputNull(s) || !checkInputLimite(s))
            {
                throw new IllegalArgumentException("에러발생 ");
            }

            numbersList.add(Integer.parseInt(s));
        }


        return numbersList;
    }

    // - 숫자외 다른 입력 예외
    public static int checkInputOtherType(String input){
        try{
            // 문자열 -> 정수형 변환
            numbers=changeInput(input);
        }catch(Exception e){
            System.out.println("숫자 말고 다른 값이 들어옵니다.");
        }

        return numbers;

    }


    // - 중복숫자 예외
    public static void  checkisDuplicate(List<Integer> wintegerList){
        Set<Integer> numbers=new HashSet<>();

        if(numbers.size() != wintegerList.size()) {
            throw new RuntimeException("중복 숫자 입력");
        }

    }

    // - 1~45 숫자 제한 예외
    public static boolean checkInputLimite(String input){
        numbers=changeInput(input);

        if(numbers > MAX || numbers < MIN){
            return false;
        }
        return true;
    }



    // - 문자열 -> 정수형
    public static int changeInput(String input){
        return Integer.parseInt(input);
    }

    // - null값,빈값 예외
    public static boolean checkInputNull(String input){
        if(input == null || input.isEmpty()){
            return false;
        }
        return true;
    }

}
