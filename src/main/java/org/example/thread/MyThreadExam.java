package org.example.thread;

import javax.swing.table.TableRowSorter;

public class MyThreadExam {
    public static void main(String[] args) {
        String name = Thread.currentThread().getName();
        System.out.println("thread name : " + name);
        System.out.println("start!");

        MyThread mt1 = new MyThread("*");
        MyThread mt2 = new MyThread("+");

        // 3. thread는 start() 메서드로 실행한다.
        mt1.start(); // 이 부분에서 새로운 흐름이 생성됨
        mt2.start();

        System.out.println("end");
    }
}
