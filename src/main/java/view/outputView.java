package view;

import domain.LottoGenerator;

import java.util.List;

public class outputView {
    // 구입 금액
    public void startPrint(){
        System.out.println("구입 금액을 입력해주세요");
    }



    // 로또 개수 출력
    public void lottoCount(int lottoCnt){
        System.out.println(lottoCnt+"개 구매했습니다.");
    }

    public void lottoLinePrint(List<Integer> lottoList){
        System.out.println("로또 자동생성 출력");
        System.out.println(new LottoGenerator().lineLottoOut(lottoList));
    }

}
