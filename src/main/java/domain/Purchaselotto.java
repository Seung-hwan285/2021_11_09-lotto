package domain;

public class Purchaselotto {

    /**
     *  사용자애게 구입 금액을 입력받기
     *  1. 숫자가 아닌 다른 타입일경우 예외
     *  2. 음수 또는 0을 입력했을때 예외
     *  3.  문자열 -> 정수형
     */

    private  static int Mymoney;


    public Purchaselotto(String money){
        int convertMoney=changeInteger(money);
        if (checkMoney(convertMoney)){

            this.Mymoney=convertMoney;
        }

    }

    //1. 숫자가 아닌 다른 타입일
    public static int otherType(String money){
        try{
            Mymoney=changeInteger(money);
        }catch(NumberFormatException e){
            System.out.println("숫자만 입력해주세요");
        }
        return Mymoney;
    }

    //3.  문자열 -> 정수형
    private static int changeInteger(String money){
        return Integer.parseInt(money);
    }

    //2. 음수값 또는 0을 입력했을때 예외
    public static boolean checkMoney(int convertMoney){
        if(convertMoney<=0){
            throw new IllegalArgumentException("원입니다. 돈을 지불하세요!!");
        }
        return true;
    }




}
