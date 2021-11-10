package view;

import java.util.Scanner;

public class InputView {

    /**
     * 콘솔에서 사용자 입력
     */


    private static final Scanner sc=new Scanner(System.in);

    public String InputUser(){
        return sc.nextLine();
    }
}
