package org.example.vend;

public class KoreanMsg implements Msg{


    @Override
    public String insertCoin() {
        return "동전을 넣어주세요";
    }

    @Override
    public String choice() {
        return "메뉴를 선택해주세요";
    }

    @Override
    public String thanks() {
        return "이용해 주셔서 감사합니다.";
    }
}
