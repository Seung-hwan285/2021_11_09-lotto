package domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lotto {

    /**
     * 로또 한줄 정보를 담는 클래스
     */

    private List<Integer> numbers;

    Lotto(List<Integer> numbers){
        this.numbers=numbers;
    }

    public List<Integer> getNumbers(){
        return Collections.unmodifiableList(numbers);
    }


}
