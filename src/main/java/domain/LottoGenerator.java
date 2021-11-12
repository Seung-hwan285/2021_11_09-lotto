package domain;

import java.util.*;

public class LottoGenerator {

    /**  자동으로 로또 번호 구하기
     *
     *   [] 1~45 까지 로또번호 한줄 생성
     *   [] 로또 모든 번호 초기화 1~45
     *   [] 로또 한줄씩 출력
     *   [] 로또는 총 6개 lottoList에서 뽑기
     *   [] lottoList에 있는 값 미리  make로 초기화
     *   [] 로또 값 Lotto 클래스에 던져줄 메서드
     *   [] 모든 로또 저장할 메서드
     */
    private static final int MAX=45;
    private static final int MIN=0;

    private static  List<Integer> lottoList =new LinkedList<>();

    // [] 로또 Lotto 클래스에 던져줄 메서드
    public static Lotto generate(){

        return new Lotto(lineLottoOut());
    }

    // [] 로또 모든 번호 초기화 1~45
    public static List<Integer> make(){
        for(int i=MIN; i<=MAX; i++){
            lottoList.add(i);
        }

        return lottoList;
    }

    // [] lottoList에 있는 값 미리  make로 초기화
    static {
        lottoList=make();
    }

    // [] 로또 한줄씩 출력
    public static List<Integer> lineLottoOut(){

        List<Integer> resultLottoNumber=new ArrayList<>();

        for(int i=0; i<lottoList.size(); i++){
            resultLottoNumber.add(lottoList.get(i));
        }

//        Collections.shuffle(resultLottoNumber);
//        List<Integer> res=sixNumber(resultLottoNumber);
        return resultLottoNumber;
    }

    // [] 로또는 총 6개 lottoList에서 뽑기
    public static List<Integer> sixNumber(List<Integer> resultLottoNumber){
        List<Integer> result=new ArrayList<>();

        for(int i=0; i<6; i++){

            result.add(resultLottoNumber.get(i));
        }
        return result;
    }


}
