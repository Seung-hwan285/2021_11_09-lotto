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
import static org.junit.jupiter.api.Assertions.*;
public class LottoTest {


    private Purchaselotto purchaselotto;


    @Test
    void 로또truefalse테스트(){
        assertTrue(purchaselotto.checkMoney(1));
    }

    @Test
    void 로또변환테스트(){
        assertEquals(14,purchaselotto.otherType("14"));
    }


}