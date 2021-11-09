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

    private LottoNumber lottoNumber;



    @Test
    void 생성(){
        Assertions.assertEquals(14,lottoNumber.makearr(14));

    }

    @Test
    void 속성_일치테스트(){
        int number=lottoNumber.makeLottoNoCollection(14).getNumber();
        System.out.println(number);
        Assertions.assertEquals(14,number);

    }



    @Test
    void 유효값_테스트(){
        Assertions.assertThrows(IllegalArgumentException.class, ()->lottoNumber.makearr(50));
    }



}
