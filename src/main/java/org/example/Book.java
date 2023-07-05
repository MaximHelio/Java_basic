package org.example;
/**
 * 책 한권의 정보를 담기 위한 클래스
 * @author urstory(<a href="mailto:urstory@gmail.com">김성박</a>)
 * @since 2022.03
 * @version 0.1
 * */
public class Book {
    private String title;
    private int price; //field price

    // 필드 값을 수정하고, 얻기 위한 메서드를 만든다. setter, getter
    // setter, getter - 프로퍼티(property) - price 프로퍼티
    public int getPrice(){
        return this.price * 2; // this는 내 자신 인스턴스를 참조하는 예약어
    }

    public void setPrice(int price) {
        this.price = price;
    }

    /**
     * 책의 제목을 반환한다.
     * @return 책의 제목
     */
    public String getName() {
        return title;
    }

    public void setName(String title){
        this.title = title;
    }
}
