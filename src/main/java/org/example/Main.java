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
        int lastNo = 0;
        String content = "";
        String author = "";

        while (true) {
            System.out.print("명령) ");
            String command = s.nextLine();
            if(command.equals("종료")) {
                System.out.print("명언 앱을 종료합니다.");
                break;
            } else if (command.equals("등록")){
                System.out.print("명언 : ");
                content = s.nextLine();

                System.out.print("작가 : ");
                author = s.nextLine();


                /*formatted
                String 클래스의 기본 메서드로 Cpp의 서식문자 삽입과 같이 동작함
                String.formmated(arr1,arr2,arr3)
                - 서식문자 순서대로 arr1, arr2, arr3에 대응됨

                */
                System.out.println("%d번 명령이 등록되었습니다.".formatted(++lastNo));
            }  else if(command.equals("목록")) {
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------");
                System.out.println("%d / %s / %s".formatted(lastNo, author, content));
            }
        }
    }
}