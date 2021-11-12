import domain.Lotto;
import domain.Lottos;
import domain.Purchaselotto;
import domain.WinningNumbers;
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
         *    [] 모든 로또 출력하는 메서드
         */
        InputView inputView=new InputView();
        String str=inputView.InputUser();
        Purchaselotto purchaselotto=new Purchaselotto(str);
        outputView outputView=new outputView();

        // [] 몇개 구매했는지 갯수
        int locount=purchaselotto.totalLottoCount();
        // [] 갯수 출력
        outputView.lottoCount(locount);


        // 여기서 값이 안들어오고 있음 -> 값 호출을 안하고 출력해서 nullpointException 터지는중
        // 한줄 출력
//        outputView.lottoOneLine();

        // [] Lottos 객체 (갯수)
        Lottos lottos=new Lottos(locount);

        // [] 모든 로또 출력하는 메서드
        outputView.lottoTotalLine(lottos);


        String Winner=inputView.InputWinNumber();

        WinningNumbers winningNumbers1=new WinningNumbers(Winner);


        outputView.WinnerPrint(Winner);


    }
}
