import domain.LottoGenerator;
import domain.Purchaselotto;
import view.InputView;
import view.outputView;

public class Application {


    public static void main(String[] args) {

        InputView inputView=new InputView();
        outputView out=new outputView();
        LottoGenerator lottoGenerator=new LottoGenerator();
        out.startPrint();
        String str=inputView.InputUser();

        Purchaselotto purchaselotto=new Purchaselotto(str);
        int count=purchaselotto.totalLottoCount();
        out.lottoCount(count);

        out.lottoLinePrint(lottoGenerator.make());


    }
}
