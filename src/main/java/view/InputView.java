package view;

import java.util.Scanner;

public class InputView {

    /**
     *    콘솔에서 사용자 입력
     *       [] 구입 금액 입력
     *       [] 당첨 번호 입력
     */

    private static final Scanner sc=new Scanner(System.in);

    // [] 구입 금액 입력
    public String InputUser(){
        System.out.println("구입 금액을 입력해주세요");
        return sc.nextLine();
    }

    // [] 당첨 번호 입력
    public String InputWinNumber(){
        System.out.println("당첨 번호를 입력해주세요");
        return sc.nextLine();
    }
}
