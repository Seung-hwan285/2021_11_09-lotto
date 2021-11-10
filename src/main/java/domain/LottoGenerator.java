package domain;

import java.util.*;

public class LottoGenerator {

    /** 자동으로 로또 번호 구하기
     * 1~45 까지 로또번호 한줄 생성
     * 1. 로또 모든 번호 초기화 1~45
     * 2. 한줄의 정보를 담아서 출력
     */
    private static final int MAX=45;
    private static final int MIN=0;

    private final static List<Integer> lottoList =new LinkedList<>();

    // 1. 로또 모든 번호 초기화
    public static List<Integer> make(){
        for(int i=MIN; i<=MAX; i++){
            lottoList.add(i);
        }
        Collections.shuffle(lottoList);
        return lottoList;
    }
    //
    public static List<Integer> lineLottoOut(List<Integer> lottoList){

        List<Integer> resultLottoNumber=new ArrayList<>();
        for(int i=0; i<6; i++){
            resultLottoNumber.add(lottoList.get(i));
        }

        return resultLottoNumber;
    }



}
