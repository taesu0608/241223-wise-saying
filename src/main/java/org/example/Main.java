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

        while (true) {
            System.out.print("명령) ");
            String command = s.nextLine();
            if(command.equals("종료")) {
                System.out.print("명언 앱을 종료합니다.");
                break;
            } else if (command.equals("등록")){
                System.out.print("명언 : ");
                s.nextLine();
            }
        }
    }
}