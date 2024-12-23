package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       App app = new App();
        app.run();
    }
}

class App {
    public void run() {

        Scanner s = new Scanner(System.in);

        System.out.print("명언 : ");
        s.nextLine(); // 입력값 가져옴. 입력값이 없으면 기다린다. 엔터를 쳐야 입력이 완료됨. 그래야 넘어감
        System.out.print("작가 : ");
        s.nextLine();
        System.out.println("1번 명언이 등록되었습니다.");
        System.out.println("명령) 종료");
        while (true) {
            System.out.print("명령) ");
            String command = s.nextLine();
            if (command.equals("등록")) {
                System.out.print("명언 : ");
                s.nextLine(); // 입력값 가져옴. 입력값이 없으면 기다린다. 엔터를 쳐야 입력이 완료됨. 그래야 넘어감
                System.out.print("작가 : ");
                s.nextLine();

                System.out.println("1번 명언이 등록되었습니다.");
            }
        }
    }
}