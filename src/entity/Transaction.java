package entity;

// id cardholder_name cardholder_surname start_time end_time amount type_of_payment
public class Transaction {

    private Id id;
    private CardHolder cardHolder;
    private TransactionTime time;
    private Amount amount;
    private String typeOfPayment;

    public void setId(Id id) {
        this.id = id;
    }

    public Id getId() {
        return this.id;
    }

    public CardHolder getCardHolder() {
        return cardHolder;
    }

    public void setCardHolder(CardHolder cardHolder) {
        this.cardHolder = cardHolder;
    }

    public TransactionTime getTime() {
        return time;
    }

    public void setTime(TransactionTime time) {
        this.time = time;
    }

    public Amount getAmount() {
        return amount;
    }

    public void setAmount(Amount amount) {
        this.amount = amount;
    }

    public String getTypeOfPayment() {
        return typeOfPayment;
    }

    public void setTypeOfPayment(String typeOfPayment) {
        this.typeOfPayment = typeOfPayment;
    }

    @Override
    public String toString() {
        return id.getId() + "." + " " + cardHolder.getName() + " " + cardHolder.getSurname() +
                " " + amount.getNumberAmount() + amount.getCurrency();
    }
}
