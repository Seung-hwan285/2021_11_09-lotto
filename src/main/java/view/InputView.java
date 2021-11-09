package view;

import java.util.Scanner;

public class InputView {


    private static final Scanner sc=new Scanner(System.in);


    public static String input(){
        System.out.println("구입 금액을 입력하세요");
        return sc.nextLine();
    }
}
