import domain.Lotto;
import domain.LottoGenerator;
import domain.Purchaselotto;
import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

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
import static org.junit.jupiter.api.Assertions.*;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
public class LottoTest {


    private Purchaselotto purchaselotto;
    private LottoGenerator lottoGenerator;


    @Test
    void 로또truefalse(){
        assertTrue(purchaselotto.checkMoney(1));
    }

    @Test
    void 로또변환(){
        assertEquals(14,purchaselotto.otherType("14"));
    }


    @Test
    void 로또6개씩뽑기(){

        List<Integer> arr=Arrays.asList(1,2,3,4,5,6);
        List<Integer> testArr=Arrays.asList(1,2,3,4,5,6,7,8);
        assertEquals(arr,lottoGenerator.sixNumber(testArr));
    }

    @Test
    void 로또_초기화테스트(){
        System.out.println(lottoGenerator.make());
    }


    @DisplayName("로또 맞춘 번호 없으면 예외")
    @EmptySource
    @ParameterizedTest
    void notResultTest(List<Integer>lottoList){
        assertThatThrownBy(()->new Lotto(lottoList).NotoneLineResult(lottoList))
                .hasMessage("Not Result");
    }
}