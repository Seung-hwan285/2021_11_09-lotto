package view;

import domain.Lotto;
import domain.LottoGenerator;
import domain.Lottos;
import domain.Purchaselotto;

import java.util.ArrayList;
import java.util.List;

public class outputView {


    /**
     *  콘솔 출력
     *      [] 구입 금액
     *      [] 로또 개수 출력
     *      [] 로또 한줄 출력
     *          - LottoGenerator에 generate메서드 부르는 출력 따로 만들기 (그래야 값이 들어옴)
     *
     *      [] 구입한 모든 로또 출력
     *
     */

    private static Lotto lotto;
    private static Lottos lottos;

    // [] 구입 금액
    public void startPrint(){
        System.out.println("구입 금액을 입력해주세요");
    }

    // [] 로또 개수 출력
    public static void lottoCount(int lottoCnt){
        System.out.println(lottoCnt+"개 구매했습니다.");
    }



    // [] 로또 한줄 출력 (한줄 로또)
    //   - LottoGenerator에 generate메서드 부르는 출력 따로 만들기 (그래야 값이 들어옴)
    public static void lottoOneLine(){

        lotto = new LottoGenerator().generate();
        System.out.println("로또 자동 생성");

        List<Integer> one=lotto.getLotto();

        for(Integer i: one){
            System.out.println(i);
        }
    }

    // [] 로또 한줄 출력 (모든 로또)
    public static void lottoOneLineTotal(Lotto lottos){
        lottos=new LottoGenerator().generate();
        System.out.println("로또 생성");

        List<Integer> total=lottos.getLotto();

        for(Integer i: total){
            System.out.println(i);
        }
    }

    //  [] 구입한 모든 로또 출력
    public static void lottoTotalLine(Lottos lottos){
        // lottoList한테 모든 로또 전달해주기
        List<Lotto> lottoList=lottos.getTotalLottoList();

        for(Lotto lotto: lottoList){
            lottoOneLineTotal(lotto);
        }

    }


}
