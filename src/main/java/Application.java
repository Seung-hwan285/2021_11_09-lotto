import domain.Purchaselotto;
import view.InputView;

public class Application {


    public static void main(String[] args) {

        InputView inputView=new InputView();
        String money=inputView.input();
        Purchaselotto purchaselotto=new Purchaselotto(money);

        System.out.println(purchaselotto.getMymoney());
    }
}
