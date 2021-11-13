
import domain.*;
import view.InputView;
import view.outputView;

public class Application {

    public static void main(String[] args) {

        /**
         *  로또전체 콘솔 담당
         *    [] 돈 입력
         *    [] 몇개 구매했는지 갯수
         *    [] 갯수 출력
         *    [] Lottos 객체 (갯수)
         *    [] 보너스 넘버 입력
         *    [] 모든 로또 출력하는 메서드
         *    [] 당첨 번호 입력
         */

        InputView inputView=new InputView();
        String str=inputView.InputUser();
        // DIP 리펙토링
        LottoStore purchaselotto=new Purchaselotto(str);
        outputView outputView=new outputView();

        // [] 몇개 구매했는지 갯수
        int locount= ((Purchaselotto) purchaselotto).totalLottoCount();
        // [] 갯수 출력
        outputView.lottoCount(locount);


//        outputView.lottoOneLine();

        // [] Lottos 객체 (갯수)
        Lottos lottos=new Lottos(locount);


        // [] 모든 로또 출력하는 메서드
        outputView.lottoTotalLine(lottos);


        // [] 당첨 번호 입력
        String Winner=inputView.InputWinNumber();


        // DIP 리펙토링
        LottoStore winningNumbers1=new WinningNumbers(Winner);


        outputView.WinnerPrint(Winner);


        // [] 보너스 넘버 입력
        String bounus=inputView.InputBounus();


        // DIP 리펙토링
        LottoStore bonusNumber=new BounusNumber(bounus);

        outputView.BounusBall(bounus);


        // [] 모든 로또 출력하는 메서드
        outputView.EndPrint((WinningNumbers) winningNumbers1);


    }
}
