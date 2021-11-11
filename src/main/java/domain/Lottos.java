package domain;

import java.util.ArrayList;
import java.util.List;

public class Lottos {

    /**
     *    구입 한 모든 로또 관리 클래스
     *
     *    [] 로또 한줄씩 받아서 저장할 생성자
     *       - count만큼 로또를 담아줘야함 (구매한 갯수)
     *
     *    [] 모든 로또 반환할 get 메서드
     *
     */


    // 모든 로또 리스트
    private List<Lotto> totallottos=new ArrayList<>();


    // [] 로또 한줄씩 받아서 저장할 생성자
    public Lottos(int count){
        List<Lotto> lottoList=new ArrayList<>();

        for(int i=0; i<count; i++){
            lottoList.add(LottoGenerator.generate());
        }
        this.totallottos=lottoList;
    }

    // [] 모든 로또 반환할 get 메서드
    public List<Lotto> getTotalLottoList(){
        return totallottos;
    }
}
