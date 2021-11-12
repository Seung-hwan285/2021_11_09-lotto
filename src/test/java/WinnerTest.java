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




    @DisplayName("숫자가 아닌 입력값을 넣었을때 예외")
    @ParameterizedTest
    @ValueSource(strings = {"일","one","i"})
    void notNumbersTest(String input){
        assertThatThrownBy(()->new WinningNumbers(input))
                .hasMessage("숫자만 입력하시기 바랍니다");
    }


    @DisplayName("중복숫자 발견하면 예외")
    @ParameterizedTest
    @ValueSource(strings = {"1,1","1,2,4,5,1"})
    void isDuplicateTest(String input){
        assertThatThrownBy(()->new WinningNumbers(input))
                .hasMessage("중복 숫자 입력");
    }


    @DisplayName("null값 빈값 예외")
    @NullAndEmptySource
    @ParameterizedTest
    void nullOrEmptyTest(String input){
        assertThatThrownBy(()->new WinningNumbers(input))
                .hasMessage("null값 에러");
    }

    @DisplayName("1~45값 체크 예외")
    @ParameterizedTest
    @ValueSource(strings = {"0,46"})
    void limitTest(String input){
        assertThatThrownBy(()->new WinningNumbers(input))
                .hasMessage("1~45숫자만 입력해주세요");
    }


}
