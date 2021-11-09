package domain;

public class Purchaselotto {

    /**
     *  사용자애게 구입 금액을 입력받기
     *  1. 숫자가 아닌 다른 타입일경우 예외
     *  2. 음수 또는 0을 입력했을때 예외
     *  3.  문자열 -> 정수형
     */


    private static final int lottoPrice= 1000;
    private static int moneyInt;
    private int Mymoney;


    public Purchaselotto(String money){
        int convertInput=checkOtherType(money);

        if(checkMoney(convertInput)){
            this.Mymoney=convertInput;
        }
    }

    // 3. 문자열 -> 정수형
    public static int changeInteger(String money){
        return Integer.parseInt(money);
    }


    // 2. 음수값 체크
    public static boolean checkMoney(int convertInput){

        if(convertInput <=0){
            System.out.println("돈을 지불하세요!");
            return false;
        }
        return true;
    }

    // 1. 숫자가 아닌 다른 타입일 경우
    public static int checkOtherType(String money){

        try{
            moneyInt=changeInteger(money);
        }
        catch (NumberFormatException e){
            System.out.println("정수형만 들어올 수 있습니다.");
        }
        return moneyInt;
    }


    public int getMymoney() {
        return Mymoney;
    }
}
