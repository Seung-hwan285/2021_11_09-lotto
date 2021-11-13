package domain;

import java.util.*;

public class LottoGenerator {

    /**  자동으로 로또 번호 구하기
     *
     *   [] 1~45 까지 로또번호 한줄 생성
     *   [] 로또 모든 번호 초기화 1~45
     *   [] 로또 한줄씩 출력 -> lineLottoOut()
     *   [] 로또는 총 6개 lottoList에서 뽑기 -> sixNumber()
     *   [] lottoList에 있는 값 미리  make로 초기화
     *   [] 로또 값 Lotto 클래스에 던져줄 메서드 -> generate()
     *   [] 한줄 출력 값 섞는 메서드 -> ShuffleLotto()
     *   [] lottoList에 한줄 값 섞는 메서드 -> resShffleLotto()
     *
     */
    private static final int MAX=45;
    private static final int MIN=0;

    private static List<Integer>res;

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

    // [] 한줄 출력 값 섞는 메서드
    public static void ShuffleLotto(List<Integer> resultLottoNumber){
        Collections.shuffle(resultLottoNumber);
    }

    // [] 로또 한줄씩 출력
    public static List<Integer> lineLottoOut(){

        List<Integer> resultLottoNumber=new ArrayList<>();

        for(int i=0; i<lottoList.size(); i++){
            resultLottoNumber.add(lottoList.get(i));
        }
        ShuffleLotto(resultLottoNumber);
        resShffleLotto(resultLottoNumber);
        return res;
    }

    // [] lottoList에 한줄 값 섞는 메서드 -> resShffleLotto()
    public static List<Integer> resShffleLotto(List<Integer> resultLottoNumber){
            res=sixNumber(resultLottoNumber);
            return res;
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
