package org.example.vend;

public class GermanMsg implements Msg{

    @Override
    public String insertCoin() {
        return "Per favore inserisci una moneta";
    }

    @Override
    public String choice() {
        return "Seleziona un menu";
    }

    @Override
    public String thanks() {
        return "Grazie per averlo usato";
    }
}
