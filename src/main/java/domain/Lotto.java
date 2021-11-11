package domain;

import java.util.ArrayList;
import java.util.List;

public class Lotto {

    /**
     *    로또 한줄씩 받는 클래스
     *      [] 로또 한줄씩 받아오는 생성자
     *      [] 로도 한줄 반환하는 get메서드
     */

    private List<Integer> lottoList=new ArrayList<>();


    public Lotto(List<Integer> lottoList){
        this.lottoList=lottoList;
    }




    public List<Integer> getLotto(){
        return lottoList;
    }




}
