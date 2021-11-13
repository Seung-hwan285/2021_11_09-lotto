import domain.BounusNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
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

public class BounsTest {


    @DisplayName("숫자말고 다른 타입")
    @ParameterizedTest
    @ValueSource(strings = {"i,이,]"})
    void otherTypeBounusTest(String input){
        assertThatThrownBy(()->new BounusNumber(input))
                .hasMessage("숫자만 입력해주세요");
    }

    @DisplayName("1~45값만 입력해주세요")
    @ParameterizedTest
    @ValueSource(ints = {0})
    void limitNumber(int input){
        String str=String.valueOf(input);
        assertThatThrownBy(()->new BounusNumber(str))
                .hasMessage("숫자값 맞춰주세요");
    }
}
