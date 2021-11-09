import domain.Purchaselotto;
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

public class LottoTest {


    private Purchaselotto purchaselotto;



    @Test
    void 문자열_정수형체크(){
        Assertions.assertEquals(1000,purchaselotto.checkOtherType("1000"));
    }

    @Test
    void 음수값체크(){
        Assertions.assertFalse(purchaselotto.checkMoney(-1));
    }

}