package entity;

public class Amount {

    private String currency;
    private double numberAmount;

    public Amount(String currency, double numberAmount) {
        this.currency = currency;
        this.numberAmount = numberAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public double getNumberAmount() {
        return numberAmount;
    }
}
