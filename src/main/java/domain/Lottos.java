package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Lottos {

    /**
     * 구입한 모든 로또를 여기서 관리
     */
    private  List<Lotto> lottos;

    public Lottos(int count){
        List<Lotto> lottoList=new ArrayList<>();
        for(int i=0; i<count; i++){
            lottoList.add(LottoGenerator.generate()) ;
        }
        this.lottos=lottoList;
    }

    public List<Lotto> getLottos(){
        return Collections.unmodifiableList(lottos);
    }

}
