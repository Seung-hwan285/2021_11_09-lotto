package domain;

public class Purchaselotto {

    /**
     *  [] 사용자애게 구입 금액을 입력
     *    - 숫자가 아닌 다른 타입일경우 예외
     *    - 음수 또는 0을 입력했을때 예외
     *
     *  []  문자열 -> 정수형
     *  []  로또 구입 개수
     *  []  구입 금액 부족한지 확인
     *
     */


    // 수동으로 구매한 로또 가격
    private  static int Mymoney;

    // 로또 최소 구매매 가격
    private static final int lottoMoney=1000;



    public Purchaselotto(final String money){
        // 문자열 로또 구입금액 -> 정수형으로 변환
        int convertMoney=changeInteger(money);

        //음수값인지 검사
        if (checkMoney(convertMoney)){
            this.Mymoney=convertMoney;
        }
        // 구입 금액 초과 확인
        checkLottoMoneyLimit();

    }


    // - 숫자가 아닌 다른 타입일경우 예외
    public static int otherType(final String money){
        try{
            Mymoney=changeInteger(money);
        }
        catch(NumberFormatException e){
            System.out.println("숫자만 입력해주세요");
        }
        return Mymoney;
    }

    // []  문자열 -> 정수형
    private static int changeInteger(final String money){
        return Integer.parseInt(money);
    }

    // - 음수 또는 0을 입력했을때 예외
    public static boolean checkMoney(final int convertMoney){
        if(convertMoney<=0){
            throw new IllegalArgumentException("원입니다. 돈을 지불하세요!!");
        }
        return true;
    }

    // []  구입 금액 부족한지 확인
    public static void checkLottoMoneyLimit(){
        if(Mymoney <lottoMoney){
            System.out.println("최소"+lottoMoney+"원 이상 구입해야 합니다.");
        }
    }

    // []  로또 구입 개수
    public static int totalLottoCount(){
        return Mymoney/lottoMoney;
    }



}
