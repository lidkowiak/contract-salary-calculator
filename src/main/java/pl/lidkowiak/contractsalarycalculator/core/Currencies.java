package pl.lidkowiak.contractsalarycalculator.core;

import java.util.Currency;

public final class Currencies {

    public static final Currency PLN = Currency.getInstance("PLN");
    public static final Currency EUR = Currency.getInstance("EUR");
    public static final Currency GBP = Currency.getInstance("GBP");

    private Currencies() {
        throw new IllegalStateException();
    }

}
