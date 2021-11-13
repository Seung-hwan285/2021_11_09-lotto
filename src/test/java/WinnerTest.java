import domain.Lotto;
import domain.LottoGenerator;
import domain.Purchaselotto;
import domain.WinningNumbers;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import view.InputView;

import java.awt.*;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;
import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class WinnerTest {

    private InputView inputView;
    private WinningNumbers winningNumbers;

    @Test
    @DisplayName("문자열 -> 정수형")
    void changeIntTest(){
        assertEquals(123,winningNumbers.changeInput("123"));
    }
    


    @DisplayName("숫자말고 다른 값 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"일,i,|"})
    void otherTypeTest(String input){

        assertThatThrownBy(()->new WinningNumbers(input))
                .hasMessage("숫자말고 다른 값 들어옵니다.");
    }

    @DisplayName("중복 값 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"3,3"})
    void isDuplcateTest(String input){
        assertThatThrownBy(()->new WinningNumbers(input))
                .hasMessage("중복 숫자가 있습니다");
    }

    @DisplayName("1~45 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"0,46"})
    void limitNumber(String input){
        assertThatThrownBy(()->new WinningNumbers(input))
                .hasMessage("1~45숫자만 입력해주세요");
    }



}
