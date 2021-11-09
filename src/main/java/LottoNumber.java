import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LottoNumber {

/**
 *  지켜야할것!
 *  1. 메서드는 한가지 역활만
 *  2. depth 길이 1단계만
 *  3. else문 사용 x
 *  4. 메소드라인 10라인 넘지않게
 *
 *  vo 생성자를 통해서만 값을 받아줘야함 -> 불변객체(수정자가 없어야한다 setter)
 *
 *
 *  - 값 1부터 45까지 값 넣고
 *  - 생성자로 값 넣기
 *  - 예외처리 1미만 ,45이상이면 아웃
 *  - 모든 매개변수 final 사용
 */

    private static final int MAX = 45;
    private static final int MIN=0;
    private int number;

    private static final List<Integer> arr=new ArrayList<>();
    private static final List<LottoNumber> LottoArr=new ArrayList<>();

    // - 1~45 넣어주기
    private static void InputLotto(){
        for(int i=MIN; i<=MAX; i++){

            // 배열 0부터 시작하니 -1 해줘서 값 일치하게
            arr.add(i);
            LottoArr.add(new LottoNumber(i));
        }
    }

    // 로또 번호 생성
    public static int makearr(final int number){

        if (!checkInputLotto(number)){
            throw new IllegalArgumentException("해당숫자는 1~45 범위에 맞지 않습니다.");
        }
        InputLotto();
        return arr.get(number);
    }

    // 로또 번호 생성 
    public static LottoNumber makeLottoNo(final int number){
        if(!checkInputLotto(number)){
            throw new IllegalArgumentException("해당숫자는 1~45 범위 맞지 않습니다");

        }
        InputLotto();
        return LottoArr.get(number);
    }

    // - 생성자로 값 받기 vo
    public LottoNumber(final int number){
        this.number=number;
    }

    // 예외처리
    private static boolean checkInputLotto(final int number){
        if(number < MIN || number > MAX){
            return false;
        }
        return true;
    }


    // 속성 값 반환
    public int getNumber(){
        return number;
    }



    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        final LottoNumber lottoNo = (LottoNumber) o;
        return number == lottoNo.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }


}
