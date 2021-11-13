package view;

import domain.*;

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
     *      [] 당첨 번호 입력
     *      [] 보너브 볼 추가
     *      [] 중복 제거한 한줄 라인 보너스번호 길이
     *      [] 로또 맞춘 결과 출력
     */

    private static Lotto lotto;
    private static Lottos lottos;
    private static WinningNumbers winningNumbers;

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

    // [] 당첨 번호 입력
    public static void WinnerPrint(final String winner){
        System.out.println(new WinningNumbers(winner).getWintegerList());
    }

    // [] 보너스 볼 추가
    public static void BounusBall(final String bouns){
        int BounsNum=new BounusNumber(bouns).getBonusNum();

        System.out.println(winningNumbers.InsertBounsNum(BounsNum));
    }

    // [] 로또 맞춘 결과 출력
    public static void EndPrint(WinningNumbers winningNumbers){

        System.out.println("맞춘 로또입니다!"+lotto.oneLineResult(winningNumbers));
    }


}
