package domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {

    /**
     *    로또 한줄씩 받는 클래스
     *      [] 로또 한줄씩 받아오는 생성자
     *      [] 로도 한줄 반환하는 get메서드 -> getLotto()
     *      [] 로또 한줄과 당첨번호 비교해서 비교 결과 반환 -> oneLineResult()
     *      [] 맞춘 로또 없을때 예외
     *
     *
     */

    private static List<Integer> lottoList=new ArrayList<>();

    // 로또 번호 같은 값 출력
    private static List<Integer> result=new ArrayList<>();

    // 당첨번호 클래스
    private WinningNumbers winningNumbers;

    public Lotto(List<Integer> lottoList){
        this.lottoList=lottoList;
    }


    public List<Integer> getLotto(){
        return lottoList;
    }


    // [] 로또 한줄과 당첨번호 비교해서 비교 결과 반환
    public static List<Integer> oneLineResult(WinningNumbers winningNumbers){
        for(int lottoNum: lottoList){
            for(int winningNum: winningNumbers.getWintegerList()){
                if(lottoNum ==winningNum){
                    result.add(winningNum);
                }
            }
        }
        NotoneLineResult(result);
        return result;
    }



    // [] 맞춘 로또 없을때 예외
    public static void NotoneLineResult(List<Integer> oneLineResult){
        if(oneLineResult.isEmpty()){
            System.out.println("맞춘 로또가 없습니다. 다음에 도전하세요!!");
            throw new IllegalArgumentException("Not Result");
        }
    }

}
