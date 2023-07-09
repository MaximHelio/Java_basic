package org.example.thread;

// 1. Thread 클래스를 상속받는다
public class MyThread extends Thread{
    private String str;
    public MyThread(String str) {
        this.str = str;
    }
    // 2. run() 메서드를 오버라이딩한다.
    //    동시에 실행시키고싶은 코드를 작성한다.
    @Override
    public void run() {
        // 1초마다 *를 10번 출력하는 프로그램을 작성하시오.
        for (int i = 0; i < 10; i++) {
            System.out.println("*");
            try {
                Thread.sleep(1000); // 1초간 쉰다
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }   // for

        // 1초마다 +를 10번 출력하는 프로그램을 작성하시오.
        for (int i = 0; i < 10; i++) {
            System.out.println("+");
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
