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
    void changeInt(){
        assertEquals(123,winningNumbers.changeInput("123"));
    }

    @Test
    @DisplayName("빈값_Null체크")
    void nullOrEmpty(){
        assertFalse(winningNumbers.checkInputNull(""));
        assertFalse(winningNumbers.checkInputNull(null));
    }

    @Test
    @DisplayName("1~45제한체크")
    void limitNumber(){
        assertFalse(winningNumbers.checkInputLimite("46"));
    }


}
