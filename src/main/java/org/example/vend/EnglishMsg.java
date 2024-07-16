package org.example.vend;

public class EnglishMsg implements Msg{
    @Override
    public String thanks() {
        return "Thanks for using";
    }

    @Override
    public String choice() {
        return "Choice your menu";
    }

    @Override
    public String insertCoin() {
        return "Insert coin";
    }
}
