package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       App app = new App();

    }
}

class App{
    public void run(){

        Scanner s = new Scanner(System.in);

        System.out.println("--명언 앱--");
        System.out.print("명언 : ");
        s.nextLine(); // 입력값 가져옴. 입력값이 없으면 기다린다.
        System.out.print("작가 : ");
        s.nextLine();
        System.out.println("1번 명언이 등록되었습니다.");
        System.out.println("명령) 종료");
        }
}