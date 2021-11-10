import domain.Purchaselotto;
import view.InputView;
import view.outputView;

public class Application {


    public static void main(String[] args) {

        InputView inputView=new InputView();
        outputView out=new outputView();

        out.startPrint();
        String str=inputView.InputUser();

        Purchaselotto purchaselotto=new Purchaselotto(str);

        out.lottoCount(purchaselotto.totalLottoCount());
    }
}
